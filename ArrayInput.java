import java.util.*;
class ArrayInput
{
    
public static void main (String[]args)
{
   // int arr[]={12,45,74,85,14,65};
   // int num=arr.length;
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]);
    }
}
}
