package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("mango");
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("apple");

		ArrayList<String> dupList=findDupliactes(list);
		System.out.println(dupList);
		
	}

	private static ArrayList<String> findDupliactes(ArrayList<String> list) {
		Set<String> set= new HashSet<>();
		ArrayList<String> dupArrayList= new ArrayList<>();
		for(String s : list) {
			
			if(!set.add(s)) {
				dupArrayList.add(s);
			}
		}
		
		return dupArrayList;
	}
}