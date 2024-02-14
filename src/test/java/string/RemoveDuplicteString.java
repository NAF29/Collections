package string;

import java.util.HashSet;

import java.util.Set;

public class RemoveDuplicteString {

	public static String removeDuplicates(String str) {

		String[] words = str.split("\\s+");
		Set<String> uniqueWord = new HashSet<>();
		Set<String> duplicateWord = new HashSet<>();

		StringBuilder sbBuilder = new StringBuilder();
		for (String s : words) {
			if (uniqueWord.contains(s)) {
				duplicateWord.add(s);
			} else {
				uniqueWord.add(s);
			}
		}

		for (String s : words) {
			if (!duplicateWord.contains(s)) {
				sbBuilder.append(s).append(" ");

			}
		}
		return sbBuilder.toString().trim();

	}

	public static void main(String[] args) {

		String str = "Hi I am nafis and I am a programmer";
		String result = removeDuplicates(str);

		System.out.println("Modified String: " + result);
		System.out.println("Actual text :" + str);
	}
}