/**
  * @author Michael Wells
  * @version 1.0
*/

import java.util.*;

class MyMax{

  private double val;

  MyMax(double v) {
    val = v;
  }

  double getVal() {
    return val;
  }


}



public class Lambdas
{
  static double compareMC(MyMax a, MyMax b) {
     return a.getVal() - b.getVal();
   }

  public static void main( String [] args )
  {

    double[] numbers = {17.64, 55.56, 36.93, 55.96, 20.23, 41.74, 1.8, 95.97, 81.89, 36.16, 34.41, 87.9, 13.74, 11.15};

    ArrayList<MyClass> al = new ArrayList<MyClass>();

    double test = 1.1;
    MyClass testClass = new MyClass(test);
/*
    al.add(testClass);
    al.add(new MyClass(17.64));
    al.add(new MyClass(55.56));
    al.add(new MyClass(36.93));
    al.add(new MyClass(55.96));
    al.add(new MyClass(20.23));
    */
    for(int i = 0; i < numbers.length; i++){
      al.add(new MyClass(numbers[i]));
    }


    //System.out.println(maxVal);
    MyClass maxValObj = Collections.max(al, Comparator.comparing(t -> t.getVal()));
    MyClass minValObj = Collections.min(al, Comparator.comparing(t -> t.getVal()));
    //MyClass avgValObj = al.stream().mapToDouble(t -> t).average().orElse(0.0);


    //MyClass minValObj = Collections.(al, al.stream.mapToDouble(t -> t.getVal()));

    System.out.println("Maximum value is: " + maxValObj.getVal());
    System.out.println("Minimum value is: " + minValObj.getVal());

  }


}
