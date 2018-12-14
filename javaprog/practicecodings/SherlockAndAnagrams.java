package practicecodings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAndAnagrams {
//    public static void createhashMap
    public static int sherlockAndAnagrams(String s) {
        int i, j;
        int l=s.length();
        int count=0;
        for(i=1; i<l; i++)
        {
            List<String> list=new ArrayList<String>();
            List<char[]> listh=new ArrayList<>();
            for(j=0; j+i<=l; j++)
            {
                String sub=s.substring(j, j+i);
                list.add(sub);
                System.out.println(sub+",");
                char[] a=sub.toCharArray();
                Arrays.sort(a, 0, a.length);
                listh.add(a);
            }
            
            int k, m;
            for(k=0; k<list.size()-1; k++)
            {
                String first=list.get(k);
                char[] a=listh.get(k);
                for(m=k+1; m<list.size(); m++)
                {
                    char[] b=listh.get(m);
                    int n;
                    Boolean find=true;
                    for(n=0; n<a.length; n++)
                    {
                        if(a[n]!=b[n])
                        {
                            find=false;
                        }
                    }
                    if(find)
                    {
                        count++;
                    }
                }
            }
                /*
                Map<Integer,Integer> map=new HashMap();
                int c;
                for(c=0; c<first.length(); c++)
                {
                    int key=(int)(first.charAt(c));
                    if(map.containsKey(key))
                    {
                        map.put(key, map.get(key)+1);
                    }else{
                        map.put(key, 1);
                    }
                }
                for(m=k+1; m<list.size(); m++)
                {
                    String sec=list.get(m);
                    Map<Integer,Integer> maps=new HashMap();
                    
                    for(c=0; c<first.length(); c++)
                    {
                        int key=(int)(sec.charAt(c));
                        if(maps.containsKey(key))
                        {
                            map.put(key, map.get(key)+1);
                        }else{
                            maps.put(key, 1);
                        }
                    }
                    
                }
            }*/
        }
        return count;
    }
    public static void main(String[] args) {
        int c=sherlockAndAnagrams("cdcd");
        System.out.println(c);
    }
}
