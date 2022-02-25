package Learning.javaCode;

public class Second {
    public static void main(String args[]) {
        Bike b = new Bike();
        b.driving();
        System.out.println(b.a);
        PrivateEx p= new PrivateEx();
        p.method1();
        ProtectedEx po= new ProtectedEx();
        System.out.println(po.in);
        ConstructorEx c= new ConstructorEx(2, 6);
        c.sum();
    }
}
