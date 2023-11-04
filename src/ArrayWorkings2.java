public class ArrayWorkings2 {
    public static void main(String[] args) {
//        You are given an array of integers. Write a Java program to find and print the
//        largest and smallest numbers in the array.

       int countLargestNumber = 0;
       int countSmallestNumber = 0;

//       then create an array of integers
        int [] listOfNumbers = {21, 84, 66, 16, 40, 33};

      int smallestNumber = listOfNumbers[0]; // Assume the first element is the minimum
      int largestNumber = listOfNumbers[0]; // Assume the first element is the maximum

      for (int index = 1; index < listOfNumbers.length; index++){
//        then
          if (listOfNumbers[index] < smallestNumber){
              smallestNumber = listOfNumbers[index];
          }
          if (listOfNumbers[index] > largestNumber){
              largestNumber = listOfNumbers[index];
          }
      }
        System.out.println("The largest number is " + largestNumber);
        System.out.println("The smallest number is " + smallestNumber);
    }
}
