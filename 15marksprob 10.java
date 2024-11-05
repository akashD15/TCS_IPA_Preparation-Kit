/*
Find the largest word from a given sentence.
if two strings have same length then print the first one.

Input: TCS is the best Company ever
Output: Company. 
*/
import java.util.*;
public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String largest = "";
        for(int i=0; i<arr.length; i++){
            if(arr[i].length()>largest.length()){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
