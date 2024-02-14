package string;

public class reverseString {

	// Input "Hello Test"
	// Output "Test Hello"

	public static String revrseString(String str) {

		String[] word = str.split("\\W");

		StringBuilder sb = new StringBuilder();

		for (int i = word.length - 1; i >= 0; i--) {
			sb.append(word[i]).append(" ");
		}

		return sb.toString();

	}

	public static void main(String args[]) {

		String Str = "Hello Test";
		String result = revrseString(Str);
		System.out.println(result);

	}

}
