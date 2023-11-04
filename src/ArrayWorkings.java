public class ArrayWorkings {
    public static void main(String[] args) {
//    When we have an array of numbers but there are no numbers in the array, by
//    default, the even and odd numbers will be 0. This is why we have
//    "countEvenNumber" and "countOddNumber"

        int countEvenNumber = 0;
        int countOddNumber = 0;

        int[] listOfNumbers = {1, 2, 5, 4, 7, 8, 6, 9, 34, 45, 78, 83};

        for (int number : listOfNumbers) {
//          then I asked the "number" variable to divide all the integers by 2 and then
//          make sure the remainder is equals to 0; just to get the even numbers.
            if (number % 2 == 0) {
//                then we said, if the remainder is equal to 0, it should be counted as
//                an even number
                countEvenNumber++;

            }

            else {
                countOddNumber++;
            }
            }
        System.out.println("We have " + countEvenNumber + "even numbers");
        System.out.println("We have " + countOddNumber + "odd numbers");

    }

    }
