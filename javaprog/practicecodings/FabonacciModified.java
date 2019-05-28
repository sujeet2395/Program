package practicecodings;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class FabonacciModified {

    /**
     * tn=tn-2 + tn-1*tn-1;
     * @param t1
     * @param t2
     * @param n start from 1;
     * @return BigInteger
     */
    static BigInteger fibonacciModified(int t1, int t2, int n) {
        BigInteger[] tn=new BigInteger[22];
        tn[0] = new BigInteger(String.valueOf(t1));
        tn[1] = new BigInteger(String.valueOf(t2));
        if(n==1 || n==2)
            return tn[n-1];
        int i;
        for(i=2; i<n; i++)
            tn[i]=tn[i-2].add(tn[i-1].multiply(tn[i-1]));
        return tn[n-1];
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] t1T2n = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(t1T2n[0]);

        int t2 = Integer.parseInt(t1T2n[1]);

        int n = Integer.parseInt(t1T2n[2]);

        BigInteger result = fibonacciModified(t1, t2, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
/* 
input : 0 1 10
output: 84266613096281243382112
*/