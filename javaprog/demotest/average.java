package javaprog;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int a, b, c;
        double avg=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three numbers ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        avg=(a+b+c)/(double)3;
        System.out.println("average of "+a+", "+b+" and "+c+" is "+avg);
    }
}
