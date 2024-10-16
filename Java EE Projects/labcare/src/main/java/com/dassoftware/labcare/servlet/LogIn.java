package com.dassoftware.labcare.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.SQLException;

import com.dassoftware.labcare.util.DataSet;
import com.dassoftware.labcare.util.QueryProcessor;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Getting value from Input
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println(username + " " + password);

        QueryProcessor qp = new QueryProcessor();
        String sql = "SELECT * FROM user";

        DataSet dsUsers = null;

        try {
            dsUsers = qp.getQueryProcessor(sql);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        if ((dsUsers != null && dsUsers.getRowCount() > 0)) {
            out.println("Validating User");

            boolean validUser = false;

            for (int i = 0; i < dsUsers.getRowCount(); i++) {
                if (username.equalsIgnoreCase(dsUsers.getValue(i, "username", ";")) && password.equalsIgnoreCase(dsUsers.getValue(i, "password", ";"))) {
                    validUser = true;
                    break;
                }
            }

            if(validUser) {
                out.println("User matches found"); 
            }
            else {
                out.println("Invalid userId/Password...");
            }
        }

    }
}
