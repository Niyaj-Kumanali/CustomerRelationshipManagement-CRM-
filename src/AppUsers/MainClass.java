package AppUsers;

public class MainClass {

	public static void main(String[] args) {
		Customer c1 = new Customer(1, "Niyaj", 22, 'M', 821709712, 4185, "Jamdar plot", "Vidya Nagar", "Nipani", "Karnataka", 591237);
//		System.out.println("Customer Name:"+c1.getName());
//		System.out.println("Pincode:"+c1.getAddress().getPinCode());
		
		c1.customerDetails();
		
		c1.setAddress(new Address(3445, "Aazad Lane", "Shivaji Nagar", "Nipani", "Karnataka", 591237));
		
		c1.customerDetails();
		c1.getAddress().addressDetails();
	}

}
