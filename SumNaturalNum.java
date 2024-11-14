
public class SumNaturalNum
{
	
    public static void main(String[] args) {
        
       // int sum = getSum(10);
        System.out.println(getSum(10));
    }
     public static int getSum(int n){
        if(n==0)
        {
       return n;
        }else{
        return n + getSum(n-1);
        }
    }
}
