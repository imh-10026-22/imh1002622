import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();


        int[] integerArray = new int[sizeOfArray];


        System.out.println("Enter " + sizeOfArray + " elements for the array (in random order):");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Enter element " + (i + 1));
            integerArray[i] = scanner.nextInt();
        }





        System.out.print("The array is: ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(integerArray[i] + " ");
        }
    }
}
