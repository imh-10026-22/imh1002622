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
    }
}
