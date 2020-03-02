package Chapter2;

public class Employee {
	public static int HOURS = 40;
	private String empName;
	private double empRate;
	private int workHours;
	
	
	public Employee(String e, double p)	{
		empName = e;
		empRate = p;
		workHours = HOURS;
	}
	public void setEmpName(String e)	{
		empName = e;
	}
	public void setPayRate(double p)	{
		empRate = p;
	}
	public String getEmpName()	{
		return empName;
	}
	public double getPayRate()	{
		return empRate;
	}
	public double calcSalary()	{
		double salary = 0;
		//salary = empRate * (double)HOURS;
		//return salary;
		if ((double)workHours > 40)	{
			double ot, otSalary;
			ot = (double)workHours - (double)HOURS;
			otSalary = ot * (empRate*1.5);
			salary = (empRate * (double)HOURS) 	+ otSalary;
			
		}
		return salary;
	}
	public Employee(String e, double p, int w)	{
		empName = e;
		empRate = p;
		workHours = w;
		
	}
	public void setWorkHours(double w)	{
		workHours = (int) w;
	}
	public double getWorkHours()	{
		return workHours;
	}
	
	

}
