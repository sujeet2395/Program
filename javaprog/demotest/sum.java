package javaprog;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a, b, sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two numbers ");
        a=s.nextInt();
        b=s.nextInt();
        sum=a+b;
        System.out.println("sum of "+a+" and "+b+" is "+sum);
    }
}
