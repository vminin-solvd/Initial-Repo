public class Main {

    public static void fizzBuzz(int[] args) {

        // Check if the array is empty or null
        if (args == null || args.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }
        // Iterate over array to examine individual integers
        for (int i = 0; i < args.length; i++) {
            if((args[i] % 3) == 0 && (args[i] % 5) != 0) {
                System.out.print("Fizz"); // If the integer is divisible only by 3 print "Fizz"
            }
            else if((args[i] % 5) == 0 && (args[i] % 3) != 0) {
                System.out.print("Buzz"); // If the integer is divisible only by 5 print "Buzz"
            }
            else if((args[i] % 5) != 0 && (args[i] % 3) != 0) {
                System.out.print(args[i]); // If the integer is not divisible by 3 & 5 print the integer
            }
            else if ((args[i] % 5 == 0) && (args[i] % 3 == 0)) {  // Changed = to ==
                System.out.print("FizzBuzz"); // If the integer is divisible by 3 & 5 print "FizzBuzz"
            }
            if(i != args.length - 1) {
                System.out.print(", "); // If the element is not the last element we print out ", "
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 15, 16, 18};
        fizzBuzz(numbers);
    }
}
