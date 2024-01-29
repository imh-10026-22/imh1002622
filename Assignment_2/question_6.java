import java.util.Scanner;

public class ques6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] originalArray = new int[n];

        System.out.println("Enter the elements of the array in random order:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }

        int[] evenArray = new int[n];
        int[] oddArray = new int[n];
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (originalArray[i] % 2 == 0) {
                evenArray[evenCount++] = originalArray[i];
            } else {
                oddArray[oddCount++] = originalArray[i];
            }
        }

        System.out.println("\nOriginal Array:");
        displayArray(originalArray, n);

        System.out.println("\nEven Numbers Array:");
        displayArray(evenArray, evenCount);

        System.out.println("\nOdd Numbers Array:");
        displayArray(oddArray, oddCount);

        scanner.close();
    }

    private static void displayArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
