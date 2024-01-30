import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ques7 {

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

        System.out.print("Enter the position to divide the array: ");
        int dividePosition = scanner.nextInt();

        if (dividePosition < 0 || dividePosition >= sizeOfArray) {
            System.out.println("Invalid position. Division not possible.");
        } else {
            
            
            int[] firstPartArray = new int[dividePosition + 1];
            int[] secondPartArray = new int[sizeOfArray - dividePosition - 1];

            
            
            System.arraycopy(integerArray, 0, firstPartArray, 0, dividePosition + 1);
            System.arraycopy(integerArray, dividePosition + 1, secondPartArray, 0, sizeOfArray - dividePosition - 1);

            
            
            System.out.println("First part of the array:");
            for (int element : firstPartArray) {
                System.out.print(element + " ");
            }

            System.out.println("\nSecond part of the array:");
            for (int element : secondPartArray) {
                System.out.print(element + " ");
            }

            
            
            Set<Integer> uniqueElements = new HashSet<>();
            Set<Integer> duplicateElements = new HashSet<>();

            for (int element : firstPartArray) {
                if (!uniqueElements.add(element)) {
                    duplicateElements.add(element);
                }
            }

            for (int element : secondPartArray) {
                if (!uniqueElements.add(element)) {
                    duplicateElements.add(element);
                }
            }

            
            
            System.out.println("\nDuplicate elements in the divided arrays:");
            for (int element : duplicateElements) {
                System.out.println(element);
            }
        }

        scanner.close();
    }
}
