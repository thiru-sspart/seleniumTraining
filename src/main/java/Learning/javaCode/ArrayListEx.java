package Learning.javaCode;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    public static void main(String args[]) {

        ArrayList<Integer> li= new ArrayList<>();

        li.add(3);
        li.add(4);
        li.add(1);

        int[] a= new int[5];
        a[0]= 3;
        a[1]= 4;

//        Iterator itr=li.iterator();
//        while(itr.hasNext()){//check if iterator has the elements
//            System.out.println(itr.next());//printing the element and move to next
//        }

        System.out.println(li.get(2));
        Collections.sort(li);
        System.out.println(li);




    }
}
