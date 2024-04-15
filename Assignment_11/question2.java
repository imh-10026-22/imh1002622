import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileIntoByteArray {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            long fileSize = file.length();
            byte[] byteArray = new byte[(int) fileSize];
            fis.read(byteArray);
            fis.close();
            System.out.println(new String(byteArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
