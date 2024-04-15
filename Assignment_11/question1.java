import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the file to write to: ");
        String fileName = sc.nextLine();

        try {
            FileOutputStream fos = new FileOutputStream(fileName);

            System.out.print("How many lines do you want to write? ");
            int numLines = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the lines:");

            for (int i = 0; i < numLines; i++) {
                String line = sc.nextLine();
                line += System.lineSeparator();
                // https://www.javatpoint.com/post/java-system-lineseparator-method
                byte[] bytes = line.getBytes();
                // https://www.javatpoint.com/java-string-getbytes
                fos.write(bytes);
            }

            fos.close();

            System.out.println("Lines written to " + fileName + " successfully.");

            System.out.println("Reading file contents:");
            FileInputStream fis = new FileInputStream(fileName);
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            fis.close();
        } catch (IOException e) {
            System.err.println("Error writing/reading file: " + e.getMessage());
        }
    }
}
