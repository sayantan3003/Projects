package com.dassoftware.labview.view;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "logon")
public class LogOnServlet extends HttpServlet {
	
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type to HTML
        response.setContentType("text/html");
        
        // Use try-with-resources to ensure PrintWriter is closed properly
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>LabView</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>My First Servlet</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e) {
            // Handle the exception (optional, based on your application's needs)
            e.printStackTrace();
        }
    }
}