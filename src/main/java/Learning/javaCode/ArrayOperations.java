package Learning.javaCode;

public class ArrayOperations {
    public static void main(String args[]) throws InterruptedException {
        int a[]= {2,5,2,8,1,6};
        int b[]= {2,3,6,7};
        Thread.sleep(3000);

        int c[]= new int[a.length+b.length];
        int ac[] = new int[1];
        try {
            int k= 1;
        }catch(ArrayIndexOutOfBoundsException e){System.out.println("In array size expectpion");}
        catch(Exception e){System.out.println("In aexpectpion");}
        finally {
            System.out.println("In finally");
        }
        //System.out.println(ac[1]);

        int d[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int res= 11;

        for(int i=0; i<d.length; i++){
            for(int j=0; j<3; j++){
                System.out.print(d[i][j]);
            }
            System.out.println();
        }


       // //To search an elemnt
//        for(int i=0; i<a.length; i++){
//            if(a[i]==2){
//                System.out.println(i+1 +"position");
//            }
//        }

       // Arrays.sort(a);
//        for(int i=0; i<a.length; i++){
//            for(int j=i+1; j<a.length; j++){
//                if(a[i]>a[j]){
//                    int temp= a[i];
//                    a[i]= a[j];
//                    a[j]= temp;
//
//                }
//            }
//        }
//        for(int i=0; i<a.length; i++){
//
//                System.out.print(a[6]);
//        }



    }
}
