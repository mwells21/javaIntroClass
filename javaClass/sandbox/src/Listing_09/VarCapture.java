package Listing_09;

//An example of capturing a local variable from the enclosing scope. 

interface MyFunc {
   int func(int n);
}

class VarCapture {
   public static void main(String args[]) {
      // A local variable that can be captured.
      int num = 10;

      MyFunc myLambda = (n) -> {
         // This use of num is OK. It does not modify num.
         int v = num + n;

         // However, the following is illegal because it attempts
         // to modify the value of num.
         // num++;

         return v;
      };

      System.out.println("1) After myLambda, num = " + num + ", myLambda = " + myLambda.func(5));
      
      // The following line would also cause an error, because
      // it would remove the effectively final status from num.
      // num = 9;
      
      System.out.println("2) After myLambda, num = " + num + ", myLambda = " + myLambda.func(6));

   }
}
