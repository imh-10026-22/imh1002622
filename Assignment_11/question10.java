import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        String pattern = "\\d+$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(userInput);
        boolean endsWithNumber = matcher.find();
        if (endsWithNumber) {
            System.out.println("The string ends with a number.");
        } else {
            System.out.println("The string does not end with a number.");
        }
        scanner.close();
    }
}
