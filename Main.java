/*
Take an integer as input and calculate the sum of its digit.
If the sum is divisible by 3, then print True, else print False.
Input: 123
Output: True

Input: 1234
Output: False*/
import java.util.*;
public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0, x;
        while(n>0){
            x = n%10;
            sum += x;
            n = n/10;
        }
        if(sum%3==0){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}