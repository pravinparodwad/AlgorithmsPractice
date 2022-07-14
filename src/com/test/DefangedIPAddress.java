package com.test;

public class DefangedIPAddress {

	public static void main(String[] args) {
		String s = "10.24.2.45";
		DefangedIPAddress df = new DefangedIPAddress();
		String outputString = df.generateDFIP(s);
		System.out.println(outputString);
	}
	
	public String generateDFIP(String ipAddress) {
		return ipAddress.replace(".", "[.]");
	}

}
