import java.io.*;
import javax.servlet.http.*;
public class calculator extends HttpServlet {
 @Override
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
 response.setContentType("text/html;charset=UTF-8");
 PrintWriter out = response.getWriter();
 double result = 0, length, height, width, radius;
 String message = "temp";

 out.println("<html><head><title>Servlet</title></head><body>");
 String option = request.getParameter("option");

 if(option.equals("A"))
 {
 length = Double.parseDouble(request.getParameter("length"));
 width = Double.parseDouble(request.getParameter("width"));
 height = Double.parseDouble(request.getParameter("height"));
 message = "Surface Area of Box";
 result = (2 * length * height + 2 * length * width + 2 * width * height);
 }
 else if(option.equals("B"))
 {
 length = Double.parseDouble(request.getParameter("length"));
 width = Double.parseDouble(request.getParameter("width"));
 height = Double.parseDouble(request.getParameter("height"));
 message = "Volume of Box";
 result = length * width * height;
 }
 else if(option.equals("C"))
 {
 radius = Double.parseDouble(request.getParameter("radius"));
 message = "Surface Area of Sphere";
 result = 4 * Math.PI * radius * radius;
 }
 else if(option.equals("D"))
 {
 radius = Double.parseDouble(request.getParameter("radius"));
 message = "Volume of Sphere";
 result = Math.PI * 4 / 3 * radius * radius * radius;
 }
 out.println("<p>Option</p>" + message);
 out.println("<h2>Result: </h2>" + result);
 out.println("</body></html>");
 }
}