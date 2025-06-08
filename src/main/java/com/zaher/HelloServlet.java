package com.zaher;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("""
            <!DOCTYPE html>
            <html>
            <head>
                <title>Beautiful Java App</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                <style>
                    body {
                        background: linear-gradient(to right, #667eea, #764ba2);
                        color: white;
                        text-align: center;
                        padding-top: 100px;
                        font-family: 'Segoe UI', sans-serif;
                    }
                    h1 {
                        font-size: 4rem;
                        font-weight: bold;
                    }
                    p {
                        font-size: 1.5rem;
                    }
                </style>
            </head>
            <body>
                <h1>Hello from Zaher Pathan App!</h1>
                <p>This page is rendered by a Java Servlet using Java 17!</p>
            </body>
            </html>
        """);
    }
}

