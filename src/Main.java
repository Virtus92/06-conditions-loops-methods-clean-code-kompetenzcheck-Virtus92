import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] assigned = {'@', '8', '(', 'D', '3', 'F', '6', '#', '!', 'J', 'K', '1', 'M', 'N', '0', 'P', 'Q', 'R', '$', '7', 'U', 'V', 'W', 'X', 'Y', '2'};
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib mir einen Text den ich übersetzen soll.");
        String sentence = sc.nextLine();
        sentence = sentence.toUpperCase();

        char[] converted = sentence.toCharArray();

        for (int i = 0; i < converted.length; i++) {
            char c = converted[i];
            for (int j = 0; j < alphabet.length; j++) {
                if (c == alphabet[j]) {
                    converted[i] = assigned[j];
                }
            }
        }
        System.out.print(converted);
    }
}