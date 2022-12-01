public class typePromotion {
    

    public static void main(String[] args) {
        /*
         * java automatically promotes byte ,  short , char to   int while evalutuing expression
         * if one operand is long , float , double then whole expression promotes to long , float , double respectivity
         * 
         * a+b*c/e
         */

        char a = 'a';
         char b = 'b';
      //   char c = a-b; // int to char 



         System.out.println((int)a);
         System.out.println((int)b);
         System.out.println(b-a); // type promotion only on expreesion
         System.out.println(a);


         short x = 5;
         byte y = 25;
         char z = 'c';
         byte bt = (byte) (x+y+z);   // type casted to int to byte 
         System.out.println(bt);


         int i = 10;
         float f = 20.5f;
         long l = 25;
         double d = 30;
         //int ans1 = i+f+l+d;
         double ans = i+f+l+d;

         System.out.println(ans);



    }

}
