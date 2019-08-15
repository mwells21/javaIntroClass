//Use a method reference to help find the maximum value in a collection.
import java.util.*;
import java.util.ArrayList;
import java.util.List;

class MyClass {
  private double val;
   MyClass(double v) {
      val = v;
   }

   double getVal() {
      return val;
   }


}

class UseMethodRef {
   // A compare() method compatible with the one defined by Comparator<T>.
   static double compareMC(MyClass a, MyClass b) {
     if(a.getVal() > b.getVal()){}
      return a.getVal() - b.getVal();
   }

   public static void main(String args[]) {
      ArrayList<MyClass> al = new ArrayList<MyClass>();

      double test = 1.1;
      MyClass testClass = new MyClass(test);

      al.add(testClass);
      al.add(new MyClass(4.1));
      al.add(new MyClass(2.1));
      al.add(new MyClass(9.1));
      al.add(new MyClass(3.1));
      al.add(new MyClass(7.1));
      //System.out.println(testClass.getVal());
      //System.out.println(al.get(0).getVal());
      //System.out.println(al.get(1).getVal());


      MyClass maxValObj = Collections.max(al, Comparator.comparing(t -> t.getVal()));

      System.out.println("Maximum value is: " + maxValObj.getVal());
   }
}
