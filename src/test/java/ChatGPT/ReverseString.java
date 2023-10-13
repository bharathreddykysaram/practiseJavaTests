package ChatGPT;
import java.util.Scanner;
public class ReverseString {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input a number from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Convert the number to a string
            String numberStr = Integer.toString(number);

            // Reverse the string
            String reversedStr = reverseString(numberStr);

            // Convert the reversed string back to an integer
            int reversedNumber = Integer.parseInt(reversedStr);

            // Display the reversed number
            System.out.println("Reversed number: " + reversedNumber);

            scanner.close();
        }

        // Function to reverse a string
        public static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        }
    }


