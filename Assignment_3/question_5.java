public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int n =sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] myArray = new int[n];
        for(int i=0;i<n;i++){
            myArray[i]= sc.nextInt();
        }
        sumAndDisplayReverse(myArray);
    }
 
    public static void sumAndDisplayReverse(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        System.out.println("Sum of values: " + totalSum);
        System.out.print("Values in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
