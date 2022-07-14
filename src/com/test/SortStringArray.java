package com.test;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		String[] sa = new String[] {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
		//String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(sa));
		
		SortStringArray ssa = new SortStringArray();
		ssa.sortStringArray(sa);
	}

	private void sortStringArray(String[] sa) {
		for(int i = 0; i<sa.length;i++) {
			for(int j = i+1;j<sa.length;j++) {
				if(sa[i].compareTo(sa[j]) > 0) {
				String temp = sa[i];
				sa[i] = sa[j];
				sa[j] = temp;
				}
			}
		}
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(sa));
	}
}
