package DivideNConquer;

import java.util.Scanner;

/*
Dilpreet wants to paint his dog- Buzo's home that has n boards with different lengths[A1, A2,..., An].
He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board.
The problem is to find the minimum time to get this job done under the constraints that any painter will only paint continuous sections of boards,
say board {2, 3, 4} or only board {1} or nothing but not board {2, 4, 5}.
*/
public class PainterPartition {

    // return the maximum element from the array 
    static int getMax(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // return the sum of the elements in the array 
    static int getSum(int arr[], int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        return total;
    }

    // find minimum required painters for given maxlen 
    // which is the maximum length a painter can paint 
    static int numberOfPainters(int arr[], int n, int maxLen) {
        int total = 0, numPainters = 1;

        for (int i = 0; i < n; i++) {
            total += arr[i];

            if (total > maxLen) {

                // for next count 
                total = arr[i];
                numPainters++;
            }
        }

        return numPainters;
    }

    static int partition(int arr[], int n, int k) {
        int lo = getMax(arr, n);
        int hi = getSum(arr, n);

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int requiredPainters = numberOfPainters(arr, n, mid);

            // find better optimum in lower half 
            // here mid is included because we 
            // may not get anything better 
            if (requiredPainters <= k) {
                hi = mid;
            } // find better optimum in upper half 
            // here mid is excluded because it gives  
            // required Painters > k, which is invalid 
            else {
                lo = mid + 1;
            }
        }

        // required 
        return lo;
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int k, n;
            k = sc.nextInt();
            n = sc.nextInt();
            int i = 0;
            int[] a = new int[n];
            while (i < n) {
                a[i] = sc.nextInt();
                i++;
            }
            System.out.println(partition(a, n, k));
        }
    }
}
