package javaprog;

import java.util.Scanner;

public class prime {
     static boolean checkprime(int x)
    {
        int temp,i;
        temp=(int) Math.sqrt(x);
        for(i=2; i<=temp; i++)
        {
            if(x%i==0)
                return false;
        }
          return true; 
    }
     public static void main(String[] args)
    {
        int p;boolean r;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number for checking prime or not");
        p=s.nextInt();
        if(checkprime(p))
            System.out.println(p+" is a prime number");
        else System.out.println(p+" is not a prime number");
    }
}
