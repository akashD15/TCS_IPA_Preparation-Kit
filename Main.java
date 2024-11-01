/*
Enter a string and print all vowel as it is which available on string at index 0
input: Hello I am a Student
output: Iaa 
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] nstr = str.split(" ");
		for(int i=0; i<nstr.length; i++){
		    String w = nstr[i];
		    char ch = w.charAt(0);
		    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
		        System.out.print(ch);
		    }
		}
	}
}

