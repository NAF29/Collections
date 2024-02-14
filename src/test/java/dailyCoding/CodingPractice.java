package dailyCoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CodingPractice {

	public static void main(String args[]) {

		String arr[] = { "one", "two", "three" };
		StringBuilder stringBuilder = new StringBuilder();

		for (String s : arr) {
			stringBuilder.append(s).append(" ");
		}

		System.out.println(stringBuilder.toString().trim());
	}

}
