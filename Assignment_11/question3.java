import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("destination.txt")) {
            int x;
            while ((x = fis.read()) != -1) {
                fos.write(x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
