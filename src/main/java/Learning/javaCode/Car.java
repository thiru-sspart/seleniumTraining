package Learning.javaCode;

public class Car implements Vehicles {

    int wheels= 4;
    int seats= 8;


    public void driving() {
        System.out.println("I can drive at speed till 180");
    }

    public void seating() {
      System.out.println("I can provide seats till 8");
    }


    public void racing() {
      System.out.println("I can raise");
    }

    @Override
    public void m3() {

    }

    public  void displayCar() {
        System.out.println("Hii");
    }

    public static void main(String args[]) {
      Vehicles v = new Car();
      v.driving();

    }

}
