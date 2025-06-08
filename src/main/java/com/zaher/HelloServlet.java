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
                <script src="https://cdn.jsdelivr.net/npm/canvas-confetti@1.5.1/dist/confetti.browser.min.js"></script>
                <style>
                    body {
                        margin: 0;
                        font-family: 'Segoe UI', sans-serif;
                        overflow: hidden;
                        height: 100vh;
                        background: linear-gradient(-45deg, #141e30, #243b55, #2c3e50, #4b6cb7);
                        background-size: 400% 400%;
                        animation: gradientBG 12s ease infinite;
                        color: white;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                    }

                    @keyframes gradientBG {
                        0% { background-position: 0% 50%; }
                        50% { background-position: 100% 50%; }
                        100% { background-position: 0% 50%; }
                    }

                    canvas#particles-js {
                        position: fixed;
                        top: 0;
                        left: 0;
                        width: 100%;
                        height: 100%;
                        z-index: -1;
                    }

                    .card {
                        background: rgba(255, 255, 255, 0.05);
                        backdrop-filter: blur(15px);
                        padding: 3rem;
                        border-radius: 1.5rem;
                        box-shadow: 0 20px 50px rgba(0, 0, 0, 0.4);
                        text-align: center;
                        max-width: 600px;
                        width: 90%;
                        animation: fadeIn 1.2s ease-in-out;
                        border: 1px solid rgba(255,255,255,0.2);
                    }

                    .card img {
                        width: 120px;
                        height: 120px;
                        border-radius: 50%;
                        object-fit: cover;
                        border: 3px solid white;
                        margin-bottom: 20px;
                        box-shadow: 0 0 12px rgba(255, 255, 255, 0.4);
                    }

                    h1 {
                        font-size: 2.5rem;
                        font-weight: bold;
                        text-shadow: 0 0 10px #00ffff, 0 0 20px #00ffff;
                        animation: glow 2s ease-in-out infinite alternate;
                    }

                    @keyframes glow {
                        from {
                            text-shadow: 0 0 10px #00ffff, 0 0 20px #00ffff;
                        }
                        to {
                            text-shadow: 0 0 20px #0ff, 0 0 40px #0ff;
                        }
                    }

                    p {
                        font-size: 1.2rem;
                        margin-top: 10px;
                        opacity: 0.9;
                    }

                    .social-buttons a {
                        margin: 0.7rem;
                        padding: 0.7rem 1.4rem;
                        border-radius: 25px;
                        font-size: 1rem;
                        transition: all 0.3s ease;
                        display: inline-block;
                        text-decoration: none;
                    }

                    .btn-github {
                        background: #fff;
                        color: #24292e;
                    }

                    .btn-github:hover {
                        background: #24292e;
                        color: #fff;
                    }

                    .btn-linkedin {
                        background: #0e76a8;
                        color: #fff;
                    }

                    .btn-linkedin:hover {
                        background: #094e72;
                        color: #fff;
                    }

                    @keyframes fadeIn {
                        from { opacity: 0; transform: translateY(20px); }
                        to { opacity: 1; transform: translateY(0); }
                    }
                </style>
            </head>
            <body onload="launchConfetti()">
                <div class="card">
                    <img src="https://avatars.githubusercontent.com/u/99774885?v=4" alt="Zaher Pathan">
                    <h1>Hello from Zaher Pathan App!</h1>
                    <p> </p>
                    <div class="social-buttons">
                        <a href="https://github.com/zaherpathan" class="btn-github"><i class="fab fa-github"></i> GitHub</a>
                        <a href="https://www.linkedin.com/in/zaher-pathan-697150242" class="btn-linkedin"><i class="fab fa-linkedin"></i> LinkedIn</a>
                    </div>
                </div>

                <script>
                    function launchConfetti() {
                        confetti({
                            particleCount: 150,
                            spread: 100,
                            origin: { y: 0.6 }
                        });
                    }
                </script>
            </body>
            </html>
        """);
    }
}
