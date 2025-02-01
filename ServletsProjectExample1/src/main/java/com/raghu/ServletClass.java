package com.raghu;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletClass extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Calling Servlet doGet()");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3><b><i>Hello Coders...</i></b></h3>");
        out.println("Do good coding...");


    }
}
