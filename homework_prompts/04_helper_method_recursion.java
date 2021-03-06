/*
 *  Homework 04 - Helper Method Recursion
 *
 *  Instructions: Using the Helper Method Recursive Pattern work through the
 *  following problems.
 *
 */

import java.io.*;
import java.util.*;


/**
 * 1a. What is the term when the recursive call invokes itself more than once.
 *  multiple recursion
 *
 */


/**
 * 1b. List the steps involved to build a Helper Method Recursion algorithm.
 * 1. instantiate variables
   2. return results
   3. create and call helper method
   4. base case
   5. recursive case
 * 
 */


/**
 * 1c. Should the recursive case or base case typically be tackled first?
 * 
 * base case
 */


/**
 *  2a. Print each integer in an array in order using Helper Method Recursion
 *
 *  Input:   arr {Array}
 *  Output:  {void}
 *
 *  Example: int[] nums = {1, 2, 3};
 *
 *          PrintArray.compute(nums) =>
 *          1
 *          2
 *          3
 */
class PrintArray {

  public static void compute(int[] arr) {
    // YOUR WORK HERE
    computeHelper(arr, 0);
  }

  public static void computeHelper(int[] nums, int index) {
    // YOUR WORK HERE
    if(index >= nums.length)return;
    
    System.out.println(nums[index]);
    
    computeHelper(nums, index+1);
    
  }
}

/**
 *  2b. Given an integer array, print each item backwards using Helper Method
 *      Recursion
 *
 *  Input:   arr {Array}
 *  Output:  {void}
 *
 *  Example: int[] nums = {1, 2, 3};
 *
 *          PrintReverse.compute(nums) =>
 *          3
 *          2
 *          1
 */
class PrintReverse {

  public static void compute(int[] arr) {
    // YOUR WORK HERE
    traverse(arr, index);
  }

  private static void traverse(int[] arr, int index) {
    // YOUR WORK HERE
    if(index < 0)return;
    System.out.println(arr[index]);
    traverse(arr, index-1);
  }
}


/**
 *  2c. Reverse a string using Helper Method Recursion
 *
 *  Input:   String
 *  Output:  String
 *
 *  Example: String greeting = 'hello';
 *          ReverseString.compute(greeting) => 'olleh'
 */
class ReverseString {

  public static String compute(String str) {
    // YOUR WORK HERE
    char[] ch = str.toCharArray();
    work(ch, 0, ch.length-1);
    return new String(ch);
  }
  
  public static void work(char[] ch, int l, int r){
    if(l > r)return;
    char c = ch[r];
    ch[r] = ch[l];
    ch[l] = c;
    work(ch, l+1, r-1);
    
  }

}


/**
 * 2d. Given an array of positive integers, create an array of two-item integer
 *     arrays (two dimensional integer array) using Helper Method Recursion
 *
 * Input:   Array of Integers
 * Output:  two-dimensional Integer Array
 *
 * Example: int[] nums = {1, 2, 3, 4, 5, 6};
 *          ArrayPairs.compute(nums)  =>
 *          {{1,2}, {3,4}, {5,6}}
 *
 * Example: int[] nums2 = {1, 2, 3, 4, 5};
 *          ArrayPairs.compute(nums2)  =>
 *          {{1,2}, {3,4}, {5, -1}}
 */
class ArrayPairs {
  
  
  static int[][] ret;
  static int index = 0;
  public static int[][] compute(int[] arr) {
    // YOUR WORK HERE
    ret = new int[(arr.length%2 == 0) ? arr.length/2 : arr.length/2 + 1][2];
    
    work(arr, 0);
    
    return ret;
  }
  
  public static void work(int[] nums, int i){
    if(i >= nums.length)return;
    
    ret[index][0] = nums[i];
    if((i+1) < nums.length) ret[index++][1] = nums[i+1];
    work(nums, i+2);
  }
}


/**
 * 2e. Flatten a two dimensional integer array using Helper Method of Recursion
 *
 * Input:   two-dimensional Integer Array
 * Output:  Array of Integers
 *
 * Example: int matrix[][]= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
 *          Flatten.compute(matrix) =>
 *          {1, 2, 3, 4, 5, 6, 7, 8, 9}
 */
class Flatten {
  static int[] ret;
  static int index;
  public static int[] compute(int[][] matrix) {
    // YOUR WORK HERE
    ret = new int[matrix.length*matrix[0].length];
    index = 0;
    work(matrix, 0);
    return ret;
  }
  
  public static void work(int[][] nums, int i){
    if(i >= nums.length)return;
    
    for(int j : nums[i]) ret[index++] = j;
    
    work(nums, i+1);
  }


}


/**
 * 2f. Given a base and an exponent, create a method to find the power using
 *     Helper Method Recursion
 *
 * Input:   Two Integers, base and exponent
 * Output:  Integer
 *
 * Example: Power.compute(3, 4) => 81
 */
class Power {

  public static int compute(int a, int b) {
    // YOUR WORK HERE
    return -1;
  }
  public static int work(int a, int b){
    if(b == 0) return 1;
    return a * work(a, b-1);
  }
  

}


