package demotest;

public class TestCodeApt {

    public static void main(String[] args) {

        System.out.print(5 + 6 + "7 ");
        System.out.print("7" + 8 + 9);

        if ("string1".trim() == "string1".trim()) {
            System.out.print("Equal ");
        } else {
            System.out.print("Not Equal ");
        }

        if ("string1".trim() == "string1 ".trim()) {
            System.out.print("Equal");
        } else {
            System.out.print("Not Equal");
        }

    }
}
