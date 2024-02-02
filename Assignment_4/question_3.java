import java.util.Scanner;
 
/**
 *
 * @author divyansh
 */
public class Student {
    int student_roll;
    String student_name;
    int student_marks[] = new int[5];
    
    public Student(){
        student_name = "unknown";
    }
    
    public Student(int roll,String name,int...a){
        student_roll = roll;
        student_name = name;
        for(int i=0;i<a.length;i++){
            student_marks[i] = a[i];
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student();
        System.out.println("The name of the student is : "+s1.student_name);
        
        String name;
        int roll;
        int marks[]= new int[5];
        System.out.println("Enter the roll number of the student:");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        System.out.println("Enter the marks of the student in 5 subjects:");
        for(int i=0;i<5;i++)
            marks[i] = sc.nextInt();
        Student s2 = new Student(roll,name,marks);
        System.out.println("RESULT");
        System.out.println("");
        System.out.println("");
        System.out.println("The name of the student entered is : "+s2.student_name);
        System.out.println("The roll number of the student is : "+s2.student_roll);
        System.out.println("The marks of the Student in 5 subjects");
        for(int i=0;i<5;i++)
            System.out.println(s2.student_marks[i]);
    }
}
