import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class q1b {
       public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        List<String> arr= new ArrayList<String>();
        System.out.println("Enter the input:");
        for(int i=0;i<n;i++){
            String value=sc.next();
            arr.add(value);
        }
        System.out.println("Elements of Arraylist:");
        for(int i=0;i<n;i++){
            System.out.println("At Index "+i+" element is "+ arr.get(i));
        }
      
        System.out.println("Enter New  first Element you want to insert");
        String k=sc.next();
        arr.add(0,k);
        for(int i=0;i<=n;i++){
            System.out.println("At Index "+i+" element ia "+ arr.get(i));
        }
        
        System.out.println("Enter the Index of element you want to delete");
        int t=sc.nextInt();
        arr.remove(t);
        for(int i=0;i<n;i++){
            System.out.println("At Index "+i+" element ia "+ arr.get(i));        
        }
        System.out.println("Now sorting array:");
        Collections.sort(arr);
        for(int i=0;i<n;i++){
            System.out.println("At Index "+i+" element ia "+ arr.get(i));        
        }
        
    }
}
