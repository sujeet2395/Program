package practicecodings;

import java.util.Arrays;

public class FindNumberOfPlatform {
    public static int findNumberofPlatform(int[] arv, int[] dep)
    {
        Arrays.sort(arv);
        Arrays.sort(dep);
        int platform_need=1, result=1;
        int i=1, j=0;
        while(i<arv.length && j<dep.length)
        {
            if(arv[i]<=dep[j])
            {
                platform_need++;
                i++;
                if(platform_need>result)
                    result=platform_need;
            }else{
                platform_need--;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arv={900, 940, 1000, 1050, 1200, 1230};
        int[] dep={930, 1010, 1055, 1100, 1220, 1250};
        int need=findNumberofPlatform(arv, dep);
        System.out.println(need);
    }
}
