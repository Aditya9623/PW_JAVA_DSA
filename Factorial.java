import java.util.*;
public class Factorial
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
	    int f = fact(n);
	    System.out.print(f);
	   // int n = 2009;
	    
	}
	public static int fact(int n){
	    if(n==0){
	        return 1;
	    }else{
	    return n*fact(n-1);
	    }
	}
}
