public class ques6 {

    static void display(int x) {
        System.out.println("Displaying int: " + x);
    }

    static void display(double x) {
        System.out.println("Displaying double: " + x);
    }

    static void display(byte x) {
        System.out.println("Displaying byte: " + x);
    }

    static void display(float x) {
        System.out.println("Displaying float: " + x);
    }

    static void display(short a, int b) {
        System.out.println("Displaying short and int: " + a + ", " + b);
    }

    static void display(double x, int y) {
        int result = (int) x + y;
        System.out.println("Displaying double and int (type demotion): " + result);
    }

    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14;
        byte byteValue = 10;
        short shortValue = 20;

        display(intValue);
        display(doubleValue);
        display(byteValue);
        display(shortValue, intValue);

        display(doubleValue, intValue);
    }
}
