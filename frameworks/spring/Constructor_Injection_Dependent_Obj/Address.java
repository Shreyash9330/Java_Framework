package mypack;

public class Address {

	private String city;
	private String State;
	public Address(String city, String state) {
		super();
		this.city = city;
		State = state;
	}
	@Override
	public String toString() {
		return "Address :\n[city = " + city + "\nState = " + State + "]";
	}
	
	
}
