package mypack;

public class Employee extends Person{

		private int empid;
		private String dept;
		
		public Employee(String name, String city, int empid, String dept) {
			super(name, city);
			this.empid = empid;
			this.dept = dept;
		}

		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", dept=" + dept + "]";
		}
		
}
