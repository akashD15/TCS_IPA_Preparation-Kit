/*
Write a program to print the last character of every word in a string.

Condition: Ignore all the digits and whitespaces 
Input: Hey3 Java Learners
Output: as
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] nstr = str.split(" ");
		for(int i=0; i<nstr.length; i++){
		    String word = nstr[i];
		    char ch = word.charAt(word.length()-1);
		    if(Character.isDigit(ch)){
		        continue;
		    }
		    System.out.print(ch);
		}
	}
}
