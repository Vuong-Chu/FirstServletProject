package com.example.FirstServletProject;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Result!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1*num2;
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1><br>");
        out.println("<h1>" + result + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}