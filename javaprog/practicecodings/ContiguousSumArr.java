package practicecodings;

public class ContiguousSumArr {
    
    public static long maxSumSubArr(int[] a ) {
        long sum_so_far=0, sum_end=0;
        int i;
        for(i=0; i<a.length; i++)
        {
            sum_end+=a[i];
            if(sum_end<0)
            {
                sum_end=0;
            }else if(sum_so_far<sum_end)
            {
                sum_so_far=sum_end;
            }
        }
        return sum_so_far;
    }
    
    public static long maxSumSubArrPositive(int[] a ) {
        long sum_so_far=0, sum_end=0;
        int i;
        for(i=0; i<a.length; i++)
        {
            if(a[i]>=0)
            {
                sum_end+=a[i];
                if(sum_so_far<sum_end)
                {
                    sum_so_far=sum_end;
                }
            }else{
                sum_end=0;
            } 
        }
        return sum_so_far;
    }
    
    public static long maxSumSubArrEvenAllNegtive(int[] a ) {
        long sum_so_far=a[0], cur_sum=a[0];
        int i;
        for(i=1; i<a.length; i++)
        {
            cur_sum=Math.max(a[i], cur_sum+a[i]);
            sum_so_far=Math.max(sum_so_far, cur_sum);
        }
        return sum_so_far;
    }
    
    public static void main(String[] args) {
        int[] a=new int[]{1,-5,9,2,-8,3,9,-2};
        System.out.println(maxSumSubArr(a)+"");
        System.out.println(maxSumSubArrPositive(a)+"");
        int[] ar=new int[]{-4,-5,-9,-2,-8,-3,-9,-1, 4};
        System.out.println(maxSumSubArrEvenAllNegtive(ar)+"");
    }
}
