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
public class Result extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
String s,s1,qry;

int k,marks,n=0;

        
s1=request.getParameter("category");
Connection con;
PreparedStatement ps;
ResultSet rs;


        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            qry="select ans from Questions where category=?";
            ps= con.prepareStatement(qry);
            ps.setString(1,s1);
            rs=ps.executeQuery();
             k=0;
             marks=0;
while(rs.next())
{
    n++;
}
    
    rs.beforeFirst();
    String answer[]= new String[n];
    
    for(int i=0;i<n;i++)
        {         
            s=request.getParameter("ans"+i);
             answer[i]=s;      
        }
             
             
            while(rs.next())
            { 
                if(answer[k].equals(rs.getString(1)))
                  marks++;
              k++;  
                
                    
                
            
             }
             HttpSession session= request.getSession();
             String id=(String) session.getAttribute("id");
             qry= "Insert into QuizMarks values(?,?,?)";
             ps= con.prepareStatement(qry);
             ps.setString(1,id );
             ps.setString(2,s1);
             ps.setInt(3,marks);
             ps.executeUpdate();
             
             
             
             
             out.println("<html>");
            out.println("<head>");
            out.println("<title>Result</title>");  
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
  out.println(" <h1>Result</h1>");
out.println("</header>");
            
            out.println("<body>");
            out.println("<h1>Well done "+id+" </h1>");
            if(marks<=n/2)
            {
                out.println("<h2>Better Luck Next Time!!</h2>");
            }
            else
                out.println("<h2>Great Going!!</h2>");
                
            out.println("<br>");
            out.println("<pre>");
            out.println("Marks="+marks+"/"+n);
            out.println("<br>");
            out.println("The correct Answers are:");
            rs.beforeFirst();
            int i=1;
            while(rs.next())
            {
            out.println(i+")"+rs.getString(1));
            i++;
            }
            out.println("<br>");
            out.println("<br>");
            
            out.println("<a href=EnkartaHome.jsp>Home</a>");
            out.println("</pre>");
            out.println(" <footer>Copyright Â© enKaRta.com</footer>");
            out.println("</body>");
            out.println("</html>");
            
        } catch (SQLException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
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
