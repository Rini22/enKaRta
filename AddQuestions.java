/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author karishma
 */
public class AddQuestions extends HttpServlet {
    
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con;
        PreparedStatement ps;
        String qry,s1,s2,s3,s4,s5,s6,qry1,s7;
            
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
        
             s1=request.getParameter("ques");
             s2=request.getParameter("a");
             s3=request.getParameter("b");
             s4=request.getParameter("c");
             s5=request.getParameter("d");
             s6=request.getParameter("category");
             s7=request.getParameter("ans");
             qry="Insert into Questions values(?,?,?,?,?,?,?)"; 
             ps=con.prepareStatement(qry);
             ps.setString(1,s6);
             ps.setString(2,s1);
             ps.setString(3,s2);
             ps.setString(4,s3);
             ps.setString(5,s4);
             ps.setString(6,s5);
             ps.setString(7,s7);
             int check=ps.executeUpdate();
             if(check==1)
             {
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
  out.println(" <h1>Adding Question.....</h1>");
out.println("</header>");

           
            
            out.println("<body>");
            
            if(check==1)
            {
                out.println("Successfully Updated");
            }
            else
                out.println("Could Not Update the Question...Error Occurred!");
           
            
           out.println(" <footer><a href=AdminHome.jsp >Home</a>Copyright Â© enKaRta.com</footer>");
           
            out.println("</body>");
            out.println("</html>");
            con.close();
             }      
                    
        } catch (SQLException ex) {
            Logger.getLogger(AddQuestions.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddQuestions.class.getName()).log(Level.SEVERE, null, ex);
        } finally { 
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
