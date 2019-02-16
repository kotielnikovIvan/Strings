package info.sjd.appRunner;

import java.util.Formatter;

public class AppRunner {
	private static Formatter formatter = new Formatter(System.out);
	private static int rightAlignment = 20; 
	public static void print(int value1, int value2) { 
		String strValue1 = String.valueOf(value1);
		String strValue2 = String.valueOf(value2);
		int maxLength = strValue1.length() > strValue2.length() ? strValue1.length() : strValue2.length();  
		formatter.format("%" + rightAlignment + "d\n", value1);
		formatter.format("%" + rightAlignment + "d\n", value2);
		formatter.format("%" + rightAlignment + "." + maxLength + "s\n", "__________");
		
		for ( int i = strValue2.length() - 1; i >= 0; i-- ) { 
			int result = 0;
			result += Character.getNumericValue(strValue2.charAt(i)) * value1;
			formatter.format("%" + rightAlignment + "d\n", result);
			rightAlignment--; 
		}
		int resultLength = String.valueOf(value1 * value2).length();
		formatter.format("%20." + resultLength + "s\n", "__________");
		formatter.format("%20d\n", value1 * value2);
	} 
	   
	public static void main(String[] args) {
		print(1233, 412332); 
	}

}