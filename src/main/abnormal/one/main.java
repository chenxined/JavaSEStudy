package main.abnormal.one;

public class main {
    public static void main(String[] args) {
        System.out.println(test(1));
    }

   static   int  test(int a){

       try {
           return   a;
       } catch (Exception e) {
           return 0;
       }finally {
           a=a+1;
       }


   }
}
