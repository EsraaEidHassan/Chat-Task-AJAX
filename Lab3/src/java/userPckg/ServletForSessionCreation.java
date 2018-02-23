package userPckg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author toshiba
 */
public class ServletForSessionCreation extends HttpServlet {

    public static List<User> users = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        User u = new User();
        u.setFname("esraa");
        u.setPassword("123456");
        users.add(u);
    }
	
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
	  
    }
 
 
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

        response.setContentType("text/html");  
        //PrintWriter out = response.getWriter();  

        String n=request.getParameter("userName");  
        String p=request.getParameter("userPass");
        boolean user_exist = false;
//        User u = new User();
//        u.setFname(n);
//        u.setPassword(p);
        for(int i=0;i<users.size();i++){
            if(users.get(i).getFname().equals(n) && users.get(i).getPassword().equals(p)){
                user_exist = true;
                break;
            }
        }
        //response.sendRedirect("ServletDB?userName="+n+"&userPass="+p);
        
        if(user_exist == true){
            HttpSession session = request.getSession();
            session.setAttribute("login", "true");
            request.getRequestDispatcher("GetLogin?userName="+n+"&userPass="+p).forward(request,response);
        }else{
            //PrintWriter out = response.getWriter(); 
            //out.print("nooo");
            response.sendRedirect("index.html");
            
        }

        /*if(p.equals("servlet")&& !(n == null || (n = htmlFilter(n.trim())).length() == 0) && !(p == null || (p = htmlFilter(p.trim())).length() == 0)){  
                Cookie c1 = new Cookie("userName",n);
                response.sendRedirect("servlet2?userName="+n+"&userPass="+p);
                if(c1 != null){

                        //RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
                        //rd.forward(request, response);
                        response.addCookie(c1);
                        response.sendRedirect("servlet2?userName="+n+"&userPass="+p);
                        //response.sendRedirect("servlet2");
                }else{
                        out.print("Please enable Cookies");  
                        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
                        rd.include(request, response); 
                }
        }  
        else{  
                out.print("Sorry UserName or Password Error!");  
                RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
                rd.include(request, response);  

        }*/  

    }
	
	// Filter the string for special HTML characters to prevent
   // command injection attack
   private static String htmlFilter(String message) {
      if (message == null) return null;
      int len = message.length();
      StringBuffer result = new StringBuffer(len + 20);
      char aChar;
 
      for (int i = 0; i < len; ++i) {
         aChar = message.charAt(i);
         switch (aChar) {
             case '<': result.append("&lt;"); break;
             case '>': result.append("&gt;"); break;
             case '&': result.append("&amp;"); break;
             case '"': result.append("&quot;"); break;
             default: result.append(aChar);
         }
      }
      return (result.toString());
   }
}
