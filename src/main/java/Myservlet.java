import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/test")
public class Myservlet extends HttpServlet {
    @Override
    public void init(){
        System.out.println("iniciando servlet");
    }

    @Override
    public void destroy(){
        System.out.println("destruyendo instancia del servlet");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("Hola desde el servlet!");
    }

   /* @Override
    public void service( HttpServletRequest request , HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<h1  style=\"background-color: red;\" >Yisus was here ... Im coming for you<h1>");
        writer.close();
    }
*/


}


