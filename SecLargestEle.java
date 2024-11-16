// Charles is given an array A. He wants to find the count of occurrences of
// second largest element in the array. Your task is to help him find and return an integer value representing the count of occurrence of the second largest element in an array.
// Note:
// If the array contains same element, then return 0.
// The array has only consecutive elements i.e in sorted order.
// Input 1: 8
// 1 2 3 4 4 5 55
// Output 2:
// 2

import java.util.*;
public class SecLargestEle
{
    public static int secondlast(int n,int arr[]){
        if(n==0)
        return 0;
        
        int secele=0;
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1])
            return secele=i;
            break;
        }
        int occ=0;
        for(int i=0;i<n;i++){
	        if(arr[i]==secele)
	        return occ++;
	    }
	    return occ;
    }
    
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    System.out.print(secondlast(n,arr));
	}
}
