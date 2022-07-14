package com.test;

public class AA {
	
	public static final String hompage;
	public static String homePageLink = "EPAM.com";

	static {
		hompage = "ABC";
		System.out.println(hompage);
	}
	public static void openPage() {
		System.out.println("Open page :"+homePageLink);
	}
	
	public static void main(String[] args) {
		AA.openPage();
	}
}


