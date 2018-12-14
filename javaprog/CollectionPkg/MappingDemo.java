package CollectionPkg;

import java.util.HashMap;
import java.util.Map;

public class MappingDemo {
    public static void main(String[] args) {
        HashMap hm =new HashMap();
        hm.put("a", 1);
        hm.put("b", 3);
        if(hm.containsKey("a"))
            System.out.println(""+hm.get("b"));
        System.out.println(""+hm.get("ab"));
        Map m=hm;
        System.out.println(""+m.get("a"));
       
    }
}
