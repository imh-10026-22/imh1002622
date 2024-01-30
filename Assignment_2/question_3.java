import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        int[] arr = new int[sizeOfArray];

        System.out.print("Enter the total number of elements in the array: ");
        int totalElement = scanner.nextInt();

        System.out.println("Enter elements for the array ");
        for (int i = 0; i < totalElement; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the index for deletion: ");
        int loc = scanner.nextInt();



        if (loc < 0 || loc >= totalElement) {
            System.out.println("Invalid index for deletion. Please enter a valid index.");
        } else {
            int[] arr1 = new int[totalElement - 1];

            for (int i = 0, j = 0; i < totalElement; i++) {
                if (i == loc) {
                    continue;
                } else {
                    arr1[j++] = arr[i];
                }
            }

            System.out.print("Array after deletion: ");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
