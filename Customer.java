import java.util.ArrayList;

public class Customer {

	private String name;
	private String address;
	private String phone;

	private ArrayList<Project> relProjects;
	
	//default constructor
	public Customer() {
		
	}
	
	//name constructor
	public Customer(String name) {
		this.name = name;
	}

	//full parameterized constructor
	public Customer(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	//getters
	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public ArrayList<Project> getProjects() {
		return relProjects;
	}

	//setters
	public void setAddress(String address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void addToRelProjects(Project projects) {
		this.relProjects.add(projects);
	}

	public String toString() { 
		return name; 
	}
	
}
