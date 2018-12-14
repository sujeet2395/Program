package practicecodings;

public class ReverseWordSen {
    public static String reverseWordSen(String s) {
        StringBuilder sb=new StringBuilder();
        String arr[]=s.split(" ");
        int i;
        for(i=arr.length-1; i>0; i--)
        {
            sb.append(arr[i]+" ");
        }
        sb.append(arr[i]);
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWordSen("I love my India"));
    }
}
