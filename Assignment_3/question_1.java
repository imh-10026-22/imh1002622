public class ques1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: 1 FOR RECTANGLE.");
        System.out.println("Enter: 2 FOR SQUARE.");
        System.out.println("Enter: 3 FOR CIRCLE.");
        int a = sc.nextInt();
        System.out.println("");
        if (a == 1){
            System.out.println("Enter the length:");
            float l = sc.nextFloat();
            System.out.println("Enter the breadth:");
            float b = sc.nextFloat();
            area(l,b);
        }
        else if(a==2){
            System.out.println("Enter the lenght of the side:");
            long s = sc.nextLong();
            area(s);
        }
 
        else if(a==3){
            System.out.println("Enter the radius:");
            double r = sc.nextDouble();
            area(r);
        }
 
        else{
            System.out.println("Wrong input!");
            System.out.println("Exiting Program");
        }
    }
 
    public static void area(float a, float b) {
        System.out.println("The area of Rectangle is = " + (a * b));
        System.out.println("The perimeter of Rectangle is = " + (2 * (a + b)));
    }
 
    public static void area(long a) {
        System.out.println("The area of Square is = " + (a * a));
        System.out.println("The perimeter of Square is = " + (4 * a));
    }
 
    public static void area(double a) {
        System.out.println("The area of Circle is = " + (3.14 * (a * a)));
        System.out.println("The Circumference of the Circle is = " + (2 * 3.14 * a));
    }
}
 
