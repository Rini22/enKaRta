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
public class Feedback extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String fb,id,qry;
        
        Connection con;
        PreparedStatement ps;
        
        
        try {
        fb=request.getParameter("fb");
        HttpSession session = request.getSession();
        id=(String)session.getAttribute("id");
        
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
        qry="Insert into feedback values(?,?)";
        ps= con.prepareStatement(qry);
        ps.setString(1,id);
        ps.setString(2,fb);
        ps.executeUpdate();
        response.sendRedirect("EnkartaHome.jsp");
        
            
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Feedback</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Feedback at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
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