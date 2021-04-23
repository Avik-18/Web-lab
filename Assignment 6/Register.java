
package Sample;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Avik
 */
@WebServlet(urlPatterns = {"/Register"})



public class Register extends HttpServlet 
{  

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  

        String f=request.getParameter("fname");  
        String l=request.getParameter("lname");  
        
        out.print("Fist Name : "+f.charAt(0)+"\tLast Name : "+l.charAt(0));
        
        out.close();
    }        
 
  
} 

