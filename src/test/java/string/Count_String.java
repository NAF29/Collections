package string;



public class Count_String {

	public static void main(String[] args) {

		String textString = "Hello Java world.This is programming world";
		int count = textString.split("\\s").length;
		System.out.println(count);
		
		//Odd Even
		String[] word=textString.split("\\s+");
		System.out.println("For even text:");
		for(String s: word) {
			if(s.length() %2==0) {
				System.out.println(s);
		}
		
			
		}

		int totalChar = textString.length();
		System.out.println("Total char :" + totalChar);

		// Two String are equals

		String text1 = "Hello World";
		String text2 = "Hello World";
		int results = text1.compareTo(text2);
		if (results == 0) {
			System.out.println("Matched");
		} else {
			System.out.println("Unmached");
		}

		//Remove duplicates from String
		
	}
}