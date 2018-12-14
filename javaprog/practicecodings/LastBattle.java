package practicecodings;

import java.util.Scanner;

public class LastBattle {
    public static void main(String[] args) {
        int t, n, i;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
            int[] a=new int[n];
            int b, ca=0, cb=0;
            for(i=0; i<n; i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0; i<n; i++)
            {
                b=sc.nextInt();
                a[i]= a[i]-b;
                if(a[i]==0);
                else if(a[i]>0)
                {
                    ca++;
                }else{
                    cb++;
                }
            }
            if(ca==cb)
            {
                System.out.println(ca+" "+cb+" DRAW");
            }else if(ca>cb)
            {
                System.out.println(ca+" "+cb+" A");
            }else{
                System.out.println(ca+" "+cb+" B");
            }
        }
    }
}
