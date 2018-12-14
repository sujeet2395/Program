package javaprog;

import java.util.Scanner;

public class overloading {
    public static void main(String[] args) {
        int a,b,c,ch;
        double r;
        area_cal ac=new area_cal();
        Scanner s=new Scanner(System.in);
        System.out.println("\tMenu of calculate area\n1.)Square\n2.)Rectangle\n3.)Triangle");
        ch=s.nextInt();
        switch(ch)
        {
            case 1 :System.out.println("Enter the side");
                    a=s.nextInt();
                    r=ac.area(a);
                    System.out.println("area of square is "+r);break;
            case 2 :System.out.println("Enter the sides");
                    a=s.nextInt(); 
                    b=s.nextInt();
                    r=ac.area(a,b);
                    System.out.println("area of rectangle is "+r);break;
            case 3 :System.out.println("Enter the sides");
                    a=s.nextInt(); 
                    b=s.nextInt();
                    c=s.nextInt();
                    r=ac.area(a,b,c);
                    System.out.println("area of triangle is "+r);break;                
            default : System.out.println("Wrong choice");
        }
        
    }
}

class area_cal
{
    double area(int a)
    {
        return a*a;
    }
    double area(int a,int b)
    {
        return a*b;
    }
    double area(int a,int b, int c)
    {
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
}