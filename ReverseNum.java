//Reverse a given number

public class ReverseNum
{
	public static void main(String[] args) {
		int n= 12345;
		int rev=0;
		while(n>0){
		    int temp=n%10;
		    rev=rev*10+temp;
		    n=n/10;
		}
		System.out.print(rev);
	}
}
