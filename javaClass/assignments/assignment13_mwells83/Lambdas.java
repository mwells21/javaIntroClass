/**
  * @author Michael Wells
  * @version 1.0
*/

import java.util.*;
import java.util.function.Function; 



public class Lambdas
{
  public static double lambdaBlock(List<Double> listOfNumbers){
    double maximum, minimum, mean = 0.0;
    maximum = listOfNumbers.stream().max(Comparator.comparing(number -> number)).get();
    System.out.println("Max: " + maximum);
    minimum = listOfNumbers.stream().min(Comparator.comparing(number -> number)).get();
    System.out.println("Min: " + minimum);
    mean = listOfNumbers.stream().mapToDouble(number -> number).average().getAsDouble();
    return mean; 
    }
  public static void main( String [] args )
  {

    List<Double> listOfNumbers = Arrays.asList(17.64, 55.56, 36.93, 55.96, 20.23, 41.74, 1.8, 95.97, 81.89, 36.16, 34.41, 87.9, 13.74, 11.15);
    Collections.sort(listOfNumbers);
    double mean = lambdaBlock(listOfNumbers);
    System.out.println("Mean: " + mean );
















    double[] numbers = {17.64, 55.56, 36.93, 55.96, 20.23, 41.74, 1.8, 95.97, 81.89, 36.16, 34.41, 87.9, 13.74, 11.15};

    ArrayList<MyClass> al = new ArrayList<MyClass>();

    ArrayList<Double> testDbl = new ArrayList<Double>();

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
      testDbl.add(numbers[i]);
    }


    //System.out.println(maxVal);
    //MyClass maxValObj = Collections.max(al, Comparator.comparing(t -> t.getVal()));
    //MyClass minValObj = Collections.min(al, Comparator.comparing(t -> t.getVal()));
    al.sort(Comparator.comparingDouble(MyClass::getVal));
    double median = al.get(al.size()/2).getVal();
    if(al.size()%2 == 0) median = (median + al.get(al.size()/2-1).getVal()) / 2;

    //Collections.sort(testDbl, (o1, o2) -> (o1 > o2) ? -1 : 
    //(o1 < o2) ? 1 : 0); 
    
    


    //MyClass avgValObj = al.stream().mapToDouble(t -> t).average().orElse(0.0);
    //Collections.sort(al);
    //System.out.println(al);

    //MyClass minValObj = Collections.(al, al.stream.mapToDouble(t -> t.getVal()));

    //System.out.println("Maximum value is: " + maxValObj.getVal());
    //System.out.println("Minimum value is: " + minValObj.getVal());
    //System.out.println("Median: " + median);
    //System.out.println("Sorted: " + testDbl);

  }


}
