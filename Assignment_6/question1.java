class Student{
    String Student_name;
    int Student_roll;
    float Student_fee;
    
    Student(String Student_name,int Student_roll,float Student_fee){
        this.Student_name=Student_name;
        this.Student_roll=Student_roll;
        this.Student_fee=Student_fee;
    }
    
    void Display(){
        System.out.println("The name of the Student is :"+this.Student_name);
        System.out.println("The roll number of the student is :"+this.Student_roll);
        System.out.println("The Fee paid by the Student is :"+this.Student_fee);
    }
}
 
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Students you want to add details for:");
        int n=sc.nextInt();
        String name;
        int roll;
        float fee;
        Student S[]=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of the "+(i+1)+" Student:");
            sc.nextLine();
            name = sc.nextLine();
            System.out.println("Enter the  roll number of the Student:");
            roll = sc.nextInt();
            System.out.println("Enter the fee paid by the Student: ");
            fee = sc.nextFloat();
            S[i] = new Student(name,roll,fee);
            System.out.println("-----------");
        }
        
        for(int i=0;i<n;i++){
            System.out.println("Details of Student : " + (i+1));
            S[i].Display();
            System.out.println("-----------");
        }
    }
}
 
