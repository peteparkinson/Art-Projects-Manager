/************************************************
 * Project.java
 * 3-11-20
 * Pete Parkinson
 * 
 * this file creates a "project" object such as
 * "wood burning"
 * each material must be defined by the user.
 * 
 * each project tracks:
 * - materials used
 * - cost of materials used
 * - suggested charge to customer
 * - manual charge override
 * - complete / incomplete status
 * - name of customer
 * - time
 * - profit
 * - 
 * 
 ************************************************/

import java.util.ArrayList;

public class Project {

	public static final double hourlyRate = 5.0;
	public static final double markup = 1.5;

	private String serial;
	private Customer customer;
	private String name;
	private String notes;
	private boolean openStatus;
	private boolean finished;
	private ArrayList<Material> materials = new ArrayList<Material>();
	private int hours;
	private double charge;
	private int typeIndex;
	
	//default constructor
	public Project(){
	}
	
	//List constructor
	public Project(String name) {
		this.name = name;		
	}
	
	/*************************************************
	 * constructor
	 * @param serial
	 * @param name
	 * @param typeIndex
	 * @param customer
	 * @param notes
	 * @param relMaterials
	 */
	public Project(String serial, String name, int typeIndex, Customer customer, String notes, ArrayList<Material> materials){
		this.serial = serial;
		this.name = name;
		this.typeIndex  = typeIndex;
		this.customer = customer;
		this.notes = notes;
		this.materials = materials;
		this.openStatus = true;
		this.hours = 0;
		this.charge = -0.01;
		this.finished = false;
	}

	//getters
	public boolean getOpenStatus() {
		return openStatus;
	}
	public ArrayList<Material> getMaterials() {
		return materials;
	}
	public Customer getCustomer() {
		return customer;
	}
	public String getSerial() {
		return serial;
	}
	public String getName() {
		return name;
	}
	public String getNotes() {
		return notes;
	}
	public int getHours() {
		return hours;
	}
	public int getTypeIndex() {
		return typeIndex;
	}
	public String getCOMstr() {
		return String.valueOf(Math.round(calculateCost(materials) * 100.0) / 100.0);
	}
	public Double getCOM() {
		return (double) Math.round(calculateCost(materials) * 100.0 / 100.0);
	}
	public String getTotal() {
		double num = calculateCost(materials) + (hours * hourlyRate);
		return String.valueOf(Math.round(num * 100.0) / 100.0);
	}
	public Double getCharge() {
		
		
		if(this.charge == -0.01){
			double chrg = calculateCost(materials) + (hours * hourlyRate) * markup;
			chrg = Math.round(chrg * 100.0) / 100.0;
			return chrg;
		} else {
			return Math.round(charge * 100.0) / 100.0;
		}
	}
	public String getChargeStr() {
		if(this.charge == -0.01){
			double chrg = calculateCost(materials) + (hours * hourlyRate) * markup;
			chrg = Math.round(chrg * 100.0) / 100.0;
			return String.valueOf(chrg);
		} else {
			return String.valueOf(Math.round(charge * 100.0) / 100.0);
		}
	}
	public boolean getFinishedStatus() {
		return finished;
	}
	
	//setters
	public void setOpenStatus(boolean openStatus) {
		this.openStatus = openStatus;
	}
	public void addMaterial(Material m) {
		//adds a single material
		this.materials.add(m);
	}
	public void removeMaterial(Material m) {
		//removes a single material
		this.materials.remove(m);
	}
	public void setMaterials(ArrayList<Material> materials) {
		//overwrites entire list of materials
		this.materials = materials;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public void resetCharge() {
		this.charge = (calculateCost(materials) + (hours * hourlyRate)) * markup;
	}
	public void setTypeIndex(int typeIndex) {
		this.typeIndex = typeIndex; 
	}
	public String toString() { 
		return name; 
	}
	public void setFinishedStatus(boolean fin) {
		this.finished = fin;
	}
	
	private static double calculateCost(ArrayList<Material> materials) {
		double cost = 0.0;
		for(Material m : materials) {
			cost += m.getCost();
		}
		return cost;
	}
	
}
