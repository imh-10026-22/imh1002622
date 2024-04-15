import java.io.*;

public class FileModifier {

    public static void appendToFile(String filePath, String content) {
        try (OutputStream os = new FileOutputStream(filePath, true)) {
            os.write(content.getBytes());
            os.write(System.lineSeparator().getBytes());
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }

    public static void overwriteFile(String filePath, String newContent) {
        try (OutputStream os = new FileOutputStream(filePath)) {
            os.write(newContent.getBytes());
        } catch (IOException e) {
            System.err.println("Error overwriting file: " + e.getMessage());
        }
    }

    public static void replaceContentInFile(String filePath, String oldContent, String newContent) {
        try (InputStream is = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr)) {

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }

            String modifiedContent = content.toString().replace(oldContent, newContent);

            try (OutputStream os = new FileOutputStream(filePath)) {
                os.write(modifiedContent.getBytes());
            }

        } catch (IOException e) {
            System.err.println("Error replacing content in file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "example.txt";
        appendToFile(filePath, "New content to append");
        overwriteFile(filePath, "This will overwrite the previous content");
        replaceContentInFile(filePath, "old content", "new content");
    }
}
