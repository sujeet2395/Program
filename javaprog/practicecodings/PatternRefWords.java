package practicecodings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PatternRefWords {
    
    public static String shortP(String pt)
    {
        StringBuilder s=new StringBuilder();
        int l=pt.length();
        int i=0;
        while(i<l)
        {
            if(pt.charAt(i)>='A' && pt.charAt(i) <='Z')
            {
                s.append(pt.charAt(i));
            }
            i++;
        }
        return s.toString();
    }
    
    public static String findWord(String p, String[] dic) {
        StringBuilder res=new StringBuilder();
        List<String> list;
        Map<String, List<String>> dm=new HashMap<>();
        int i;
        for(i=0; i<dic.length; i++)
        {
            if(dm.containsKey(shortP(dic[i])))
            {
                list=(ArrayList<String>)dm.get(shortP(dic[i]));
                list.add(dic[i]);
            }
            else{
                list= new ArrayList<String>();
                list.add(dic[i]);
                dm.put(shortP(dic[i]), list);
            }
        }
        
        List<String> newList=new ArrayList<>();
        Set<Entry<String, List<String>>> set=dm.entrySet();
        for( Entry se:set)
        {
            if(((String)se.getKey()).startsWith(p))
            {
                list=(ArrayList<String>)se.getValue();
                newList.addAll(list);
            }
        }
        if(newList.size()==0)
        {
            res.append("No match found");
        }else{
            Collections.sort(newList);
            for(String w:newList)
            {
               res.append(w+" ");
            }
        }
     return res.toString();
    }
    
    public static void main(String[] args) {
        int t, n, k;
        String s, p;
        String res;
        String[] dic;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
            dic=new String[n];
            k=0;
            while(n-->0)
            {
                s=sc.next();
                dic[k++]=s;
            }
            p=sc.next();
            res=findWord(p, dic).trim();
            System.out.println(res);
        }
        
        /** input
         * 
            2
            11
            Hi Hello HelloWorld HiTech HiGeek HiAplha HiApple HiTechWorld HiTechCity HiTechLab HiA
            HA
            4
            WelcomeGeek WelcomeToGeeksForGeeks WelTeG GeeksForGeeks
            WTG
        * output
            HiA HiAplha HiApple
            WelTeG WelcomeToGeeksForGeeks
         */
    }
}
