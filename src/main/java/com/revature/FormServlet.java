package com.revature;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/Form")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
        out.println("<table class=\"table text-dark\">");
        out.println("<thead>\n" +
                "    <tr>\n" +
                "      <th scope=\"col\">Email</th>\n" +
                "      <th scope=\"col\">Password</th>\n" +
                "      <th scope=\"col\">First</th>\n" +
                "      <th scope=\"col\">Last</th>\n" +
                "      <th scope=\"col\">Phone</th>\n" +
                "    </tr>\n" +
                "  </thead>");
        out.println("<tbody>\n" +
                "    <tr>\n" +
                "      <th scope=\"row\">" + req.getParameter("Email")+ "</th>\n" +
                "      <td>"+req.getParameter("Password")+"</td>\n" +
                "      <td>"+req.getParameter("fName") +"</td>\n" +
                "      <td>"+req.getParameter("lName") +"</td>\n" +
                "      <td>"+req.getParameter("phone") +"</td>\n" +
                "    </tr>");
        out.println("</tbody></table>");



        //out.println("sum is: " + (Double.parseDouble(req.getParameter("number1")) + Double.parseDouble(req.getParameter("number2"))));
    }
}
