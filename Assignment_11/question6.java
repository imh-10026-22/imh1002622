import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String[] testStrings = {"x", "xy", "xyyy", "xyz", "yy", "yx", ""};
        String pattern = "xy*";
        Pattern regex = Pattern.compile(pattern);
        
        for (String str : testStrings) {
            Matcher matcher = regex.matcher(str);
            boolean isMatch = matcher.matches();
            System.out.println("\"" + str + "\" matches pattern: " + isMatch);
        }
    }
}
