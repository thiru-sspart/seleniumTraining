package Learning.javaCode;

public class ConstructorEx extends ConsChaining{
    int a;
    int b;

    public ConstructorEx(int c, int d) {
//        this();
        super();
        a= c;
        b= d;

    }

//    public ConstructorEx(){
//        System.out.println("Cosn ex");
//    }

    public void sum() {
        System.out.println(a+b);
    }

    public static void main(String args[]) {
        ConstructorEx c = new ConstructorEx(2,3);
        c.sum();
    }
}
