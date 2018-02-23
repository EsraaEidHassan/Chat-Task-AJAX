package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"myJS.js\"></script>\n");
      out.write("    </head>\n");
      out.write("     <style>\n");
      out.write("    #msgs {\n");
      out.write("        font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #msgs td, #msgs th {\n");
      out.write("        border: 1px solid #ddd;\n");
      out.write("        padding: 8px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #msgs tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("    #msgs tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("    #msgs th {\n");
      out.write("        padding-top: 12px;\n");
      out.write("        padding-bottom: 12px;\n");
      out.write("        text-align: left;\n");
      out.write("        background-color: #4CAF50;\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    #users {\n");
      out.write("        font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #users td, #users th {\n");
      out.write("        border: 1px solid #ddd;\n");
      out.write("        padding: 8px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #users tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("    #users tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("    #users th {\n");
      out.write("        padding-top: 12px;\n");
      out.write("        padding-bottom: 12px;\n");
      out.write("        text-align: left;\n");
      out.write("        background-color: #4CAF50;\n");
      out.write("        color: white;\n");
      out.write("    }\n");
      out.write("    .button {\n");
      out.write("        background-color: #4CAF50;\n");
      out.write("        border: none;\n");
      out.write("        color: white;\n");
      out.write("        padding: 15px 32px;\n");
      out.write("        text-align: center;\n");
      out.write("        text-decoration: none;\n");
      out.write("        display: inline-block;\n");
      out.write("        font-size: 16px;\n");
      out.write("        margin: 4px 2px;\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    .textField{\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        Name <input class=\"textField\" type=\"text\" id=\"name\">\n");
      out.write("        Message<input class=\"textField\" type=\"text\" id=\"msg\">\n");
      out.write("        <input type=\"button\" id=\"send\" value=\"button\" class=\"button\" >\n");
      out.write("        <div id=\"msgs\"></div>\n");
      out.write("        <div id=\"users\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
