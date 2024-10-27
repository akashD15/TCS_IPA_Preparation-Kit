/*
Create class Medicine with below attributes: 

MedicineName - String 
batch - String 
disease - String 
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
This method will take array of Medicine objects and a disease String as parameters. 
And will return another sorted array of Integer objects where the disease String matches with the 
original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
method and print the result.

Input
-------------

dolo650
FAC124W
fever
100
paracetamol
PAC545B
bodypain
150
almox
ALM747S
fever
200
aspirin
ASP849Q
flu
250
fever

Output
---------
100
200
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Medicine[] arr = new Medicine[4];
	    for(int i=0; i<arr.length; i++){
	        String a = sc.nextLine();
	        String b = sc.nextLine();
	        String c = sc.nextLine();
	        int d = sc.nextInt(); sc.nextLine();
	        
	     arr[i] = new Medicine(a,b,c,d);
	    }
	    String disease = sc.nextLine();
	    int[] res = getPriceByDisease(arr,disease);
	    if(res!=null){
	    
	       for(int i=0; i<res.length; i++){
	          System.out.println(res[i]);
	       }
	    }
	    else{
	        System.out.println("No medicine found");
	    }
	}
	
	public static int[] getPriceByDisease(Medicine[] arr, String disease){
	    
	    int[] p = new int[0];
	    for(int i=0; i<arr.length; i++){
	        
	        if(arr[i].getdisease().equalsIgnoreCase(disease)){
	            p = Arrays.copyOf(p, p.length+1);
	            p[p.length - 1] = arr[i].getprice();
	            Arrays.sort(p);
	        }
	    }
	    if(p.length>0){
	        return p;
	    }
	    else{
	        return null;
	    }
	}
}

class Medicine{
    
    private String mname, batch, disease;
    private int price;
    public Medicine(String mname, String batch, String disease, int price){
        this.mname = mname;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }
    
    public String getmname(){
        return mname;
    }
    public void setmname(String mname){
        this.mname = mname;
    }
    public String getbatch(){
        return batch;
    }
    public void setbatch(String batch){
        this.batch = batch;
    }
    public String getdisease(){
        return disease;
    }
    public void setdisease(String disease){
        this.disease = disease;
    }
    public int getprice(){
        return price;
    }
    public void setprice(int price){
        this.price = price;
    }
}
