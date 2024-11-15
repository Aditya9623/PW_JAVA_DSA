import java.util.*;
public class LeapYear
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
	   // int n = 2009;
	    
	    if(n%400==0){
	        System.out.print("Leap Year");
	    }else if(n%4==0 && n%100!=0){
	        System.out.print("Leap Year");
	    }else{
	        System.out.print("not leap year");
	    }
	}
}
