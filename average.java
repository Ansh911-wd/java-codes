import java.util.*;
public class functions{
    public static void calcAverage(int a, int b, int c){
        int average= (a +b +c)/3;
        System.out.println("average of three given numbers is" + average);
        return;
    }
    public static void main(String args[]){
        System.out.println("enter the three no");
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        calcAverage(a,b,c);
    }
}