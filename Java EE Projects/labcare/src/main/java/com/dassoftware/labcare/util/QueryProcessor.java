package com.dassoftware.labcare.util;

import java.sql.*;


public class QueryProcessor {
    public DataSet getQueryProcessor(String sql) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://127.0.0.1:3306";
        String dbname = "book_shop";
        String username = "sayantan";
        String password = "Sayantan@123";

        // Load & Register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establishing DB Connection
        Connection conn = DriverManager.getConnection(url + "/" + dbname, username, password);

        // Creation of statement object
        Statement statement = conn.createStatement();

        // Send and execute SQL Query
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user");

        // Construct DataSet from resultset
        DataSet dataSet = new DataSet();

        // Get ResultSetMetaData to get the column details
        ResultSetMetaData rsmd = resultSet.getMetaData();
        int columnCount = rsmd.getColumnCount();

        // Set column names in DataSet
        for (int i = 1; i <= columnCount; i++) {
            dataSet.setColumnName(rsmd.getColumnName(i));
        }

        // Iterate through the ResultSet
        int rowIndex = 0;
        while (resultSet.next()) {
                // Loop through each column in the current row
                for (int i = 1; i <= columnCount; i++) {
                // Get the column name and value
                String columnName = rsmd.getColumnName(i);
                String columnValue = resultSet.getObject(i).toString();
                dataSet.setValue(rowIndex, columnName, columnValue);
            }
            rowIndex++;
        }
        
        return dataSet;
    }
}
