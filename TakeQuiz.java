/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author karishma
 */
public class TakeQuiz extends HttpServlet {
   
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
        Statement st;
        ResultSet rs;
        String qr,s1,s2,s3,s4,s5,id;
            HttpSession session=request.getSession();
            if(null == session.getAttribute("id")){  
  // User is not logged in.
                response.sendRedirect("index.jsp");
}
        try {
            
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
             qr="select distinct category from Questions";
             st=con.createStatement();
             rs=st.executeQuery(qr);
             
            
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
  out.println(" <h1>Take Quiz</h1>");
out.println("</header>");

           
            
            out.println("<body>");
            out.println("<h1>select category</h1>");
            
           
            while(rs.next())
            {out.println(" <nav>");
  
            out.println("<ul>");
                s1=rs.getString(1);
                
                out.println("<a href=Quiz?category="+s1+">");
                out.println(s1);
                out.println("<br>");
                 out.println(" </nav>");
  
  out.println("</ul>");
              
              
            }
           out.println(" <footer>Copyright Â© enKaRta.com</footer>");
           
            out.println("</body>");
            out.println("</html>");
            con.close();
        }
        catch(Exception e)
        {}
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
