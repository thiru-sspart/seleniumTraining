package Learning.javaCode;

import java.util.Iterator;
import java.util.TreeSet;

public class SetEx {

    public static void main(String args[]) {
       // HashSet<String> set = new HashSet<>();
        TreeSet<String> set = new TreeSet<>();
        set.add("v");
        set.add("a");
        set.add("d");
        set.add("c");
        set.add("a");
        set.add("z");

        System.out.println(set);
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
