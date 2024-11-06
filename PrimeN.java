import java.util.*;
public class PrimeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        boolean check = false;

        if(num==2)
            System.out.println("True");
        else if(num<2)
            System.out.println("False");

        else if(num>2){

            for (int i = 2; i<=Math.sqrt(num); i++){

                if(num%i!=0){
                    check=true;
                }else {
                    System.out.println("False");
                    break;
                }
            }if(check)
                System.out.println("True");
        }
    }

}
