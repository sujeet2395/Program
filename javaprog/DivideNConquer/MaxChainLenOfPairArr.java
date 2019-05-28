package DivideNConquer;

import java.util.*;

public class MaxChainLenOfPairArr {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Pair pr[] = new Pair[n];
            int arr[] = new int[2*n];
            for(int i = 0; i < 2*n; i++)
            {
               arr[i] = sc.nextInt();
            }
            for(int i = 0, j = 0; i < 2*n-1 && j < n; i = i+2, j++)
            {
                pr[j] = new Pair(arr[i], arr[i+1]);
            }
            GfG g = new GfG();
            System.out.println(g.maxChainLength(pr, n));
        }
    }
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


/*class CompareByFirst implements Comparator<Pair>
{
   public int compare(Pair a, Pair b)
    {
        return a.x - b.x;
    }
}*/
class GfG implements Comparator<Pair>
{
    public int compare(Pair a, Pair b)
    {
        return a.x-b.x;
    }
    
    int maxChainLength(Pair arr[], int n)
    {
       /*Arrays.sort(arr, new GfG());
       int maxc=-1, j;
       for(j=0; j<arr.length-1; j++)
       {
           Pair cur=arr[j];
           Pair next=arr[j+1];
           int i=j+1;
           int c=1;
           while(i<arr.length-1)
           {
                if(cur.y < next.x)
                {
                    cur=next;
                    next=arr[i+1];
                    c++;
                }
                i++;
           }
           if(c>maxc)
           {
               maxc=c;
           }
       }
       return maxc;*/
       Arrays.sort(arr,new Comparator<Pair>() {
        @Override
        public int compare(Pair c, Pair d) {
        return Integer.valueOf(c.y).compareTo(Integer.valueOf(d.y));
        }
        });
        //for(int i=0;i<n;i++)
        //    system.out.print(arr[i].x+"-"+arr[i].y+"="" ");="" 
        //    system.out.println();="" 
        int cnt=1; 
        int max=arr[0].y; 
        for(int i=1; i<n; i++){
            if(arr[i].x>max){
            max=arr[i].y;
            cnt++;
            }
        }
        return cnt;
    }
}
class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}