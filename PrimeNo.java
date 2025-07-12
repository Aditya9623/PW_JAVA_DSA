import java.util.*;
public class PrimeNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean check=false;
		
		if(n==2){
		    System.out.println("true");
		}else if(n<2){
		    System.out.println("false");
		}
		
		if(n>2){
		    for(int i=2; i<Math.sqrt(n); i++){
		        if(n%i!=0){
		          check=true;
		        }else{
		            System.out.println("false");
		            break;
		        }
		    }
		}
		if(check){
		    System.out.println("True");
		}
	}
}
