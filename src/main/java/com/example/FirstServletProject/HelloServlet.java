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
        String calculation = request.getParameter("sign");
        String result = resultHelper(num1, num2, calculation);

        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1><br>");
        out.println("<h1>" + result + "</h1>");
        out.println("</body></html>");
    }

    private String resultHelper(int num1, int num2, String calculation){
        String result;
        switch (calculation){
            case "Add":
                result = String.format("%d",num1+num2);
                break;
            case "Subtract":
                result = String.format("%d",num1+num2);
                break;
            case "Multiply":
                result = String.format("%d",num1*num2);
                break;
            default:
                if(num2==0){
                    result = "Invalid numbers";
                }else {
                    result = String.format("%.2f",num1*1.0/num2);
                }
        }
        return result;
    }
}