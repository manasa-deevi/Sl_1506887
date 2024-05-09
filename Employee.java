package ex1;

public class Employee {
	
	private String name;
	private float workHours;
	private double salary;
	public Employee(String name, float workHours, double salary) {
		super();
		this.name = name;
		this.workHours = workHours;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWorkHours() {
		return workHours;
	}
	public void setWorkHours(float workHours) {
		this.workHours = workHours;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", workHours=" + workHours + ", salary=" + salary + "]";
	}
	
	public void getInfo(double salary,float workHours)
	{
		this.addSal();
		this.addWork();
		System.out.println(this);
	}
	
	public void addSal()
	{
		if(salary<1500)
			this.salary+=1000;
	}
	
	public void addWork()
	{
		if(workHours>6)
			this.salary+=500;
	}
	
	public static void main(String[] args) {
		Employee employee=new Employee("Hari", 8, 6000);
		employee.getInfo(employee.salary, employee.getWorkHours());
		
		Employee employee2=new Employee("Krish", 6, 1000);
		employee2.getInfo(employee2.salary, employee2.getWorkHours());
	}
	

}
