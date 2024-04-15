class Outer{
    class Inner{
        void display(){
            System.out.println("Inside display Inner");
        }
    }
}
public class q1a {
    public static void main(String[] args) {
        Outer.Inner in =new Outer().new Inner();
        in.display();
    }
}
class Outer1{
    void display_Outer1(){
        System.out.println("In Outer display");
        class Inner1{
            void display_Inner1(){
                System.out.println("In Inner Meathod");
            }    
        }
        Inner1 in=new Inner1();
        in.display_Inner1();
    }
}
public class q1b {
    public static void main(String[] args) {
        Outer1 out=new Outer1();
        out.display_Outer1();
    }
}
class Outer1{
    void display_Outer1(){
        System.out.println("In Outer display");
        class Inner1{
            void display_Inner1(){
                System.out.println("In Inner Meathod");
            }    
        }
        Inner1 in=new Inner1();
        in.display_Inner1();
    }
}
public class q1b {
    public static void main(String[] args) {
        Outer1 out=new Outer1();
        out.display_Outer1();
    }
}
