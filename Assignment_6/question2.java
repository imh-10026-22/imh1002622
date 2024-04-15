import java.util.Scanner;

public class question2 {
    
}
 
 
class Student1{
    String Student_name;
    int Student_roll;
    float Student_fee;
    
    Student1(String Student_name,int Student_roll,float Student_fee){
        this.Student_name=Student_name;
        this.Student_roll=Student_roll;
        this.Student_fee=Student_fee;
    }
    
    Student1(){
        this("Unknown",000,000);   
    }
    
    void Show(){
        Display(this);
    }
    
    void Display(Object a){
        System.out.println("The name of the Student is :"+this.Student_name);
        System.out.println("The roll number of the student is :"+this.Student_roll);
        System.out.println("The Fee paid by the Student is :"+this.Student_fee);
    }
}
 
class Main1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Students you want to add details for:");
        int n=sc.nextInt();
        String name;
        int roll;
        float fee;
        Student1 S1 = new Student1();
        Student1 S[]=new Student1[n];
        System.out.println("-----------");
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of the "+(i+1)+" Student:");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Enter the  roll number of the Student:");
            roll = sc.nextInt();
            System.out.println("Enter the fee paid by the Student: ");
            fee = sc.nextFloat();
            S[i] = new Student1(name,roll,fee);
            System.out.println("-----------");
        }
        System.out.println("Result of non parameterized constructor:");
        S1.Show();
        System.out.println("-----------");
        for(int i=0;i<n;i++){
            System.out.println("Details of Student : " + (i+1));
            S[i].Show();
            System.out.println("-----------");
        }
    }
}
 
