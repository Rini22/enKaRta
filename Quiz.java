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
public class Quiz extends HttpServlet {
   
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
        ResultSet rs;
        PreparedStatement ps;
        String qr,s1,s2,s3,s4,s5,s6,s7,s8;
        int n=0;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
             qr="select quest,option1,option2,option3,option4 from Questions where category=?";
             s1=request.getParameter("category");
             ps=con.prepareStatement(qr);
             ps.setString(1, s1);
             rs=ps.executeQuery();
             
                 
            out.println("<html>");
            
            out.println("<title>"+s1+"</title>");  
           out.println("</br>");
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
           
           
            out.println("<h1> "+s1+" Quiz</h1>");
            out.println("<form action=Result method=post />");
            out.println("<input type=text name=category value="+s1+" readonly=readonly />");
            out.println("<br>");
            int i=0;
            while(rs.next())
             {
              
                s2= rs.getString(1);
              s3= rs.getString(2);
              s4= rs.getString(3);
              s5= rs.getString(4);
              s6= rs.getString(5);
              
            out.println((i+1)+s2);
            out.println("<pre>");
            
            out.println("<input type=radio name=ans"+i+" value=a  required/>"+s3);        
            out.println("<br>");
            out.println(" <input type=radio name=ans"+i+" value=b  />"+s4);
            out.println("<br>");
            out.println(" <input type=radio name=ans"+i+" value=c  />"+s5);
            out.println("<br>");
            out.println(" <input type=radio name=ans"+i+" value=d  />"+s6);
            out.println("<br>");
            
             out.println("</pre>");
             i++;
            }
            out.println("<input type=submit value=submit />");
out.println(" <footer><a href=EnkartaHome.jsp>Home</a>      Copyright Â© enKaRta.com</footer>");
       
            out.println("</body>");
            out.println("</html>");
             
        }
     catch(Exception e)
        {
         out.println("error occured");
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
