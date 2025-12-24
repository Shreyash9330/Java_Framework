package mypack;

import java.util.HashSet;
import java.util.Set;

public class Department {

	private int id;
	private String dname;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}

	private Set<Employee> emp = new HashSet<Employee>();
}
