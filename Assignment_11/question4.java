import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1 = new FileInputStream("C:\\Users\\Div\\Documents\\source1.txt");
        FileInputStream fis2 = new FileInputStream("C:\\Users\\Div\\Documents\\source2.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Div\\Documents\\destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int b;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }

        sis.close();
        fos.close();
        fis1.close();
        fis2.close();
    }
}
