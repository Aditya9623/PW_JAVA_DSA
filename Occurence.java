import java.util.*;
public class Occurence
{
    public static int occ(int arr[], int ele){
        int c=0;
        for(int num:arr){
            if(num==ele){
                 c++;
            }
        }
        return c;
    }
    
	public static void main(String[] args) {
	   int arr[]={2,4,6,8,3,5,4,8,6,8};
	   int ele = 8;
	   int res= occ(arr,ele);
	   System.out.print(res);
	}
}
