package string;

import java.util.HashMap;
import java.util.Map;

public class Count_Of_duplicate_Char {

	public static void duplicatesChar(String str) {

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println("Dupliacates charcter is:");

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " :" + entry.getValue() + " Times");
			}

		}

	}

	public static void main(String[] args) {
		String str = "Hello World";
		duplicatesChar(str);

	}

}
