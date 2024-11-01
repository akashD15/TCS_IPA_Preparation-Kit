/*
Input: experience
Output: exprinc*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String tmp = "";
		for(int i=0; i<str.length(); i++){
		    if(tmp.indexOf(str.charAt(i)) == -1){
		        tmp = tmp + str.charAt(i);
		    }
		}
		System.out.println(tmp);
	}
}
