package Learning.javaCode;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String args[]) {
        Map<Integer, String> map= new HashMap<>();
        map.put(1, "Thiru");
        map.put(2, "Mrudula");
        map.put(10, "Java");

        System.out.println(map.get(2));
    }
}
