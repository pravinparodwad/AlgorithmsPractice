package collectionsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OccurenceOfCharacterInString {

	public static void main(String[] args) {
		String s1 = "www.google.com";
		HashMap<Character, Integer> occurencesMap = new HashMap<Character, Integer>();
		
		
		for(char ch : s1.toCharArray()) {
			if(occurencesMap.containsKey(ch)){
				occurencesMap.put(ch, occurencesMap.get(ch)+1);
			}
			else {
				occurencesMap.put(ch, 1);
			}
		}
		
		System.out.println(occurencesMap);
		
		HashMap<String, Integer> occurencesMapForString = new HashMap<String, Integer>();
		
//		String [] arrayOfString = {"Pune", "Mumbai", "Banglore", "Pune"};
		List<String> list = new ArrayList<String>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("Nanded");
		list.add("Nanded");
		list.add("Nanded");
		
		
		
		for(String s : list) {
			if(occurencesMapForString.containsKey(s)) {
				occurencesMapForString.put(s, occurencesMapForString.get(s)+1);
			}
			else {
				occurencesMapForString.put(s, 1);
			}
		}
		System.out.println(occurencesMapForString);
		
		
	}

}
