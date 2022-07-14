package com.test;

import java.util.Scanner;

public class Snippet2 {
	public static void main(String[] args) {
		Integer arr[] = new Integer[5];
		int i = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			arr[i] = scan.nextInt();
			i++;
			if(i == 5) {
				break;
			}
		}
		
		System.out.println(arr.toString());
		
		for(i = 0; i<arr.length;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}


}

