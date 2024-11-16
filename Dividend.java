import java.util.*;
class Dividend{
    static int dividend(int arr[],int divisor,int qou,int remain,int n){
        int dividend=divisor*qou+remain;
        
        for(int i=0;i<n;i++){
            if(arr[i]==dividend)
            return i;
        }
        return -1;
    }
    
public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int divisor=sc.nextInt();
        int qou=sc.nextInt();
        int remain=sc.nextInt();
        
        System.out.print(dividend(arr,divisor,qou,remain,n));
}
}