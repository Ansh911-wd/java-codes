 // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class array{
    public static void main(String args[]){
        System.out.println("enter no of rows amd columns");
    Scanner sc= new Scanner (System.in);
    int rows=sc.nextInt();
    int column=sc.nextInt();

    int[][] numbers=new int [rows][column];
       System.out.println("enter values of rows amd columns");
    for(int i=0;i<rows;i++){
        //  System.out.println("enter values of rows amd columns");
        for (int j=0;j<column;j++){
            numbers[i][j]=sc.nextInt();
        }
    }
    System.out.println("Required array is");
    for(int i=0;i<rows;i++){
        for ( int j=0;j<column;j++){
        System.out.println(numbers[i][j]+ " ");
    }
    System.out.println();
    }