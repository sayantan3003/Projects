package com.dassoftware.labview.view;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/logon")
public class LogOnServlet extends HttpServlet {
	
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>LabView</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My First Servlet");
		out.println("</body>");
		out.println("</html>");
    }
}