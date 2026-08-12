package payslip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        // Creating Employee object using constructor
        Employee employee = new Employee(
                id,
                name,
                department,
                designation,
                salary
        );

        // Creating Payslip object
        paySlip payslip = new paySlip(employee);

        // Generate payslip
        payslip.generatePayslip();

        sc.close();
    }
}
