import java.util.*;
public class LargestNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int arr[]=new int[num];
        for (int i=0;i<num;i++){
             arr[i]=sc.nextInt();
        }
        
       int max = arr[0];
       
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max)
                max=arr[i];
       }
       System.out.print(max);
    }

}
