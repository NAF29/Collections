package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Print_count_of_duplicates_list {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("apple");
		list.add("orange");
		list.add("mango");

		//Method
		Map<String , Integer> dupliMap=findDuplicates(list);
		System.out.println("The dupliactes list is: ");
		for(Map.Entry<String, Integer> entry : dupliMap.entrySet()) {
			System.out.println(entry.getKey() + " :" + entry.getValue());
		}
		
	}

	public static Map<String, Integer> findDuplicates(ArrayList<String> list) {
		
		Map<String, Integer>frequencyMap= new HashMap<>();
		Map<String, Integer>duplicateMap= new HashMap<>();
		
		for(String s: list) {
			frequencyMap.put(s, frequencyMap.getOrDefault(s, 0)+1);
			
			if(frequencyMap.get(s)>1) {
				duplicateMap.put(s, frequencyMap.get(s));
			}
		}
		
		
		return duplicateMap;
	}
}