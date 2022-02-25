package Learning.javaCode;

public class BikeEx implements Vehicles{

//    @Override
    public void m1() {
        System.out.println("In m1 method of child abstract class");
    }

    public void m2() {
        System.out.println("Hii in child class method m2");
    }

    public static void main(String args[]) {
        int a= 10;
        int b= 50;
        String tab= "Home";
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

       for(int i=0; i<5; i++){
           for(int j=0; j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
       }

//       while(a<10) {
//           System.out.println(a);
//           a++;
//       }

//       do{
//           System.out.println(a);
//           a++;
//       }while(a>10);

        switch (tab) {
            case "Home":
                System.out.println("In home tab");
                break;
            case "Profile":
                System.out.println("In profle page");
                break;
        }
       System.out.println(a++);

       int a1= 1;
       int b1= 2;
       int c1= 3;
       int a2[]= {1,2,3};
       String x[]= {"Hi", "java", "Cuucmber"};

       for(int i=0; i<x.length; i++){
           System.out.println(x[i]);
       }


    }

    @Override
    public void driving() {

    }

    @Override
    public void seating() {

    }

    @Override
    public void racing() {

    }
}
