package demotest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class CollectionTest {
    // Function to sort by column
    public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function Arrays.sort
        Arrays.sort(arr, new Comparator<int[]>() {
           
          public int compare(final int[] entry1, 
                             final int[] entry2) {
 
            // To sort in descending order revert 
            // the '>' Operator
            if (entry1[col] > entry2[col])
                return 1;
            else
                return -1;
          }
        });  // End of function call sort().
    }
     
    // Driver Code
    public static void main(String args[])
    {
        int matrix[][] = { { 39, 27, 11, 42 },
                           { 10, 93, 91, 90 },
                           { 54, 78, 92, 12 },
                           { 24, 64, 20, 65 } };
        // Sort this matrix by 3rd Column
        int col = 2;
        sortbyColumn(matrix, col);
 
        // Display the sorted Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
