abstract class Bike{
    abstract void run();
    
    
}
class Honda extends Bike{
    
    void run(){
        System.out.println("hello I am running with Honda");
    }
}
public class q2 {
    public static void main(String[] args) {
        Bike obj=new Honda();
        obj.run();
    }
}
