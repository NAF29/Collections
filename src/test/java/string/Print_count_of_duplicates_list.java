package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Print_count_of_duplicates_list {

	private static Map<String, Integer> findDupliactesList(ArrayList<String> list) {

		Map<String, Integer> freuency = new HashMap<>();
		Map<String, Integer> dulpMap = new HashMap<>();

		for (String s : list) {
			freuency.put(s, freuency.getOrDefault(s, 0) + 1);

			if (freuency.get(s) > 1) {
				dulpMap.put(s, freuency.get(s));
			}

		}
		return dulpMap;

	}

	public static void main(String[] args) {
		// Reult should be apple= 2, mango=2;

		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("apple");
		list.add("orange");
		list.add("mango");

		Map<String, Integer> map = findDupliactesList(list);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " :" + entry.getValue() + " Times");
		}

	}

}