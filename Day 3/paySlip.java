package payslip;

public class paySlip {

	    private Employee employee;

	    // Constructor
	    public paySlip(Employee employee) {
	        this.employee = employee;
	    }

	    public void generatePayslip() {

	        double basicSalary = employee.getBasicSalary();

	        double hra = basicSalary * 0.20;
	        double da = basicSalary * 0.10;
	        double allowance = basicSalary * 0.05;

	        double grossSalary =
	                basicSalary + hra + da + allowance;

	        double pf = basicSalary * 0.12;
	        double tax = grossSalary * 0.05;
	        double otherDeduction = 500;

	        double totalDeduction =
	                pf + tax + otherDeduction;

	        double netSalary =
	                grossSalary - totalDeduction;

	        System.out.println("\n======================================");
	        System.out.println("              PAYSLIP");
	        System.out.println("======================================");

	        System.out.println("Employee ID   : " + employee.getEmployeeId());
	        System.out.println("Name          : " + employee.getEmployeeName());
	        System.out.println("Department    : " + employee.getDepartment());
	        System.out.println("Designation   : " + employee.getDesignation());

	        System.out.println("--------------------------------------");
	        System.out.println("EARNINGS");
	        System.out.printf("Basic Salary  : %.2f%n", basicSalary);
	        System.out.printf("HRA           : %.2f%n", hra);
	        System.out.printf("DA            : %.2f%n", da);
	        System.out.printf("Allowance     : %.2f%n", allowance);
	        System.out.printf("Gross Salary  : %.2f%n", grossSalary);

	        System.out.println("--------------------------------------");
	        System.out.println("DEDUCTIONS");
	        System.out.printf("PF            : %.2f%n", pf);
	        System.out.printf("Tax           : %.2f%n", tax);
	        System.out.printf("Other         : %.2f%n", otherDeduction);
	        System.out.printf("Total Deduct. : %.2f%n", totalDeduction);

	        System.out.println("--------------------------------------");
	        System.out.printf("NET SALARY    : %.2f%n", netSalary);

	        System.out.println("======================================");
	    }
	}

