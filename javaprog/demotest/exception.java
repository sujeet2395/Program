package javaprog;

public class exception {
    public static void main(String[] args) {
        int a = 1, b, ar[]={1};
        try
        {
            b=a/(a-a);
            System.out.println("value of "+b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("error: "+e);
        }
        
        try
        {
            ar[20]=20;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("error: "+e);
        }
    }
}
