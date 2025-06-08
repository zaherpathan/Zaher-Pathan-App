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
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <title>Zaher Pathan Java App</title>
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                <style>
                    body {
                        background: linear-gradient(135deg, #667eea, #764ba2);
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                        font-family: 'Segoe UI', sans-serif;
                        color: #fff;
                    }

                    .card {
                        background: rgba(255, 255, 255, 0.1);
                        backdrop-filter: blur(10px);
                        padding: 3rem;
                        border-radius: 1rem;
                        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
                        text-align: center;
                        max-width: 600px;
                        width: 90%;
                    }

                    .card h1 {
                        font-size: 3rem;
                        font-weight: 700;
                        animation: fadeInDown 1s ease-in-out;
                    }

                    .card p {
                        font-size: 1.2rem;
                        margin-top: 1rem;
                        animation: fadeInUp 1.2s ease-in-out;
                    }

                    .btn {
                        margin: 1rem 0.5rem 0 0.5rem;
                        font-size: 1rem;
                        padding: 0.75rem 1.5rem;
                        border-radius: 30px;
                        transition: background 0.3s;
                    }

                    .btn:hover {
                        background-color: #5f5dcf;
                        color: white;
                    }

                    @keyframes fadeInDown {
                        from { opacity: 0; transform: translateY(-20px); }
                        to { opacity: 1; transform: translateY(0); }
                    }

                    @keyframes fadeInUp {
                        from { opacity: 0; transform: translateY(20px); }
                        to { opacity: 1; transform: translateY(0); }
                    }
                </style>
            </head>
            <body>
                <div class="card">
                    <h1>Hello from Zaher Pathan App!</h1>
                    <p>This stylish page is rendered using a Java Servlet on Java 17.</p>
                    <a href="https://github.com/zaherpathan" target="_blank" class="btn btn-light">GitHub Projects</a>
                    <a href="https://www.linkedin.com/in/zaher-pathan-697150242" target="_blank" class="btn btn-outline-light">LinkedIn Profile</a>
                </div>
            </body>
            </html>
        """);
    }
}
