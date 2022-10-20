package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int numbersList[] = { 7, 1, 28, 20, 45 };
		int minIndex = 0;
		System.out.println(Arrays.toString(numbersList));
		for (int i = 0; i < numbersList.length; i++) {
			for (int j = i + 1; j < numbersList.length; j++) {
				if (numbersList[j] < numbersList[i]) {
					minIndex = j;
				}
			}
			int temp = numbersList[i];
			numbersList[i] = numbersList[minIndex];
			numbersList[minIndex] = temp;
		}
		System.out.println(Arrays.toString(numbersList));
	}

}
