package MatrixSeries;

public class PowerObj{
    private int a;
    private int b;

    public PowerObj() {
        this.a = 0;
        this.b = 0;
    }
    
    public PowerObj(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "PowerObj{" + "a=" + a + ", b=" + b + '}';
    }
    
    public static PowerObj addPow(PowerObj a, PowerObj b) {
        PowerObj r=new PowerObj();
        r.setA(a.getA()+b.getA());
        r.setB(a.getB()+b.getB());
        return r;
    }
}
