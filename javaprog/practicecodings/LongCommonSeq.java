package practicecodings;

import java.io.*;
import java.util.Scanner;

public class LongCommonSeq {

    public static void main(String[] args) {
        int t, i, j, a, b, prev;
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        int[] A, B;
        int maxlen = 0;

        while (t-- > 0) {
            a = s.nextInt();
            A = new int[a];
            for (i = 0; i < a; i++) {
                A[i] = s.nextInt();
            }

            b = s.nextInt();
            B = new int[b];
            for (i = 0; i < b; i++) {
                B[i] = s.nextInt();
            }

            int m[][] = new int[a + 1][b + 1];

            prev = Math.min(A[0], B[0]);

            for (i = 0; i < a; i++) {
                for (j = 0; j < b; j++) {
                    if (A[i] == B[j] && A[i]>=prev) {
                        m[i + 1][j + 1] = m[i][j] + 1;
                        prev = A[i];
                    } else {
                        if(m[i][j + 1]>m[i + 1][j])
                        {
                            m[i + 1][j + 1] = m[i][j + 1];
                            prev=A[i];
                        }else{
                            m[i + 1][j + 1] = m[i + 1][j];
                            prev=B[j];
                        }
                        
                    }
                    maxlen = Math.max(maxlen, m[i + 1][j + 1]);
                }
            }
            
            System.out.println(maxlen);
            for (i = 0; i <= a; i++) {
                for (j = 0; j <= b; j++) {
                    System.out.print(m[i][j]+" ");
                }
                System.out.println();
            }
            maxlen = 0;
        }
    }
}
