import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();

        int[] arr = new int[sizeOfArray];

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element " + (i + 1));
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the position for insertion: ");
        int position = scanner.nextInt();

        System.out.print("Enter the element to be inserted: ");
        int element = scanner.nextInt();



        if (position < 0 || position > sizeOfArray) {
            System.out.println("Invalid position for insertion. Please enter a valid position.");
        } else {
            int[] arr1 = new int[sizeOfArray + 1];

            for (int i = 0, j = 0; i < arr1.length; i++) {
                if (i == position) {
                    arr1[i] = element;
                } else {
                    arr1[i] = arr[j];
                    j++;
                }
            }

            System.out.print("Array after insertion: ");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
