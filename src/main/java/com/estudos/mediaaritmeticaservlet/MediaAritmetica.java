package com.estudos.mediaaritmeticaservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MediaAritmetica", value = "/mediaAritmetica")
public class MediaAritmetica extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float valor1, valor2, media;
        PrintWriter out;
        response.setContentType("text/html");
        out = response.getWriter();

        valor1 = Float.parseFloat(request.getParameter("valor1").replace(',', '.'));
        valor2 = Float.parseFloat(request.getParameter("valor2").replace(',', '.'));

        media = (valor1 + valor2) / 2;

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado</title>");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Resultado da média aritmética entre " + request.getParameter("valor1") + " e " + request.getParameter("valor2") + " é:</p>");
        out.println("<p>" + media + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
