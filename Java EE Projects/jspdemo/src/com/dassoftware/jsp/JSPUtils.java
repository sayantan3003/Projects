package com.dassoftware.jsp;

public class JSPUtils {
	public static String connectDataBase() {
		String response = "Connecting through JDBC...";
		return response + "<br/>" + "Connected with MySql...";
	}
	
	public static String connectDataBase(String dbName) {
		String response = "Connecting through JDBC...";
		return response + "<br/>" + "Connected with " + dbName + "...";
	}
	
	/**
	 * String num -> array num (['1','2','3','4']) -> iterate array and construct word and join them
	 * @param number
	 * @return String
	 */
	public static String convertNumberIntoWords(String number) {
		
		String[] numWords = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		StringBuilder sbNumInWords = new StringBuilder();
		
		for(char arr : number.toCharArray()) {
			sbNumInWords.append(numWords[Integer.parseInt(Character.toString(arr))]);
		}
		
		return sbNumInWords.toString();
	}
}
