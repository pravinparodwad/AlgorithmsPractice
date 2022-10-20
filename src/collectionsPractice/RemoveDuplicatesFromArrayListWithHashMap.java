package collectionsPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicatesFromArrayListWithHashMap {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(5);
		list.add(4);
		
		System.out.println(list);
		System.out.println(removeDuplicates(list));
	}

	private static List<Integer> removeDuplicates(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> rList = new ArrayList<Integer>();
		
		for(Integer num : list) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}
			else {
				map.put(num, 1);
			}
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(Integer.parseInt(entry.getValue().toString()) == 1) {
				rList.add(Integer.parseInt(entry.getKey().toString()));
			}
		}
		return rList;
	}

}
