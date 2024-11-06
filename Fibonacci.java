import java.util.*;
public class Fibonacci
{
// 	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 	    int n = sc.nextInt();
// 	    int a=0,b=1;
	    
	    
// 	    for(int i=1; i<n;i++){
// 	       int sum=a+b;
// 	        a=b;
// 	        b=sum;
// 	        System.out.print(sum);
// 	    }
	    
// 	}

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
 	    int n = sc.nextInt();
 	    
 	    System.out.print(fib(n));
 	  //  int s = fib(n);
 	  //  System.out.print(s);
 	    
    }
}
