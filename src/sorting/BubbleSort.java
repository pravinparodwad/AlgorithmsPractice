package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int numbersList[] = { 7, 1, 18, 20, 45 };
		System.out.println(Arrays.toString(numbersList));
		for (int i = 0; i < numbersList.length - 1; i++) {
			boolean flag = false;
			System.out.println("Iteratrion");
			for (int j = 0; j < numbersList.length - 1; j++) {
				if (numbersList[j] > numbersList[j + 1]) {
					int temp = numbersList[j];
					numbersList[j] = numbersList[j + 1];
					numbersList[j + 1] = temp;
					flag = true;
					System.out.println("Swapped");
				}
			}
			if (flag == false)
				break;
		}
		System.out.println(Arrays.toString(numbersList));
	}

}
