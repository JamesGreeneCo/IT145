package Chapter2;
import java.util.Scanner;

class Payroll	{
	
	static double empRate;
	static String empName;
	static int workHours;
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] Args)	{
		
		empName = kbEmpName();
		System.out.println("Name: " + empName);
		empRate = kbEmpRate();
		System.out.println("Rate: " + empRate);
		workHours = (int) kbWorkHours();
		
		//Instance of the Class Employee
		Employee firstEmp = new Employee(empName, empRate);
		
		//Use the class variable
		System.out.println("Name: " + firstEmp.getEmpName());
		System.out.println("Rate: " + firstEmp.getPayRate());
		System.out.println("Total: " + firstEmp.calcSalary());
		//System.out.println("Work Hours: " firstEmp.getWorkHours());
		
		empName = kbEmpName();
		empRate = kbEmpRate();
		workHours = (int) kbWorkHours();
		
		System.out.println("Name: " + firstEmp.getEmpName());
		System.out.println("Rate: " + firstEmp.getPayRate());
		System.out.println("Total: " + firstEmp.calcSalary());
	}
	public static String kbEmpName()	{
		String e;
		System.out.print("Enter Employee Name: ");
		e = kb.next();
		return e;
	}
	public static double kbEmpRate()	{
		double p;
		System.out.print("Enter Employee Rate: ");
		p = kb.nextDouble();
		return p;
	}
	public static double kbWorkHours()	{
		double w;
		System.out.println("How many hours");
		w = kb.nextDouble();
		return w;
	}
	
	
}