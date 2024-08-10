package Java.Practices.Input_output;
import java.util.Scanner;

class Employee {
    public static void main(String[] args) {

        int employeeId;
        String employeeName; // String is predefined class not datatype
        float employeeSalary;

        Scanner sc = new Scanner(System.in); // System from lang (default) package

        System.out.println("Enter the employee id: ");
        employeeId = sc.nextInt();
        System.out.println("Enter the employee name: ");
        employeeName = sc.next();
        System.out.println("Enter the employee id: ");
        employeeSalary = sc.nextFloat();

        System.out.println("Entered id : " + employeeId);
        System.out.println("Entered name : " + employeeName);
        System.out.println("Entered Salary : " + employeeSalary);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 > num2 ? "Max is " + num1 + " " + "Min is" + num2 : "Max is " + num2 + "Min is" + num1);
    }
}
