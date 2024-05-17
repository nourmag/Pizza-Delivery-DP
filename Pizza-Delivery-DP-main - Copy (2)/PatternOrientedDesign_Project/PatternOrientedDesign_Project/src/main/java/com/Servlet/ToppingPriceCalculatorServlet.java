import java.io.IOException;

@WebServlet("/calculateToppingPrice")
public class ToppingPriceCalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] toppings = request.getParameterValues("toppings");

        if (toppings != null) {
            ToppingPriceCalculator calculator = new ToppingPriceCalculator();
            float totalToppingPrice = calculator.calculateTotalToppingPrice(toppings);

            request.setAttribute("totalToppingPrice", totalToppingPrice);

            RequestDispatcher dispatcher = request.getRequestDispatcher(""); page.jsp
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect(""); //page.jsp
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
