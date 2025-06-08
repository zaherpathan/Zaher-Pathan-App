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
                <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" rel="stylesheet">
                <style>
                    * {
                        margin: 0;
                        padding: 0;
                        box-sizing: border-box;
                    }
                    body {
                        height: 100vh;
                        background: linear-gradient(-45deg, #667eea, #764ba2, #6b8dd6, #8e44ad);
                        background-size: 400% 400%;
                        animation: gradientBG 15s ease infinite;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        font-family: 'Segoe UI', sans-serif;
                        color: white;
                    }

                    @keyframes gradientBG {
                        0% {background-position: 0% 50%;}
                        50% {background-position: 100% 50%;}
                        100% {background-position: 0% 50%;}
                    }

                    .card {
                        background: rgba(255, 255, 255, 0.1);
                        backdrop-filter: blur(15px);
                        padding: 3rem;
                        border-radius: 1.5rem;
                        box-shadow: 0 20px 40px rgba(0, 0, 0, 0.3);
                        text-align: center;
                        max-width: 600px;
                        width: 90%;
                        animation: fadeIn 1.5s ease-in-out;
                    }

                    @keyframes fadeIn {
                        from { opacity: 0; transform: translateY(-30px); }
                        to { opacity: 1; transform: translateY(0); }
                    }

                    .card img {
                        width: 120px;
                        height: 120px;
                        object-fit: cover;
                        border-radius: 50%;
                        margin-bottom: 20px;
                        border: 3px solid white;
                        box-shadow: 0 0 10px rgba(255,255,255,0.5);
                    }

                    h1 span {
                        border-right: 3px solid white;
                        animation: typing 4s steps(22) 1s 1 normal both, blink 0.75s step-end infinite;
                        white-space: nowrap;
                        overflow: hidden;
                        display: inline-block;
                    }

                    @keyframes typing {
                        from { width: 0; }
                        to { width: 100%; }
                    }

                    @keyframes blink {
                        from, to { border-color: transparent; }
                        50% { border-color: white; }
                    }

                    .social-buttons a {
                        margin: 1rem 0.5rem;
                        padding: 0.75rem 1.5rem;
                        border-radius: 30px;
                        font-size: 1rem;
                        text-decoration: none;
                        transition: 0.3s;
                        display: inline-block;
                    }

                    .btn-github {
                        background: white;
                        color: #333;
                    }

                    .btn-github:hover {
                        background: #24292e;
                        color: white;
                    }

                    .btn-linkedin {
                        background: #0e76a8;
                        color: white;
                    }

                    .btn-linkedin:hover {
                        background: #084d74;
                        color: white;
                    }
                </style>
            </head>
            <body>
                <div class="card">
                    <img src="https://avatars.githubusercontent.com/u/99774885?v=4" alt="Zaher Pathan">
                    <h1><span>Hello from Zaher Pathan</span></h1>
                    <p class="mt-3">Rendered beautifully by a Java Servlet using Java 17 🚀</p>
                    <div class="social-buttons">
                        <a href="https://github.com/zaherpathan" class="btn-github"><i class="fab fa-github"></i> GitHub</a>
                        <a href="https://www.linkedin.com/in/zaher-pathan-697150242" class="btn-linkedin"><i class="fab fa-linkedin"></i> LinkedIn</a>
                    </div>
                </div>
            </body>
            </html>
        """);
    }
}

