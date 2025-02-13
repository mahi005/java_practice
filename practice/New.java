package practice;

import  java.util.Scanner;
public class New {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        System.out.println();
        if(y%4==0 && y%100 !=0){
            System.out.println("Leap ");
            // if(y%400==0){
            //     System.out.println("Leap ");
            // }
            // else{
            //     System.out.println("Not a leap year");
            // }
        }
        else{
            System.out.println("Not Leap ");
        }
    
    }
    
}
