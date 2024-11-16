// Given two positive integers num1 and num2, the task is to find the product of the
// two numbers on a 12-hour clock rather than a number line.
// Note: Assume the Clock starts from 0 hours to 11 hours.
// Input: Num1 = 3, Num2 = 7
// Output: 9
// Explanation: 3*7 = 21. The time in a 12 hour clock is 9.
// Input: Num1 = 3, Num2 = 4
// Output: 0
import java.util.*;
class 12-hourClock{


public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    
    int product=n1*n2;
    
    System.out.print(product%12);
    
}
}