package searchingAlgorithm;

public class LinearSearch {

	public static void main(String[] args) {
		int numbersArray[] = {4,8,3,6,1,3,9,5,0};
		int searchItem = 0;
		int location = -1;
		
		for(int i = 0; i < numbersArray.length; i++) {
			if(numbersArray[i] == searchItem) {
				location = i;
				break;
			}
		}
		if(location >= 0 && location < numbersArray.length)
			System.out.println("Item is available at index location: " + location);
		else
			System.out.println("Search item is not available in array");
	}

}
