package AppUsers;

public class Customer {
	private int id;
	private String name;
	private int age;
	private char gender;
	private long phno;
	private Address address;
	
	public Customer(int id, String name, int age, char gender, long phno, int houseNo, String street, String area, String city, String state, int pinCode) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phno = phno;
		address = new Address(houseNo, street, area, city, state, pinCode);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void customerDetails() {
		System.out.println("*****************************************************************");
		System.out.println("Customer ID: "+id);
		System.out.println("Customer Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Phone Number: "+phno);
		address.addressDetails();
	}
	
	
}
