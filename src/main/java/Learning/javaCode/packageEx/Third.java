package Learning.javaCode.packageEx;

import Learning.javaCode.Bike;
import Learning.javaCode.DefaultEx;
import Learning.javaCode.First;
import Learning.javaCode.ProtectedEx;

import java.util.ArrayList;

public final class Third extends ProtectedEx {
    static {
        System.out.println("In static block");
    }

    public static void displayS() {
        System.out.println("In static method");
    }
    public static void main(String args[]) {

        ArrayList<String> al= new ArrayList<>();

//        Bike b = new Bike();
//        b.driving();
//        System.out.println(b.a);
        Third po= new Third();
        System.out.println(po.in);
        DefaultEx  d= new DefaultEx();
        First f = new First();
        int res= Bike.x;
        Third.displayS();

    }
}
