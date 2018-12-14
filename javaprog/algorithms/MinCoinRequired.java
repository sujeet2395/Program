package Algorithms;

public class MinCoinRequired {
    public static int minCoins(int[] coins, int v) {
        int i, j;
        int[] tables=new int[v+1];
        int sub_res=Integer.MAX_VALUE;
        tables[0]=0;
        for(i=1; i<=v; i++)
        {
            tables[i]=Integer.MAX_VALUE;
        }
        for(i=1; i<=v; i++)
        {
            for(j=0; j<coins.length; j++)
            {
                if(coins[j]<=i)
                {
                    sub_res=tables[i-coins[j]];
                    if(sub_res!=Integer.MAX_VALUE && sub_res+1<=tables[i])
                    {
                        tables[i]=sub_res+1;
                    }
                }
            }
            
        }
        return tables[v];
    }
    public static void main(String[] args) {
        int coins[]={1,9,5,6};
        int v=11;
        System.out.println("coins "+minCoins(coins, v));
    }
}
