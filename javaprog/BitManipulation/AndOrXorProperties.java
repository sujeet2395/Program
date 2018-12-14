package BitManipulation;

public class AndOrXorProperties {
    public static void andProp() {
        System.out.println("f & f : "+(false&false));
        System.out.println("t & f : "+(true&false));
        System.out.println("f & t : "+(false&true));
        System.out.println("t & t : "+(true&true));
        System.out.println("--------------");
    }
    public static void orProp() {
        System.out.println("f | f : "+(false|false));
        System.out.println("t | f : "+(true|false));
        System.out.println("f | t : "+(false|true));
        System.out.println("t | t : "+(true|true));
        System.out.println("--------------");
    }
    public static void xorProp() {
        System.out.println("f ^ f : "+(false^false));
        System.out.println("t ^ f : "+(true^false));
        System.out.println("f ^ t : "+(false^true));
        System.out.println("t ^ t : "+(true^true));
        System.out.println("--------------");
    }
    public static void setKthBit(int n, int k) {
        int mask=1<<k;
        System.out.println(Integer.toBinaryString(n));
        n=n|mask;
        System.out.println(Integer.toBinaryString(n));
    }
    public static void setKthBitOff(int n, int k) {
        int mask=1<<k;
        int revmask=~mask;
        System.out.println(Integer.toBinaryString(n));
        n=n&revmask;
        System.out.println(Integer.toBinaryString(n));
    }
    public static void toogleKthBit(int n, int k) {
        int mask=1<<k;
        System.out.println(Integer.toBinaryString(n));
        n=n^mask;
        System.out.println(Integer.toBinaryString(n));
    }
    public static void printAllBits(int n) {
        int i, mask;
        System.out.println(Integer.toBinaryString(n));
        for(i=31; i>=0; i--)
        {
            mask=1<<i;
            if((n&mask)==0)
            {   
                System.out.print(0);
            }
            else{
                System.out.print(1);
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        //andProp();
        //orProp();
        //xorProp();
        int n=57;
        int k=3;
        setKthBit(n, k);
        setKthBitOff(n, k);
        toogleKthBit(n, k);
        printAllBits(n);
    }
}