/**
 * 2g. Merge two sorted arrays using the Helper Method Recursion
 *
 * Input:   Two Integer Arrays, both sorted
 * Output:  Integer Array, sorted
 *
 * Example: int[] nums1 = {1, 4, 7};
 *          int[] nums2 = {2, 3, 6, 9};
 *
 *          Merge.compute(nums1, nums2) =>
 *          { 1, 2, 3, 4, 6, 7, 9 }
 */
class Merge {

  public static int[] compute(int[] arr1, int[] arr2) {
    // YOUR WORK HERE
    int[] ret = new int[arr1.length + arr2.length];
    int i = 0, j = 0;
    int index = 0;
    while(i < arr1.length || j < arr2.length){
      if(i >= arr1.length)ret[index] = arr2[j++];
      else if(j >= arr2.length) ret[index] = arr1[i++];
      else{
        if(arr1[i] < arr2[j]){
          ret[index] = arr1[i++]; 
        }
        else {
          ret[index] = arr2[j++]; 
        }
      }
      index++;
    }
    return ret;

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

    // instantiate the testing of each module by resetting count and printing title of module
    int[] testCount = {0, 0};
    System.out.println("PrintArray tests");

    // tests are in the form as shown
    assertTest(testCount, "able to print the elements of [1,2,3] forwards", new Test() {
      public boolean execute() {

        PrintArray printArray = new PrintArray();

        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);

        // Print some output: goes to your special stream
        int[] input = {1,2,3};
        printArray.compute(input);

        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        //System.out.println("Here: " + baos.toString());

        return baos.toString().equals("1\n2\n3\n");
      }
    });

