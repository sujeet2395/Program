package practicecodings;

public class SnakeBoardMove {
    private static int[] ladders=new int[16];
    private static int counter=0;
    
    public static void pbp(int src, int dest, String path) {
        if(src==dest)
        {
            counter++;
            System.out.println(counter+". "+path);
            return;
        }
        if(src>dest)
        {
            return;
        }
        if(src==0)
        {
            pbp(1, dest, path+"1");
            pbp(1, dest, path+"6");
        }
        else if(ladders[src]!=0)
        {
            src=ladders[src];
            int inter;
            int dice;
            for(dice=1; dice<=6; dice++){
                inter=src+dice;
                pbp(src, dest, path+"m");
            }
        }else{
            int inter;
            int dice;
            for(dice=1; dice<=6; dice++){
                inter=src+dice;
                pbp(inter, dest, path+dice);
            }
        }
    }
    public static void main(String[] args) {
        ladders[2]=13;
        ladders[3]=11;
        ladders[5]=9;
        String path="";
        pbp(0, 15, path);
    }
}
