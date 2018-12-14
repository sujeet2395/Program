package javaprog;

import java.util.Scanner;

public class partial_interface {

    public static void main(String[] args) {
        power pow = new power_ab();
        Scanner s = new Scanner(System.in);
        int a, result;
        System.out.println("Enter the number ");
        a = s.nextInt();
        result = pow.sqr(a);
        System.out.println("squre of num " + a + " is " + result);
        result = pow.cube(a);
        System.out.println("cube of num " + a + " is " + result);
        power_a po = (power_a) pow;
        result = po.cube(a);
        System.out.println("cube of num " + a + " is " + result);
    }

}

interface power {

    public int sqr(int a);

    public int cube(int a);
}

abstract class power_a implements power {

    public int sqr(int a) {
        return a * a;
    }

}

class power_ab extends power_a {

    public int cube(int a) {
        return a * a * a;
    }

    public int twice(int a) {
        return 2 * a;
    }
}
