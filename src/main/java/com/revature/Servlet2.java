package com.revature;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Servicing");
        servletResponse.setContentType("text/html");
        PrintWriter pw = servletResponse.getWriter();
        pw.print("<html><body>");
        pw.print("<h1>This is servlet 2</h1>");
        pw.print("</body></html>");
        pw.close();
    }
}
