package javaprog;

import java.util.Scanner;

public class UserDefinedException {
     public static void main(String[] args) {
        int a, b, result;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two nums");
        a=s.nextInt();
        b=s.nextInt();
        try
        {
            if(b==0) throw new MyException(" Division by zero ");
            result = a/b;
            System.out.println("value of a/b is "+result);
        }
        catch(MyException e)
        {
            System.out.println("error: "+e);
        }
        
    }
}
class MyException extends Exception
{
    String msg;

    public MyException(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MyException{" + msg + '}';
    }
}
