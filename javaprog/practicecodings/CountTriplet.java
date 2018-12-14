package practicecodings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class CountTriplet {
    public static long ncthree(long n)
    {
        long nc=1, t=1;

        if(n<=3)
        {
            nc=1;
        }else if(n==4)
        {
            nc=4;
        }else if(n==5)
        {
            nc=10;
        }else if(n==6)
        {
            nc=20;
        }else if(n==7)
        {
            nc=35;
        }else if(n==8)
        {
            nc=56;
        }else if(n>8){
            if((n&1) == 0)
            {
                if(n%3==0)
                {
                    nc=(n/3)*((n-2)/2)*(n-1);
                }else if((n-1)%3==0)
                {
                    nc=n*((n-2)/2)*((n-1)/3);
                }else if((n-2)%3==0)
                {
                    nc=n*((n-2)/6)*(n-1);
                }
            }else{
                if(n%3==0)
                {
                    nc=(n/3)*((n-1)/2)*(n-2);
                }else if((n-1)%3==0)
                {
                    nc=n*((n-1)/6)*(n-2);
                }else if((n-2)%3==0)
                {
                    nc=n*((n-1)/2)*((n-2)/3);
                }
            }
        }   
        return nc;
    }
    // Complete the countTriplets function below.
    public static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> m1 = new HashMap<>();        
        for(long i:arr)
        {
            if(m1.containsKey(i))
            {
                m1.put(i, m1.get(i)+1);
            }else{
                m1.put(i,(long) 1);
            }
        }
        long c=0;
        if(r==1)
        {
            for(Map.Entry<Long, Long> e:m1.entrySet())
            {
                if(e.getValue()>=3)
                {
                    System.out.println(e.getKey()+","+e.getValue());
                    c+=ncthree(e.getValue());
                }
            }
        }else{
            for(Map.Entry<Long, Long> e:m1.entrySet())
            {
                long j, k;
                j=e.getKey()*r;
                k=e.getKey()*r*r;
                if(m1.containsKey(j) && m1.containsKey(k))
                {
                    System.out.println(e.getKey()+":"+m1.get(e.getKey())+", " + j+":"+m1.get(e.getKey() * r) + ", " + k+":"+m1.get(e.getKey()*r*r));
                    c+=e.getValue()*m1.get(e.getKey()*r)*m1.get(e.getKey()*r*r);
                    System.out.println("val :"+c+",.");
                }
                else{
                    System.out.println(".."+e.getKey()+":"+e.getValue()+"..,");
                }
            }
        }
        return c;
    }
    public static void main(String[] args) throws IOException{
        File file=new File("E:\\sujeet\\netbeans_project\\PracticeCodings\\src\\practicecodings\\input02.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
