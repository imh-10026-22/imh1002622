import java.util.Scanner;
import java.util.regex.*;

public class StringPatternMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String text = scanner.nextLine();
        
        System.out.println("Enter the pattern:");
        String pattern = scanner.nextLine();
        
        String regexPattern = "\\b" + pattern + "\\b";
        
        Pattern p = Pattern.compile(regexPattern);
        
        Matcher m = p.matcher(text);
        
        int start = -1;
        int end = -1;
        
        if (m.find()) {
            start = m.start();
            end = m.end();
            System.out.println("Match found at start index: " + start + " and end index: " + end);
        } else {
            System.out.println("No match found.");
        }
        
        scanner.close();
    }
}
