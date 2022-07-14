package com.test;

import java.util.Arrays;

public class SmallestInt {
	
	public int solution(int[] A){
    Arrays.sort(A);     
    int min = 1; 
    int cap = A.length; 
    
    for (int i = 0; i < cap; i++){
        if(A[i] == min){
            min++;
        }
    }   
    return min;    
}

	public static void main(String[] args) {
		//int[] array = {10,11,14,15,20};
		int[] array = {1,2,5,4,6};
		SmallestInt s = new SmallestInt();
		//System.out.println(s.solution(array));
		System.out.println(s.solution(array));
	}

}
