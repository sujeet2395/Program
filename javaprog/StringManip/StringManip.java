package StringManip;

public class StringManip {
    public static void main(String[] args) {
        String s="Hacker";
        int k=2;
        StringBuilder sb=new StringBuilder();
        while(k>0){
            sb.append(s.charAt(s.length()-k));
            k--;
        }
        sb.append(s.substring(k));
        System.out.println(""+sb.toString());
    }
}
