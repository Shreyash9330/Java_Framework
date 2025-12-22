package mypack;

import javax.persistence.*;



@Entity
@Table(name="mystuddata")

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int RollNo;
	@Column
	private String Name;
	@Column
	private String City;
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
}
