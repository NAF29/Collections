package string;

import java.util.LinkedHashSet;

public class Remove_Dupliacte_String {

	 static void removeDuplicates(String str) {
				
		LinkedHashSet<Character>set = new LinkedHashSet<>();
		for(int i =0;i<str.length();i++)
			set.add(str.charAt(i));
			
			for(Character ch:set) 
				System.out.println(ch);
			}
		
	 public static void main(String args[]) {
		 String str="Hello Test Java";
		 removeDuplicates(str);
	 }

}
