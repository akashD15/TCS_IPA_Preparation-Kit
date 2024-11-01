/*
Write a program to compute the number of spaces and characters in string.
I/p: Hi I am a Student
O/p: 4 13 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int s_count=0, c_count=0;
		for(int i=0; i<str.length(); i++){
		    
		    char ch = str.charAt(i);
		    if(ch==' '){
		        s_count++;
		    }
		    else if(ch>='a' || ch<='z' || ch>='A' || ch<='Z'){
		        c_count++;
		    }
		}
		System.out.println(s_count+" "+c_count);
	}
}
