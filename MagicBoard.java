import java.util.Scanner;

public class MagicBoard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four ASCII values:");

        for (int i = 0; i < 4; i++) {
            int asciiValue = scanner.nextInt();

            if (asciiValue >= 65 && asciiValue <= 90) {
                char character = (char) asciiValue;
                System.out.println("ASCII: " + asciiValue + " | Character: " + character);
            } else {
                System.out.println("Invalid ASCII value: " + asciiValue);
            }
        }
    }
}