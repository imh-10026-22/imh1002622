import java.util.Scanner;

public class ques8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        int[] integerArray = new int[sizeOfArray];

        System.out.println("Enter the elements of the array in random order:");

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element at index " + i + ": ");
            integerArray[i] = scanner.nextInt();
        }

        int peakElement = findPeakElement(integerArray);

        if (peakElement != -1) {
            System.out.println("Peak element in the array: " + peakElement);
        } else {
            System.out.println("No peak element found in the array.");
        }

        scanner.close();
    }

    
    
    private static int findPeakElement(int[] array) {
        int n = array.length;

        if (n == 0) {
            return -1;
        }

        for (int i = 0; i < n - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return array[i];
            }
        }

        
        
        return array[n - 1];
    }
}
