package StringManip;

public class AdSpaceInMid {
    public static void main(String[] args) {
        String s="i am sujeet kumar sharma";
        StringBuilder sb=new StringBuilder();
        String[] ws=s.split(" ");
        for(String w : ws)
        {
            if(w.length()%2==0 && w.length()>=4)
            {
                sb.append(w.substring(0,w.length()/2)+" "+w.substring(w.length()/2));
            }else{
                sb.append(w+" ");
            }
            sb.append(" ");
        }
        System.out.println(sb.toString());
        StringBuilder ss=new StringBuilder();
        int i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(ch>='d')
                {
                    ss.append((char)(ch-3));
                }else{
                    ss.append((char)(23+ch));
                }
            }else{
                ss.append(ch);
            }
            i++;
        }
        System.out.println(ss);
    }
}
