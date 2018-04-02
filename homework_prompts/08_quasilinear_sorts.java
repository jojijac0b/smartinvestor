/**
 *  Homework 08 - Quasilinear Sorts
 *
 *
 *  Problem 1: Mergesort
 *
 *  Prompt:    Given an unsorted array of integers, return the array
 *             sorted using mergesort.
 *
 *  Input:     {Array}
 *  Output:    {Array}
 *
 *  Example:   [3,9,1,4,7] --> [1,3,4,7,9]
 */

import java.util.*;

// Worse Time Complexity: O(n^2)
// Worse Auxiliary Space Complexity: O(n)
// Average Time Complexity: O(nlogn)
// Average Auxiliary Space Complexity: O(n)
class Mergesort{
  public static int[] compute(int[] input) {
        if(input.length == 1)return input;
        int mid = input.length/2;
        int[] a = compute(Arrays.copyOfRange(input, 0, mid));
        int[] b = compute(Arrays.copyOfRange(input, mid, input.length));
        int[] ret = merge(a, b);
        return ret;
  }

  private static int[] merge(int[] array1, int[] array2){
    // YOUR CODE HERE
      int i = 0, j = 0, index = 0;
      int[] ret = new int[array1.length + array2.length];
      while(i < array1.length || j < array2.length){
          if(j >= array2.length)ret[index] = array1[i++];
          else if(i >= array1.length)ret[index] = array2[j++];
          else if(array1[i] < array2[j])ret[index] = array1[i++];
          else ret[index] = array2[j++];
          index++;
      }
    return ret;
  }
}



class Problems {
 /*
  *  Problem 2: Bucket Sort
  *
  *  Prompt:    Given an unsorted array of numbers which are randomly distributed
  *             across the a range, sort the numbers using bucket sort.
  *
  *  Input:     {ArrayList} - doubles
  *  Input:     {Double} - minimum of range (inclusive)
  *  Input:     {Double} - maximum of range (exclusive)
  *
  *  Output:    {ArrayList}
  *
  *  Example:   [0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434], 0.0, 1.0 -->
  *             [0.1234, 0.3434, 0.565, 0.656, 0.665, 0.897]
  *
  *  HINT:      Use either N buckets or square root of N buckets
  *             Recursively sort each bucket using bucketsort until the bucket
  *             size is less than 50.
  */

  // Average Time Complexity:
  // Worst Case Time Complexity:
  // Auxiliary Space Complexity:
  public static ArrayList<Double> bucketsort(ArrayList<Double> arr, Double min, Double max) {
    //YOUR WORK HERE
    return new ArrayList<Double>();
  }


 /*
  *  Problem 3: Kth Smallest Element in a Range
  *
  *  Prompt:    Given an unsorted array of whole integers in the range
  *             1000 to 9000, find the Kth smallest element in linear time
  *             The array can have duplicates.
  *
  *  Input:     {Array} - ints from 1000 to 9000
  *  Input:     {Integer} - target element
  *
  *  Output:    {Integer} - kth smalest element in the range
  *
  *  Example:   array = [1984, 1337, 9000, 8304, 5150, 9000, 8304], k=5
  *             output = 8304
  *
  */

  // Time Complexity:
  // Auxiliary Space Complexity:
  public static int kthSmallest(int[] arr, int k) {
    //YOUR WORK HERE
    return -1;
  }

}


////////////////////////////////////////////////////////////
///////////////  DO NOT TOUCH TEST BELOW!!!  ///////////////
////////////////////////////////////////////////////////////

// use the Main class to run the test cases
class Main {
  private int[] testCount;

  // an interface to perform tests
  public interface Test {
    public boolean execute();
  }

