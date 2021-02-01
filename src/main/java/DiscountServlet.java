import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet ", value = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        double price = Double.parseDouble(request.getParameter("price"));
        double discout = Double.parseDouble(request.getParameter("discount"));
        double discountAmount = price*discout*0.01;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product: " +product+ "</h1>");
        writer.println("<h1>Price: " +price+ "</h1>");
        writer.println("<h1>Discount: " +discout+ "</h1>");
        writer.println("<h1>Discount Amount: " +discountAmount+ "</h1>");
        writer.println("</html>");
    }
}
