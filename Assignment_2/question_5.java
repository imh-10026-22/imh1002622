import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int[] elements = new int[size];
        int[] frequencies = new int[size];

        for (int i = 0; i < size; i++) {
            int currentElement = array[i];
            boolean found = false;


            for (int j = 0; j < size; j++) {
                if (elements[j] == currentElement) {
                    frequencies[j]++;
                    found = true;
                    break;
                }
            }


            if (!found) {
                elements[i] = currentElement;
                frequencies[i] = 1;
            }
        }

        boolean hasDuplicates = false;

        System.out.println("Duplicate elements and their frequency of occurrence:");
        for (int i = 0; i < size; i++) {
            if (frequencies[i] > 1) {
                hasDuplicates = true;
                System.out.println("Element " + elements[i] + ": Frequency " + frequencies[i]);
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found in the array.");
        }

        scanner.close();
    }
}
