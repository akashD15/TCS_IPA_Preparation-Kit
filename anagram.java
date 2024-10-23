import java.util.*;
import java.util.Arrays;
public class Main
{
    public static boolean isAnagram(String s, String t){
        
        if(s.length()!=t.length()){
            return false;
        }
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        return Arrays.equals(sArr,tArr);
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.nextLine();
	    String t = sc.nextLine();
	    
	    if(isAnagram(s,t)){
	        System.out.println("true");
	    }
	    else{
	        System.out.println("false");
	    }
	}
}
