package string;

import java.util.Arrays;

import org.apache.commons.text.translate.EntityArrays;

public class Add_Number_String {

	public static void main(String[] args) {

		String arr[] = { "One", "Two", "Three" };

		// Result should be like this (one=1,two=2,three=3)
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "=" + (i + 1));
		}

		// Result should be Three two one
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		// Reverse String
		String textString = "Hello world";
		StringBuilder stringBuilder = new StringBuilder(textString);
		System.out.println(stringBuilder.reverse());
		
	}
}
