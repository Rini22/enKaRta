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
public class SearchArticles extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String s1,s2,s3,s4,s5,qry;
        Connection con;
        PreparedStatement ps;
        ResultSet rs = null;
        s1= request.getParameter("mode");
        s2= request.getParameter("word");
        
        
        try 
        {
              Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
             if(s1!=null&&s2!=null)
             {
              if(s1.equals("alphabet"))
              {
                  qry="select * from Article where title like'"+s2+"%'";
                  ps= con.prepareStatement(qry);
                  
                  rs=ps.executeQuery();
                  
               }
                  
                  if(s1.equals("keyword"))
                  {    
                   qry="select * from Article where title like '%"+s2+"%' or keywords like'%"+s2+"%' or category like '%"+s2+"%'";
                    ps= con.prepareStatement(qry);
                  
                  rs=ps.executeQuery();
                      
                  }   if(s1.equals("category"))
                      
                  {
                      qry="select * from Article where category=?";
                      ps= con.prepareStatement(qry);
                       ps.setString(1,s2);
                      rs=ps.executeQuery();
                  }
             }
             
  out.println("<html>");
            out.println("<head>");
            out.println("<title>Search Result</title>");  
            out.println("</head>");
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
 out.println("<h2> SEARCH ARTICLES</h2>");
out.println("</header>");

            out.println("<body>");
            
            while (rs.next())
            {
                
            out.println("<br>");
            out.println("<a href="+rs.getString(2)+">"+rs.getString(1)+"</a>");
            out.println("<br>");
            }
            
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href=SearchArticles.jsp>SearchMore</a>");
            out.println("<br>");
            out.println("<a href=homePage.jsp>EnkartaHOme</a>");
            out.println("<br>");
            
            
            out.println(" <footer>Copyright Â© enKaRta.com</footer>");
            out.println("</body>");
            out.println("</html>");
                       
             
             
        
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SearchArticles.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchArticles.class.getName()).log(Level.SEVERE, null, ex);
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
