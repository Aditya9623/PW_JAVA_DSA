// A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time
// You are required to implement the following function.
// Int NumberOfCarries(int num1, int num2);`
// The functions accepts two numbers 'num1' and 'num2' as its arguments. You are required to calculate and return the total number of carries generated while adding digits of two numbers 'num1' and 'num2'.
// Assumption: num1, num2>=0
//INPUT: n1=451,n2=349
//output:2
import java.util.*;
public class NoOfCarries
{
    public static int carry(int n1,int n2){
        int count =0;
        int carry =0;
        
        while(n1>0 && n2>0){
            int sum= n1%10 + n2%10 +carry;
            carry = sum/10;
            if(carry==1)
            count ++;
            n1=n1/10;
            n2=n2/10;
        }
        return count;
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt();
	    int n2=sc.nextInt();
		System.out.println(carry(n1,n2));
	}
}
