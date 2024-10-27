/*
Create class Movie with below attributes: 

movieName - String 
company - String 
genre - String 
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
objects where the searchGenre String matches with the original array of Movie object's genre attribute 
(case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
print "Low Budget Movie".

Input
---------
aaa
Marvel
Action
250000000
bbb
Marvel
Comedy
25000000
ccc
Marvel
Comedy
2000000
ddd
Marvel
Action
300000000
Action

Output
-------------------
High Budget Movie
High Budget Movie
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Movie[] arr = new Movie[4];
	    for(int i=0; i<arr.length; i++){
	        String a = sc.nextLine();
	        String b = sc.nextLine();
	        String c = sc.nextLine();
	        int d = sc.nextInt(); sc.nextLine();
	        
	     arr[i] = new Movie(a,b,c,d);
	    }
	    String searchGenre = sc.nextLine();
	    
	    String[] res = getMovieByGenre(arr,searchGenre);
	    for(int i=0; i<res.length; i++){
	        System.out.println(res[i]);
	    }
	}
	
	public static String[] getMovieByGenre(Movie[] arr, String searchGenre){
	    
	    String[] arr2 = new String[0];
	    for(int i=0; i<arr.length; i++){
	        if(arr[i].getgen().equalsIgnoreCase(searchGenre)){
	            
	            if(arr[i].getbudget()>80000000){
	                arr2 = Arrays.copyOf(arr2, arr2.length+1);
	                arr2[arr2.length-1] = "High Budget Movie";
	            }
	            else{
	                arr2 = Arrays.copyOf(arr2, arr2.length+1);
	                arr2[arr2.length-1] = "Low Budget Movie";
	            }
	        }
	    }
	    return arr2;
	}
}

class Movie{
    
    private String mName, com, gen;
    private int budget;
    public Movie(String mName, String com, String gen, int budget){
        this.mName = mName;
        this.com = com;
        this.gen = gen;
        this.budget = budget;
    }
    
    public String getmName(){
        return mName;
    }
    public void setmName(String mName){
        this.mName = mName;
    }
    public String getcom(){
        return com;
    }
    public void setcom(String com){
        this.com = com;
    }
    public String getgen(){
        return gen;
    }
    public void setgen(String gen){
        this.gen = gen;
    }
    public int getbudget(){
        return budget;
    }
    public void setbudget(int budget){
        this.budget = budget;
    }
}