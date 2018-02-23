/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userPckg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

/**
 *
 * @author toshiba
 */
public class MessageDTO extends HttpServlet {
    static ArrayList<Message> messages = new ArrayList<Message>();
    

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
	  PrintWriter out = response.getWriter();
          String name = request.getParameter("name");
          String msg = request.getParameter("msg");
          Message message = new Message(name,msg);
          messages.add(message);
          out.print("received: "+message.getUsername()+" , "+message.getMsg());
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        //String ouString = createJsonObject(new Message("Esraa","Hi"));
        List<String> objs = new ArrayList<String>();
        for(int i=0;i<messages.size();i++){
            objs.add(createJsonObject(messages.get(i)));
        }
        out.print(objs);
    }
    
    private String createJsonObject(Message m){
        Gson msg = new Gson();
        return msg.toJson(m);
    }
}
