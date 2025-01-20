//Find second smallest and second largest element in an array
import java.util.*;
public class SecSmallSecLarge
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[1]);
		System.out.print(arr[n-1-1]);
// 			for(int i=0;i<n;i++){
// 		    System.out.print(arr[i]);
// 		}
	
	}
}