package StringManip;

public class PatternMatchedCount {
    public static void sufixAsPrefix(String p, int[] sp) {
        int i=1, j=0;
        while(i<p.length())
        {
            if(p.charAt(i)==p.charAt(j))
            {
                sp[i]=j+1;
                i++; j++;
            }else if(j>0){
                j=sp[j-1];
            }else{
                i++;
            }
        }
        
    }
    public static int patternCount(String s, String p) {
        int[] sp=new int[p.length()];
        int count=0;
        int i, j;
        sufixAsPrefix(p, sp);
        for(i=0; i<sp.length; i++)
        {
            System.out.println(sp[i]);
        }
        System.out.println();
        for( i=0, j=0; i<s.length();)
        {
            if(s.charAt(i)==p.charAt(j))
            {
                if(j==p.length()-1)
                {
                    count++;
                    System.out.println("found "+(i-j));
                    j=sp[j];
                }else{
                    j++;
                }
                i++;
            }else if(j>0){
                j=sp[j-1];
            }else{
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="hgeeksgeeksgeekforgeeksgeekforgeeks";
        String p="geeksgeek";
        
        System.out.println(patternCount(s, p));
        System.out.println(""+s.lastIndexOf(p, s.length()-1)+" "+s.indexOf(p,0));
    }
}
