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
                <script src="https://cdn.jsdelivr.net/npm/typed.js@2.0.12"></script>
                <script src="https://cdn.jsdelivr.net/npm/canvas-confetti@1.5.1/dist/confetti.browser.min.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/particles.js@2.0.0/particles.min.js"></script>
                <style>
                    body, html {
                        margin: 0;
                        padding: 0;
                        height: 100%;
                        font-family: 'Segoe UI', sans-serif;
                        overflow: hidden;
                        color: #fff;
                    }

                    #particles-js {
                        position: fixed;
                        width: 100%;
                        height: 100%;
                        background: linear-gradient(-45deg, #0f2027, #203a43, #2c5364);
                        background-size: 400% 400%;
                        animation: gradientBG 15s ease infinite;
                        z-index: -1;
                    }

                    @keyframes gradientBG {
                        0% { background-position: 0% 50%; }
                        50% { background-position: 100% 50%; }
                        100% { background-position: 0% 50%; }
                    }

                    .card {
                        background: rgba(255, 255, 255, 0.07);
                        border: 1px solid rgba(255,255,255,0.2);
                        padding: 3rem;
                        border-radius: 1.5rem;
                        box-shadow: 0 0 30px rgba(0,0,0,0.3);
                        backdrop-filter: blur(15px);
                        text-align: center;
                        max-width: 600px;
                        width: 90%;
                        margin: auto;
                        position: relative;
                        z-index: 2;
                    }

                    .card img {
                        width: 120px;
                        height: 120px;
                        border-radius: 50%;
                        border: 3px solid #fff;
                        margin-bottom: 1rem;
                        box-shadow: 0 0 15px rgba(255, 255, 255, 0.3);
                    }

                    h1 span {
                        font-size: 2.5rem;
                        font-weight: bold;
                        text-shadow: 0 0 15px cyan;
                    }

                    p {
                        font-size: 1.2rem;
                        margin-top: 1rem;
                        opacity: 0.85;
                    }

                    .social-buttons a {
                        margin: 0.6rem;
                        padding: 0.7rem 1.5rem;
                        border-radius: 30px;
                        font-size: 1rem;
                        display: inline-block;
                        text-decoration: none;
                        transition: all 0.3s ease;
                    }

                    .btn-github {
                        background: #fff;
                        color: #000;
                    }

                    .btn-github:hover {
                        background: #000;
                        color: #fff;
                    }

                    .btn-linkedin {
                        background: #0e76a8;
                        color: white;
                    }

                    .btn-linkedin:hover {
                        background: #094e72;
                    }

                    @media (max-width: 600px) {
                        .card {
                            padding: 2rem;
                        }
                        h1 span {
                            font-size: 1.8rem;
                        }
                    }
                </style>
            </head>
            <body onload="launchConfetti()">

                <div id="particles-js"></div>

                <div class="card mt-5">
                    <img src="https://avatars.githubusercontent.com/u/99774885?v=4" alt="Zaher Pathan">
                    <h1><span id="typed-text"></span></h1>
                    <p> </p>
                    <div class="social-buttons mt-3">
                        <a href="https://github.com/zaherpathan" class="btn-github"><i class="fab fa-github"></i> GitHub</a>
                        <a href="https://www.linkedin.com/in/zaher-pathan-697150242" class="btn-linkedin"><i class="fab fa-linkedin"></i> LinkedIn</a>
                    </div>
                </div>

                <script>
                    new Typed('#typed-text', {
                        strings: [
                            "Hello, I'm Zaher Pathan 👋",
                            "Java Developer • DevOps Engineer",
                            "Welcome to My Beautiful App!"
                        ],
                        typeSpeed: 60,
                        backSpeed: 30,
                        loop: true
                    });

                    function launchConfetti() {
                        confetti({
                            particleCount: 120,
                            spread: 100,
                            origin: { y: 0.6 }
                        });
                    }

                    particlesJS('particles-js',
                    {
                        "particles": {
                            "number": {
                                "value": 60
                            },
                            "color": {
                                "value": "#ffffff"
                            },
                            "shape": {
                                "type": "circle"
                            },
                            "opacity": {
                                "value": 0.5
                            },
                            "size": {
                                "value": 3
                            },
                            "line_linked": {
                                "enable": true,
                                "distance": 150,
                                "color": "#ffffff",
                                "opacity": 0.4,
                                "width": 1
                            },
                            "move": {
                                "enable": true,
                                "speed": 3
                            }
                        },
                        "interactivity": {
                            "events": {
                                "onhover": {
                                    "enable": true,
                                    "mode": "repulse"
                                }
                            }
                        },
                        "retina_detect": true
                    });
                </script>
            </body>
            </html>
        """);
    }
}

