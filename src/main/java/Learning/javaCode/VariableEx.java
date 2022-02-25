package Learning.javaCode;

public class VariableEx extends First {
    int a=10;

    VariableEx() {
        System.out.println("In default con of variableEx");
    }
    VariableEx(int a){
        System.out.println("In con int");
    }

    VariableEx(String a){
        super(2);
        System.out.println("in con string");
    }

    public void display() {
        int b=10;
        //printDisplay("This");
        System.out.println(b);
        System.out.println(a);
    }

    public void sum(int a1, int b1, String s) {
        System.out.println(a1 + b1);
        System.out.println("In child sum method");

    }

    public static void main(String args[]) {
        VariableEx variableEx= new VariableEx("45");
    }
}
