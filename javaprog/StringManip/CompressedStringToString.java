package Algorithms;

public class CompressedStringToString {
    public static String compressedToString(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sbrest=new StringBuilder();
        StringBuilder sbres=new StringBuilder();
        int i;
        int flag=0;
        for(i=0; i<s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                sb.append(s.charAt(i));
                sbrest.append(s.charAt(i));
                flag=2;
            }else if(Character.isDigit(s.charAt(i)))
            {
                int t=s.charAt(i)-'0';
                int j;
                flag=1;
                sbres.setLength(0);
                for(j=0; j<t; j++){
                    sbres.append(sb.toString());
                }
                sb.setLength(0);
                sb.append(sbres.toString());
                sbrest.setLength(0);
            }
        }
        if(flag==2)
            sbres.append(sbrest.toString());
        return sbres.toString();
    }
    public static void main(String[] args) {
        String a="a1b2c";
        String res=compressedToString(a);
        System.out.println(res);
    }
}
