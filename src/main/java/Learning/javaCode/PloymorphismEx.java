package Learning.javaCode;

public class PloymorphismEx {

    public void add() {
        System.out.println("In add method");
    }

    public  void add(String q){
        System.out.println("In add method"+q);
    }


    public  void add(int q){
        System.out.println("In add method"+q);
    }

    public int add(int q, int z) {
        return q+z;
    }

    public static void main(String args[]){
        PloymorphismEx p= new PloymorphismEx();
        p.add();
        p.add("Thiru");
        p.add(3);
        System.out.println(p.add(2,3));
    }
}
