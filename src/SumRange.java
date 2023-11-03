public class SumRange {
    public static void main(String[] args) {
//        Create an array variable and name it "sum" that stores lists of integers
//        To add a value inside an array, you need "{add value here}"
        int [] sum = {2, 5, 8, 1, 0, 4, 78, 34, 21};

//        Tell the ForLoop to start from the beginning of the array,
//        then tell it to stop at the length of the array. And of course, tell it
//          to kickstart the counting.

        for (int i = 0; i <= sum.length; i ++){
            System.out.println("This is the array length " + i);
        }
    }
}
