/**
  * @author Michael Wells
  * @version 1.0
*/

import java.util.*;




public class Lambdas
{

  public static void summary(List<Double> input){
    double max;
    double min;
    double mean;

    max = input.stream().max(Comparator.comparing(dbl -> dbl)).get();
    min = input.stream().min(Comparator.comparing(dbl -> dbl)).get();
    mean = input.stream().mapToDouble(dbl -> dbl).average().getAsDouble();

    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
    System.out.println("Mean: "+ mean);

    }



  public static void main( String [] args )
  {

    List<Double> numbers = Arrays.asList(17.64, 55.56, 36.93, 55.96, 20.23, 41.74, 1.8, 95.97, 81.89, 36.16, 34.41, 87.9, 13.74, 11.15);

    summary(numbers);
    Collections.sort(numbers);
    double median;
    median = numbers.get(numbers.size()/2);
    if(numbers.size()%2 == 0) median = (median + numbers.get(numbers.size()/2-1));
    System.out.println("Median: " + median);




  }


}
