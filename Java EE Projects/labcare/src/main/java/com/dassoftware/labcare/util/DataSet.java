package com.dassoftware.labcare.util;

import java.util.ArrayList;
import java.util.HashMap;;

public class DataSet {
    private ArrayList<String> columnName;
    private ArrayList<HashMap<String, String>> columnValue;

    public DataSet() {
        columnName = new ArrayList<String>();
        columnValue = new ArrayList<HashMap<String, String>>();
    }

    public void setColumnName(String columnName) {
        this.columnName.add(columnName);
    }

    public void setValue(int index, String columnName, String columnValue) {
        if (this.columnValue.size() == index) {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            this.columnValue.add(index, hashMap);
        }
        this.columnValue.get(index).put(columnName, columnValue);
    }

    public String getColumnNames() {
        return this.columnName.toString();
    }

    public String getValue(int position, String columnName, String nullValue) {
        return this.columnValue.get(position).get(columnName);
    }

    public String getColumnValues(String columnName, String separator) {
        StringBuilder columnValues = new StringBuilder();

        for (int i = 0; i < this.columnValue.size(); i++) {
            columnValues.append(separator).append(this.columnValue.get(i).get(columnName));
        }

        return columnValues.substring(separator.length());
    }

    public int getRowCount() {
        return this.columnValue.size();
    }

    public boolean isEmpty() {
        return this.columnValue.isEmpty();
    }

    public int getColumnCount() {
        return this.columnName.size();
    }
}
