import java.util.Scanner;

public class question5 {
    
}
 
class PrintNumber{
    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
        int num1 = 10;
        float float1 = 10;
        double double1 = 10l;
        char char1 = 'a';
        long long1 = 100;
        boolean b1 = false;
        
        Integer num2 = new Integer(num1);
        Float float2 = new Float(float1);
        Double double2 = new Double(double1);
        Character char2 = new Character(char1);
        Long long2 = new Long(long1);
        Boolean b2 = new Boolean(b1);
        
        System.out.println("-----------");
        System.out.println("Wrapped Integer is :"+num2);
        System.out.println("Wrapped Float is :"+float2);
        System.out.println("Wrapped Double is :"+double2);
        System.out.println("Wrapped Character is :"+char2);
        System.out.println("Wrapped Long is :"+long2);
        System.out.println("Wrapped Boolean is :"+b2);
        
        System.out.println("-----------");
        
        int num3 = num2.intValue();
        float float3 = float2.floatValue();
        double double3 = double2.doubleValue();
        char char3 = char2.charValue();
        long long3 = long2.longValue();
        boolean b3 = b2.booleanValue();
        
        System.out.println("Unboxed Integer is :"+num3);
        System.out.println("Unboxed Float is :"+float3);
        System.out.println("Unboxed Double is :"+double3);
        System.out.println("Unboxed Character is :"+char3);
        System.out.println("Unboxed Long is :"+long3);
        Syst
em.out.println("Unboxed Boolean is :"+b3);
    }   
}
