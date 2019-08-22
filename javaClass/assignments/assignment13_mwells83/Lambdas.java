/**
  * @author Michael Wells
  * @version 1.0
*/

import java.util.*;


/**
 * Lambdas defines a list of double values, then calculate and prints the max, min, mean, and median of the list
*/
public class Lambdas
{

/**
  * @param input Double list
  * calculates and prints the max, min, and mean of list
*/
  public static void summary(List<Double> input){

    // Define variables
    double max;
    double min;
    double mean;

    // calculate max, min, and mean
    max = input.stream().max(Comparator.comparing(dbl -> dbl)).get();
    min = input.stream().min(Comparator.comparing(dbl -> dbl)).get();
    mean = input.stream().mapToDouble(dbl -> dbl).average().getAsDouble();

    // Print 
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);
    System.out.println("Mean: "+ mean);

    }



  public static void main( String [] args )
  {
    double median;

    // Init List
    List<Double> numbers = Arrays.asList(17.64, 55.56, 36.93, 55.96, 20.23, 41.74, 1.8, 95.97, 81.89, 36.16, 34.41, 87.9, 13.74, 11.15);

    // Max, Min, Mean
    summary(numbers);

    // Sort
    Collections.sort(numbers);

    // Median
    median = numbers.get(numbers.size()/2);
    if(numbers.size()%2 == 0) median = (numbers.get((numbers.size()/2)+1) + numbers.get((numbers.size()/2)-1))/2;
    System.out.println("Median: " + median);




  }


}
