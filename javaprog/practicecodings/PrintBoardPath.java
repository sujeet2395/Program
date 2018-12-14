package practicecodings;

public class PrintBoardPath {
    public static void main(String[] args) {
        pbp(0,0,2,2,"");
    }
    public static void pbp(int sr, int sc, int dr, int dc, String psf)
    {
        if(sr==dr && sc==dc)
        {
            System.out.println("path: "+psf);
            return;
        }
        if(sc+1<=dc)
            pbp(sr, sc+1, dr, dc, psf+"H");
        if(sr+1<=dr)
            pbp(sr+1, sc, dr, dc, psf+"V");
    }
    public static void pbpreactive(int sr, int sc, int dr, int dc, String psf)
    {
        //termination base condition
        if(sr==dr && sc==dc)
        {
            System.out.println("path: "+psf);
            return;
        }
        //negative base condition, this makes extra call but clear for approach writing
        if(sc>dc || sr>dr)
            return;
        
        pbpreactive(sr, sc+1, dr, dc, psf+"H");
        pbpreactive(sr+1, sc, dr, dc, psf+"V");
    }
}
