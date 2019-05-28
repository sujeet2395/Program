package DivideNConquer;

import java.util.Scanner;

public class ModularExponentialOfLarge {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int x, n, c;
            x = sc.nextInt();
            n = sc.nextInt();
            c = sc.nextInt();
            System.out.println(pow(x,n,c));
        }
    }

    private static int pow(int x, int n, int c) {
        if(x==0)
            return 0;
        if(n==1)
            return x%c;
        if(n==0 || x==1)
            return 1%c;
        int p=pow(x, n/2, c);
        if((n&1)==0)
        {
            p=(p*p)%c;
        }else
        {
            p=(x*((p*p)%c))%c;
        }
        return p;
    }
}
