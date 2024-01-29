public class ques2 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.next();
    System.out.println("Enter your age");
    int age = sc.nextInt();
    validator(name);
    validator(age);
    }
 
    public static boolean validator(String a){
        char[] chars = a.toCharArray();
    for (char c : chars) {
        if(!Character.isLetter(c)) {
           System.out.println("Name contains something other than alphabets!");
           return false;
        }
    }
    System.out.println("The name contains only letters!");
    return true;
    }
 
    public static boolean validator(int a){
        if (a>3 && a<15){
            System.out.println("The age is correct.");
            return true;
        }
        System.out.println("The age is incorrect!");
        return false;
    }
}
