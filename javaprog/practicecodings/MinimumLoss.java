package practicecodings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class MinimumLoss {
    static int minimumLoss(long[] price) {
        int i, j;
        int min=Integer.MAX_VALUE;
        HashMap<Long, Integer> mp=new HashMap<>();
        for (i = 0; i < price.length; i++)
        {
            mp.put(price[i], i);
        }
        Arrays.sort(price);
        for(i=0; i<price.length-1; i++){
            long v=price[i+1]-price[i];
            if(min>v && mp.get(price[i])-mp.get(price[i+1])>0)
                min=(int)v;
        }
        return min;
    }
    
    public static void main(String[] args) throws IOException {
        //private static final Scanner scanner = new Scanner(System.in);
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(scanner.readLine());
        long[] price = new long[n];
        String[] priceItems = scanner.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            long priceItem = Long.parseLong(priceItems[i]);
            price[i] = priceItem;
        }
        int result = minimumLoss(price);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