    assertTest(testCount, "does not print for an empty array", new Test() {
      public boolean execute() {

        PrintArray printArray = new PrintArray();

        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);

        // Print some output: goes to your special stream
        int[] input = {};
        printArray.compute(input);

        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        //System.out.println("Here: " + baos.toString());

        return baos.toString().equals("");
      }
    });

    assertTest(testCount, "able to print a single element array [5]", new Test() {
      public boolean execute() {

        PrintArray printArray = new PrintArray();

        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);

        // Print some output: goes to your special stream
        int[] input = {5};
        printArray.compute(input);

        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        //System.out.println("Here: " + baos.toString());

        return baos.toString().equals("5\n");
      }
    });


    // print the result of tests passed for a module
    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");




    // instantiate the testing of each module by resetting count and printing title of module
    testCount[0] = 0;
    testCount[1] = 0;
    System.out.println("PrintReverse tests");

    // tests are in the form as shown
    assertTest(testCount, "able to print the elements of [1,2,3] backwards", new Test() {
      public boolean execute() {

        PrintReverse printReverse = new PrintReverse();

        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);

        // Print some output: goes to your special stream
        int[] input = {1,2,3};
        printReverse.compute(input);

        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        //System.out.println("Here: " + baos.toString());

        return baos.toString().equals("3\n2\n1\n");
      }
    });

    assertTest(testCount, "does not print for an empty array", new Test() {
      public boolean execute() {

        PrintReverse printReverse = new PrintReverse();

        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);

        // Print some output: goes to your special stream
        int[] input = {};
        printReverse.compute(input);

        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        //System.out.println("Here: " + baos.toString());

        return baos.toString().equals("");
      }
    });

    assertTest(testCount, "able to print a single element array [5]", new Test() {
      public boolean execute() {

        PrintReverse printReverse = new PrintReverse();

        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);

        // Print some output: goes to your special stream
        int[] input = {5};
        printReverse.compute(input);

        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        //System.out.println("Here: " + baos.toString());

        return baos.toString().equals("5\n");
      }
    });


    // print the result of tests passed for a module
    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");



    // instantiate the testing of each module by resetting count and printing title of module
    testCount[0] = 0;
    testCount[1] = 0;
    System.out.println("ReverseString tests");

    // tests are in the form as shown
    assertTest(testCount, "able to reverse string 'hello'", new Test() {
      public boolean execute() {

        ReverseString reverseString = new ReverseString();

        return reverseString.compute("'hello'").equals("'olleh'");

      }
    });

    assertTest(testCount, "able to return an empty string for empty string input", new Test() {
      public boolean execute() {

        ReverseString reverseString = new ReverseString();

        return reverseString.compute("").equals("");

      }
    });

    assertTest(testCount, "able to return the same character for a single-character input string", new Test() {
      public boolean execute() {

        ReverseString reverseString = new ReverseString();

        return reverseString.compute("b").equals("b");
      }
    });


    // print the result of tests passed for a module
    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");



    // instantiate the testing of each module by resetting count and printing title of module
    testCount[0] = 0;
    testCount[1] = 0;
    System.out.println("ArrayPairs tests");

    // tests are in the form as shown
    assertTest(testCount, "should return [[1,2],[3,4],[5,6]] output for [1,2,3,4,5,6] input", new Test() {
      public boolean execute() {

        ArrayPairs arrayPairs = new ArrayPairs();

        int[] input = {1,2,3,4,5,6};
        int[][] output = arrayPairs.compute(input);

        return output.length == 3 &&
                  output[0][0] == 1 && output[0][1] == 2 &&
                  output[1][0] == 3 && output[1][1] == 4 &&
                  output[2][0] == 5 && output[2][1] == 6;

      }
    });

    assertTest(testCount, "should return [[1,2],[3,4],[5,-1]] output for [1,2,3,4,5] input", new Test() {
      public boolean execute() {

        ArrayPairs arrayPairs = new ArrayPairs();

        int[] input = {1,2,3,4,5};
        int[][] output = arrayPairs.compute(input);

        return output.length == 3 &&
                  output[0][0] == 1 && output[0][1] == 2 &&
                  output[1][0] == 3 && output[1][1] == 4 &&
                  output[2][0] == 5 && output[2][1] == -1;

      }
    });

    assertTest(testCount, "should return [] output for [] input", new Test() {
      public boolean execute() {

        ArrayPairs arrayPairs = new ArrayPairs();

        int[] input = {};
        int[][] output = arrayPairs.compute(input);

        return output.length == 0;

      }
    });


    // print the result of tests passed for a module
    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");




    // instantiate the testing of each module by resetting count and printing title of module
    testCount[0] = 0;
    testCount[1] = 0;
    System.out.println("Flatten tests");

    // tests are in the form as shown
    assertTest(testCount, "should return [1,2,3,4,5,6,7,8,9] output for [[1, 2, 3],[4, 5, 6],[7, 8, 9]] input", new Test() {
      public boolean execute() {

        Flatten flatten = new Flatten();

        int[][] input = {{1, 2, 3} ,{4, 5, 6}, {7, 8, 9}};
        int[] output = flatten.compute(input);

        return output.length == 9 &&
                  output[0] == 1 && output[1] == 2 &&
                  output[2] == 3 && output[3] == 4 &&
                  output[4] == 5 && output[5] == 6 &&
                  output[6] == 7 && output[7] == 8 &&
                  output[8] == 9;

      }
    });

    assertTest(testCount, "should return [] output for [] input", new Test() {
      public boolean execute() {

        Flatten flatten = new Flatten();

        int[][] input = {};
        int[] output = flatten.compute(input);
        return output.length == 0;

      }
    });

    // print the result of tests passed for a module
    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


    // instantiate the testing of each module by resetting count and printing title of module
    testCount[0] = 0;
    testCount[1] = 0;
    System.out.println("Power tests");

    // tests are in the form as shown
    assertTest(testCount, "should return 81 for 3 to the 4th power", new Test() {
      public boolean execute() {

        Power power = new Power();

        return power.compute(3,4) == 81;

      }
    });

    assertTest(testCount, "should return 1 for 5 to the 0th power", new Test() {
      public boolean execute() {

        Power power = new Power();

        return power.compute(5,0) == 1;

      }
    });

    assertTest(testCount, "should return 1 for 1 to the 100th power", new Test() {
      public boolean execute() {

        Power power = new Power();

        return power.compute(1,100) == 1;

      }
    });

    // print the result of tests passed for a module
    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


    // instantiate the testing of each module by resetting count and printing title of module
    testCount[0] = 0;
    testCount[1] = 0;
    System.out.println("Merge tests");

    // tests are in the form as shown
    assertTest(testCount, "should return [1, 2, 3, 4, 6, 7, 9] when merging [1, 4, 7] and [2, 3, 6, 9]", new Test() {
      public boolean execute() {

        Merge merge = new Merge();

        int[] input1 = {1,4,7};
        int[] input2 = {2,3,6,9};

        int[] output = merge.compute(input1, input2);

        return output.length == 7 &&
                  output[0] == 1 &&
                  output[1] == 2 &&
                  output[2] == 3 &&
                  output[3] == 4 &&
                  output[4] == 6 &&
                  output[5] == 7 &&
                  output[6] == 9;

      }
    });

    assertTest(testCount, "should handle inputs when left argument is empty array", new Test() {
      public boolean execute() {

        Merge merge = new Merge();

        int[] input1 = {};
        int[] input2 = {2,3,6,9};

        int[] output = merge.compute(input1, input2);

        return output.length == 4 &&
                  output[0] == 2 &&
                  output[1] == 3 &&
                  output[2] == 6 &&
                  output[3] == 9;

      }
    });

    assertTest(testCount, "should handle inputs when right argument is empty array", new Test() {
      public boolean execute() {

        Merge merge = new Merge();

        int[] input1 = {1,4,7};
        int[] input2 = {};

        int[] output = merge.compute(input1, input2);

        return output.length == 3 &&
                  output[0] == 1 &&
                  output[1] == 4 &&
                  output[2] == 7;

      }
    });

    assertTest(testCount, "should handle two empty arrays as inputs", new Test() {
      public boolean execute() {

        Merge merge = new Merge();

        int[] input1 = {};
        int[] input2 = {};

        int[] output = merge.compute(input1, input2);

        return output.length == 0;

      }
    });

    // print the result of tests passed for a module
    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");


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
