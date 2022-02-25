package Learning.javaCode;

public class Bike {

    public static final int x=100;

    public int a= 3;


    public void driving()  {
        First f= new First();
        System.out.println(f.ob());
         f.sum(3,4, "thiru");
        f.printDisplay("This is Thiru");
        try{
        Thread.sleep(3000);}catch(Exception e){}
        System.out.println("driving tat a speed of 50 km/hr");

    }

}


