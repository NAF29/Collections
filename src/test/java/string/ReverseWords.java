package string;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String []args){
        System.out.println("Enter a string to be reversed:");
        Scanner input = new Scanner(System.in);

        String reverse = "";

        while(input.hasNextLine())
        {
            String str = input.next();
            if(str.contains(".")){
                str = str.replace(".","");
                for(int i = str.length()-1; i >= 0; i--)
                {
                    reverse = reverse + str.charAt(i);
                }
                reverse = reverse+".";
            }
            else{
                for(int i = str.length()-1; i >= 0; i--)
                {
                    reverse = reverse + str.charAt(i);
                }
            }
            reverse += " ";
            System.out.println(reverse);
        }
    }
}