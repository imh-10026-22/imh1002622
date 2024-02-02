import java.util.Scanner;
 
/**
 *
 * @author divyansh
 */
public class Employee {
 
    public int Employee_id;
    public String Employee_name;
    protected String Employee_department;
 
    }
 
class Calling_class {
 
    public static void main(String[] args) {
 
        Employee e1 = new Employee();
        Scanner sc= new Scanner(System.in);
        int id;
        String name;
        String department;
        System.out.println("Enter the id of the Employee: ");
        id = sc.nextInt();
        System.out.println("Enter the name of the Employee: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter the department of the Employee: ");
        department = sc.nextLine();
        e1.Employee_id = id;
        e1.Employee_name = name;
        e1.Employee_department = department;
        System.out.println("The employee id is : " + e1.Employee_id);
        System.out.println("Name of the employee is : " + e1.Employee_name);
        System.out.println("The Employee department is : " + e1.Employee_department);
    }
    
}
