import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String[] testStrings = {"hello", "world", "Java", "string", "contains", "no"};
        String pattern = "s";
        Pattern regex = Pattern.compile(pattern);
        
        for (String str : testStrings) {
            Matcher matcher = regex.matcher(str);
            boolean containsS = matcher.find();
            System.out.println("\"" + str + "\" contains 's': " + containsS);
        }
    }
}
