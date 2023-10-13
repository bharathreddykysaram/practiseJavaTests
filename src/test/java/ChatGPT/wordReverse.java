package ChatGPT;

public class wordReverse {

public static void main(String [] args){
    String original = "India is my Country";

    // Manually reversing the string
    String reversed = "";
        for (int i = original.length()-1; i >= 0; i--) {
        reversed += original.charAt(i);
    }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
}
}
