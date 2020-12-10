package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/cool-servlet", "/my-cool-servlet/*"})
public class MainServlet extends HttpServlet {
    private int[] Arr = new int[3];
    private String notification;
    Service service = new Service();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("notification", "result");
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Arr[0] = Integer.parseInt(req.getParameter("StartYear"));
        Arr[1] = Integer.parseInt(req.getParameter("EndYear"));


         notification = service.equation(Arr);

        req.setAttribute("notification", notification);
        getServletContext().getRequestDispatcher("/info.jsp").forward(req, resp);

    }

}