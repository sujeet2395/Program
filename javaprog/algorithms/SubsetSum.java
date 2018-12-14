package Algorithms;

public class SubsetSum {
    
    public static boolean subsetSum(int ar[], int k)
    {
        boolean t[][]=new boolean[ar.length+1][k+1];
        int i, j;
        for(i=0; i<=ar.length; i++)
        {
            t[i][0]=true;
        }
        for(i=1; i<=ar.length; i++)
        {
            for(j=1; j<=k; j++)
            {
                if(j>=ar[i-1])
                {
                    t[i][j]=t[i-1][j]||t[i-1][j-ar[i-1]];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[ar.length][k];
    }
    
     public static boolean partition(int ar[])
    {
        int i, j;
        int sum=0;
        for(i=0; i<ar.length; i++)
        {
            sum+=ar[i];
        }
        if(sum%2!=0)
        {
            return false;
        }
        sum/=2;
        boolean t[][]=new boolean[ar.length+1][sum+1];
        for(i=0; i<=ar.length; i++)
        {
            t[i][0]=true;
        }
        for(i=1; i<=ar.length; i++)
        {
            for(j=1; j<=sum; j++)
            {
                if(j>=ar[i-1])
                {
                    t[i][j]=t[i-1][j]||t[i-1][j-ar[i-1]];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[ar.length][sum];
    }
    
    public static void main(String[] args) {
        int ar[]=new int[]{1, 2, 3, 4, 8};
        int k=12;
        System.out.println("subset sum: "+subsetSum(ar, k));
        System.out.println("partition: "+partition(ar));
    }
}