  public static void main(String[] args) {

    int[] testCount = {0, 0};
    System.out.println("Merge Sort Tests");

    // tests are in the form as shown
    assertTest(testCount, "should sort example input", new Test() {
      public boolean execute() {
        Mergesort mergesort = new Mergesort();
        return arraysEqual(mergesort.compute(new int[]{3, 9, 1, 4, 7}), new int[]{1, 3, 4, 7, 9});
      }
    });

    assertTest(testCount, "should return empty array for empty input", new Test() {
      public boolean execute() {
        Mergesort mergesort = new Mergesort();
        return arraysEqual(mergesort.compute(new int[]{}), new int[]{});
      }
    });

    assertTest(testCount, "should sort single-element input", new Test() {
      public boolean execute() {
        Mergesort mergesort = new Mergesort();
        return arraysEqual(mergesort.compute(new int[]{10}), new int[]{10});
      }
    });

    assertTest(testCount, "should sort moderate-sized input", new Test() {
      public boolean execute() {
        Mergesort mergesort = new Mergesort();
        int[] input = new int[1000];
        for (int i = 0 ; i < input.length ; i++) {
          input[i] = (int) Math.floor(Math.random() * 1000);
        }
        int[] inputSorted = new int[1000];

        System.arraycopy(input, 0, inputSorted, 0, input.length);

        int[] solution = new int[1000];
        System.arraycopy(input, 0, solution, 0, input.length);
        input = mergesort.compute(input);

        Arrays.sort(solution);
        return isSorted(input) && arraysEqual(input, solution);
      }
    });

    assertTest(testCount, "should sort large-sized input", new Test() {
      public boolean execute() {
        Mergesort mergesort = new Mergesort();
        int[] input = new int[1000000];
        for (int i = 0 ; i < input.length ; i++) {
          input[i] = (int) Math.floor(Math.random() * 1000000);
        }
        int[] inputSorted = new int[1000000];

        System.arraycopy(input, 0, inputSorted, 0, input.length);

        int[] solution = new int[1000000];
        System.arraycopy(input, 0, solution, 0, input.length);
        input = mergesort.compute(input);

        Arrays.sort(solution);
        return isSorted(input) && arraysEqual(input, solution);
      }
    });

    // print the result of tests passed for a module
    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");

    // instantiate the testing of each module by resetting count and printing title of module
    testCount[0] = 0;
    testCount[1] = 0;


    System.out.println("Bucket Sort Tests");

    // tests are in the form as shown
    assertTest(testCount, "should work on example input", new Test() {
      public boolean execute() {

        ArrayList<Double> inputList = new ArrayList<Double>(
          Arrays.asList(0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434));

        ArrayList<Double> sortedList = new ArrayList<Double>(
          Arrays.asList(0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434));

        Collections.sort(sortedList);

        Double[] result = new Double[inputList.size()];
        result = Problems.bucketsort(inputList, 0.0, 1.0).toArray(result);

        Double[] sorted = new Double[sortedList.size()];
        sorted = sortedList.toArray(sorted);

        return Arrays.equals(result, sorted);
      }
    });

    assertTest(testCount, "should work on empty input", new Test() {
      public boolean execute() {
        ArrayList<Double> inputList = new ArrayList<Double>();
        ArrayList<Double> sortedList = new ArrayList<Double>();

        Collections.sort(sortedList);

        Double[] input = new Double[inputList.size()];
        Problems.bucketsort(inputList, 0.0, 1.0);
        input = inputList.toArray(input);

        Double[] sorted = new Double[sortedList.size()];
        sorted = sortedList.toArray(sorted);

        return Arrays.equals(input, sorted);
      }
    });

    assertTest(testCount, "should work on single-element input", new Test() {
      public boolean execute() {

        ArrayList<Double> inputList = new ArrayList<Double>(
          Arrays.asList(0.5));
        ArrayList<Double> sortedList = new ArrayList<Double>(
          Arrays.asList(0.5));

        Collections.sort(sortedList);

        Double[] input = new Double[inputList.size()];
        Problems.bucketsort(inputList, 0.0, 1.0);
        input = inputList.toArray(input);

        Double[] sorted = new Double[sortedList.size()];
        sorted = sortedList.toArray(sorted);

        return Arrays.equals(input, sorted);
      }
    });

    assertTest(testCount, "should work on moderate-sized input", new Test() {
      public boolean execute() {

        ArrayList<Double> inputList = new ArrayList<Double>();
        ArrayList<Double> sortedList = new ArrayList<Double>();

        // Created sortedList and inputList
        Double random = 0.0;
        for(int i = 0; i < 1000; i++){
          random = Math.random();
          inputList.add(random);
          sortedList.add(random);
        }

        // Create Sorted Array
        Collections.sort(sortedList);
        Double[] sorted = new Double[sortedList.size()];
        sorted = sortedList.toArray(sorted);

        // Create Result Array
        Double[] result = new Double[inputList.size()];
        result = Problems.bucketsort(inputList, 0.0, 1.0).toArray(result);

        return Arrays.equals(result, sorted);
      }
    });


    // print the result of tests passed for a module
    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


    // instantiate the testing of each module by resetting count and printing title of module
    testCount[0] = 0;
    testCount[1] = 0;
    System.out.println("Kth Smallest Element Tests");

    assertTest(testCount, "should return 8304 for sample input", new Test() {
      public boolean execute() {
        return Problems.kthSmallest(new int[]{1984, 1337, 9000, 8304, 5150, 9000, 8304}, 5) == 8304;
      }
    });

    assertTest(testCount, "should return 1337 for 1st smallest element with sample input array", new Test() {
      public boolean execute() {
        return Problems.kthSmallest(new int[]{1984, 1337, 9000, 8304, 5150, 9000, 8304}, 1) == 1337;
      }
    });

    assertTest(testCount, "should return -1 when asking for kth smallest when k exceeds size of input array", new Test() {
      public boolean execute() {
        return Problems.kthSmallest(new int[]{1984, 1337, 9000, 8304, 5150, 9000, 8304}, 10) == -1;
      }
    });

    assertTest(testCount, "should work for single-element array", new Test() {
      public boolean execute() {
        return Problems.kthSmallest(new int[]{8304}, 1) == 8304;
      }
    });

    assertTest(testCount, "should work for a large array", new Test() {
      public boolean execute() {
        int[] testCase = new int[1000000];
        for(int i = 0; i < 1000000; i++){
          testCase[i] = (int)(Math.floor(Math.random() * 8000 + 1000));
        }
        int example = Problems.kthSmallest(testCase, 21875);
        Arrays.sort(testCase);

        return example == testCase[21874];
      }
    });


    // print the result of tests passed for a module
    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");
  }

  // function for checking if arrays are equal
  private static boolean arraysEqual(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
      return false;
    }

    for (int i = 0 ; i < arr1.length ; i++) {
      if (arr1[i] != arr2[i]) {
        return false;
      }
    }

    return true;
  }


  // checks if array is sorted in linear time
  private static boolean isSorted(int[] input) {
    if (input.length < 2) {
      return true;
    }

    for (int i = 1 ; i < input.length ; i++) {
      if (input[i-1] > input[i]) {
        return false;
      }
    }

    return true;
  }

  // do not edit below, this is to wrap the test and check for exceptions
  private static void assertTest(int[] count, String name, Test test) {
    String pass = "false";
    count[1]++;

    try {
      if (test.execute()) {
        pass = " true";
        count[0]++;
      }
    } catch(Exception e) {}
    String result = "  " + (count[1] + ")   ").substring(0, 5) + pass + " : " + name;
    System.out.println(result);
  }
}
