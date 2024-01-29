public class ques3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int n =sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        myArg(arr);
        String name= "Div";
        myArg(name);
    }
 
    public static void myArg(int...a){
        System.out.println("The total number of arguments are:"+a.length);
        int i; 
 
        int max = a[0]; 
 
        for (i = 1; i < a.length; i++) {
            if (a[i] > max) 
                max = a[i]; 
        }
        System.out.println("The maximum of the given numbers is:"+max); 
        int sum = 0;
        for (int b:a){
            sum = sum + b;
        }
        System.out.println("Sum of the elements is ="+sum);
    }
}
