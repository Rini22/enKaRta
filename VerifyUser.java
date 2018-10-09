/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author karishma
 */
public class VerifyUser extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Connection con;
        String s,s1,s2,s3;
        PreparedStatement ps;
        ResultSet rs;
        
        
        PrintWriter out = response.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
             s1= request.getParameter("id");
             s2=request.getParameter("pwd");
             s3=request.getParameter("category");
             if(s3!=null)
             {
                 if(s3.equals("Admin"))
                 {
             s="Select id from Admin where id=? and pwd=?";
             ps= con.prepareStatement(s);
             ps.setString(1, s1);
             ps.setString(2, s2);
             rs=ps.executeQuery();
             boolean found= rs.next();
             if (found)
             {
                 out.println("Welcome"+rs.getString(1));
                 HttpSession session= request.getSession();
                 session.setAttribute("id",s1);
                
                 response.sendRedirect("AdminHome.jsp");
             }
                 }
             }
             
             
             
             
             
             s= "select name from User where Id=? and pwd=?";
             
              
             ps= con.prepareStatement(s);
             ps.setString(1, s1);
             ps.setString(2, s2);
             rs=ps.executeQuery();
             boolean found= rs.next();
             if (found)
             {
                 out.println("Welcome"+rs.getString(1));
                 HttpSession session= request.getSession();
                 session.setAttribute("id",s1);
                
                 response.sendRedirect("EnkartaHome.jsp");
             }
             
             con.close();
             out.println("<html>");
            out.println("<head>");
             out.println("<style>");
out.println("div.container { width: 100% ;border: 1px solid gray }");

out.println("header, footer { padding: 1em; color: white; background-color: black; clear: left; text-align: center;}");

out.println("nav {float: left;max-width: 160px;margin: 0;padding: 1em;}");

out.println("nav ul {list-style-type: none;padding: 0;}");
			
out.println("nav ul a {text-decoration: none;}");

out.println("article {margin-left: 170px;border-left: 1px solid gray;padding: 1em;overflow: hidden;}");
out.println("</style>");
out.println("</head>");
out.println("<body>");

out.println("<div class= container>");

out.println("<header>");
  out.println(" <h1>Error</h1>");
out.println("</header>");

           
            
            out.println("<body>");
            
            out.println("USER NOT VERIFIED"); 
           
            
           out.println(" <footer><a href=AdminHome.jsp>Home</a>     Copyright Â© enKaRta.com</footer>");
           
            out.println("</body>");
            out.println("</html>");
            con.close();
           
            
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VerifyUser</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VerifyUser at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        }
        catch (ClassNotFoundException e)
        {out.println("connection gadbad");
        }
        catch(Exception e)
        {
            out.print("error");
        }
        finally { 
            out.close();
            
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
