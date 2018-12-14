package demotest;

public class StringTest {

    public static void main(String[] args) {
        String s = "geeks";
        String s1 = "geeks";
        String obj1 = new String(s1);
        String obj2 = new String(obj1);
        if (obj1.hashCode() == obj2.hashCode()) {
            System.out.println("hashCode of object1 is equal to object2");
        }

        //if(!(obj1 == obj2))
        System.out.println("memory address of object1 is same as object2" + obj1 == obj2);
        System.out.println("" + s1 == obj1);
        System.out.println("" + s == s1);
        if (obj1.equals(obj2)) {
            System.out.println("value of object1 is equal to object2");
        }
    }
}
