import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 String username = request.getParameter("username");
 String password = request.getParameter("password");


 if(username.equals("khloud123") && password.equals("123")){


 HttpSession session = request.getSession();

 String name = request.getParameter("username");
 session.setAttribute("user", name);
 response.sendRedirect("index.jsp");

 }else{

 out.println("wrong username and password...");
 }
 }
}
