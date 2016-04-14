package pw.thedrhax.semester_4.Task_4;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler handler = new ServletContextHandler();
        server.setHandler(handler);

        handler.addServlet(TestServlet.class, "/");

        server.start();
    }
}
