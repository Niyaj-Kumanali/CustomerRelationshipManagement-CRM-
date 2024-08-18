package AppUsers;

public class Address {
	private int houseNo;
	private String street;
	private String area;
	private String city;
	private String state;
	private int pinCode;
	
	public Address(int houseNo, String street, String area, String city, String state, int pinCode) {
		this.houseNo = houseNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	

	public int getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}


	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	
	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public void addressDetails() {
		System.out.println("House Number: "+houseNo);
		System.out.println("Street: "+street);
		System.out.println("Area: "+area);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Pin Code: "+pinCode);
	}
	
	

	
	

}
