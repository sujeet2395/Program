package practicecodings;

public class MaxSubsetSumKadaneAlgo {
    public static void maxSubsetSum(int[] a)
    {
        int cur_sum=a[0], sum=a[0];
        int i, s=0, e=0, ss=0, se=0;
        for(i=1; i<a.length; i++)
        {
            if(a[i]>cur_sum+a[i])
            {
                cur_sum=a[i];
                s=i;
                e=i;
            }else
            {
                cur_sum+=a[i];
                e=i;
            }
            if(cur_sum>sum)
            {
                sum=cur_sum;
                ss=s;
                se=e;
            }
        }
        for(i=ss; i<=se; i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println(". sum "+sum);
    }
    public static void main(String[] args) {
        int[] a={2,3,-6, 1,2,3,-4, 5, -2};
        maxSubsetSum(a);
    }
}
