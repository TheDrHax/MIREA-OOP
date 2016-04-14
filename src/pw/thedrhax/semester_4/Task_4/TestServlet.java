package pw.thedrhax.semester_4.Task_4;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");

        try {
            String name = req.getParameterMap().get("name")[0];
            resp.getWriter().write("Hello, " + name + "!");
        } catch (NullPointerException ex) {
            resp.getWriter().write("Please pass your name as GET: ?name=...");
        }
    }
}
