import java.util.*;
public class question6 {
    
}
 
class myIntWrapper{
    private int i;
    myIntWrapper(int a){
        i = a;
    }
    
    int getInt(){
        return this.i;
    }
}
 
class Main4{
    public static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        myIntWrapper m1= new myIntWrapper(10);
        System.out.println("The wrapped integer is :"+m1.getInt());
        
        ArrayList<myIntWrapper> myArray = new ArrayList<myIntWrapper>(); 
        System.out.println("Enter the number of integers to be added to the list:");
        int n=sc.nextInt();
        myIntWrapper wrapArray[] = new myIntWrapper[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element:");
            int d=sc.nextInt();
            wrapArray[i]= new myIntWrapper(d);
            myArray.add(wrapArray[i]);
        }
        System.out.println("-----------");
        
        for(int i = 0;i<n;i++){
            System.out.println("The "+(i+1)+" element in the array is : "+(myArray.get(i).getInt()));
        }
    }
}
