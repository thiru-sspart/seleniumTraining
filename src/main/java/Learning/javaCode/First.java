package Learning.javaCode;

 public class First {

     public First() {
         System.out.println("In constrcutor of First class");
     }

     First(int a){
         System.out.println("in first con of int");
     }

     First(String a){
         System.out.println("in first con of String");
     }

    int a= 1;
    int b= 2;
    int c= 3;

    String ab= "Thirumala";
    String bc= "Java is a language";

    double d= 1.2;
    char c1= 'a';
    float f1= 0.2f;
    Boolean bo= true;

    public void printDisplay(String data) {
        System.out.println(data);
    }

    public int add() {
       int res= a+b+c;
       return res;
    }

    public void sum(int a1, int b1, String data) {
        System.out.println(a1 + b1);
        System.out.println(data);
        System.out.println("In parent sum method");

    }

    public First ob(){
        First o= new First();
        return o;
    }

}
