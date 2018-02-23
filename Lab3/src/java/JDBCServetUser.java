/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.driver.OracleDriver;

/**
 *
 * @author toshiba
 */
public class JDBCServetUser extends HttpServlet {
@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
	  try {
            DriverManager.registerDriver(new OracleDriver());
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
            Statement stmt = con.createStatement();
            String queryString = "select * from javaemps where fname = '"+request.getParameter("userName")+"' and id = "+request.getParameter("userPass");
            ResultSet rs = stmt.executeQuery(queryString);
            boolean loggedIN = false;
            while(rs.next()){
                System.out.println(rs.getString("id")+" "+rs.getString("fname")+" "+rs.getString("mname")+" "+rs.getString("lname")+" "+rs.getString("email")+" "+rs.getString("phone")+" ");
                loggedIN = true;
                
                response.setContentType("text/html");  
                PrintWriter out = response.getWriter();  

                String n=request.getParameter("userName");  
                out.print("Welcome "+n+"<br/>");
            }/*
            if(loggedIN){
                response.setContentType("text/html");  
                PrintWriter out = response.getWriter();  

                String n=request.getParameter("userName");  
                out.print("Welcome "+n+"<br/>");  
            }else{
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();  
                out.print("Sorry UserName or Password Error!");  
                RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
                rd.include(request, response);  
            }*/
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCServetUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
