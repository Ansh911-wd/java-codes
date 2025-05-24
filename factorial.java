import java.util.*;
public class functions{
    public static void printFactorial(int n){
        int factorial =1;
        for(int i=n ; i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("factorial of given no is"+factorial);
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        System.out.println("enter number ");
        Scanner sc= new Scanner(System.in ) ;
        int n=sc.nextInt();

        printFactorial(n);
    }
}