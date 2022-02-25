package Learning.javaCode;

public class StringOperations {
    public static String returnSteing() {
        StringBuffer res= new StringBuffer("Java Lanagauge");
        return res.toString();
    }

    public static void main(String args[]) {
        String s= "Thiru756765*&%mala";
        s= "Thieirtu";
        s.concat("4fhg");
        System.out.println(s);
        char c= 'j';
        String s2= "Java Lanagauge";

        char c1[]= s2.toCharArray();
        String s1= returnSteing();
//        System.out.println(s.length());
//        System.out.println(s.equals(s2));
//        String s3[]= s.split(" ");
//        for(int i=0; i<s3.length; i++){
//            System.out.println(s3[i]);
//        }

        System.out.println(s.replaceAll("[^a-z A-Z]", " "));

        for(int i=c1.length-1; i>=0; i--){
            System.out.print(c1[i]);
        }
    }
}
