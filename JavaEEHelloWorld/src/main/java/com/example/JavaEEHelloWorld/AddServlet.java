package com.example.JavaEEHelloWorld;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


import javax.ejb.EJB;



@WebServlet(name = "AddServlet", value = "/AddServlet")
public class AddServlet extends HttpServlet {
    private String message;

    @EJB
    addEJB obj;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");

        // Hello


        PrintWriter out = response.getWriter();

        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));
        obj.setI(i);
        obj.setJ(j);
        obj.add();

        out.println("addition is " + obj.getK());


    }
}
