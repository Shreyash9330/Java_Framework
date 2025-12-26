package mypack;

public class Employee {
	
	private int eid;
	private String empname;
	private String city;
	private int salary;
	 Address address;


	
	public Employee(int eid, String empname, String city, int salary, Address address) {
		super();
		this.eid = eid;
		this.empname = empname;
		this.city = city;
		this.salary = salary;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee :\n[eid = " + eid + "\nempname = " + empname + "\ncity = " + city + "\nsalary = " + salary + "\naddress = "
				+ address + "\n]";
	}


	
	
}
