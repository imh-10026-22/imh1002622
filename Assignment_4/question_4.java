import java.util.Scanner;
 
/**
 *
 * @author divyansh
 */
public class question_4 {
    
}
 
class student {
    int student_roll;
    String student_name;
    int student_marks[] = new int[5];
        
    public student(int roll,String name,int...a){
        student_roll = roll;
        student_name = name;
        for(int i=0;i<a.length;i++)
            student_marks[i] = a[i];
    }
    
    public float average(){
        float avg=0;
        for(int i=0;i<5;i++)
            avg+= student_marks[i];
        avg/=5;
        return avg;
    }
}
 
class runner{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        int marks[]= new int[5];
        System.out.println("Enter profile of 3 students:");
        for(int i=1;i<4;i++){
        System.out.println("Enter the roll number of student "+i+" :");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        System.out.println("Enter the marks of the student in 5 subjects:");
        for(int j=0;j<5;j++)
            marks[j] = sc.nextInt();
        System.out.println("The average marks of the 5 subjects is :");
        if (i == 1){
                student s1 = new student(roll,name,marks);
                System.out.println(s1.average());
                }
        else if (i == 2){
                student s2 = new student(roll,name,marks);
                System.out.println(s2.average());}
        else{
                student s3 = new student(roll,name,marks);
                System.out.println(s3.average());
        }
        }
    }
}
