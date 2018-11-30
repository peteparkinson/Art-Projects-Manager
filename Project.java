/************************************************
 * Material.java
 * 11-16-2018
 * Pete Parkinson
 * 
 * this file creates a "project" object such as
 * "wood burning 
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

	public static final double hourlyRate = 20.0;
	
	private Customer customer;
	private String name;
	private boolean openStatus;
	private ArrayList<Material> materials;
	private double costOfMaterials;
	private double suggestedCharge;
	private double profit;
	private int hours;
	private int typeIndex;
	
	public Project(String name, Customer customer, ArrayList<Material> materials, int typeIndex){
		this.name = name;
		this.customer = customer;
		this.materials = materials;
		this.openStatus = true;
		this.costOfMaterials = calculateCost(materials);
		this.hours = 0;
		this.suggestedCharge = costOfMaterials + (hours * hourlyRate);
		this.profit = suggestedCharge - costOfMaterials;
	}

	//getters
	public boolean isOpenStatus() {
		return openStatus;
	}
	public ArrayList<Material> getMaterials() {
		return materials;
	}
	public double getCostOfMaterials() {
		return costOfMaterials;
	}
	public double getSuggestedCharge() {
		return suggestedCharge;
	}
	public Customer getCustomer() {
		return customer;
	}
	public String getName() {
		return name;
	}
	public int getHours() {
		return hours;
	}
	public double getProfit() {
		return profit;
	}
	public double getTypeIndex() {
		return typeIndex;
	}

	//setters
	public void setOpenStatus(boolean openStatus) {
		this.openStatus = openStatus;
	}
	public void addMaterial(Material material) {
		//adds a single material
		this.materials.add(material);
	}
	public void removeMaterial(Material material) {
		//removes a single material
		this.materials.remove(material);
	}
	public void setMaterials(ArrayList<Material> materials) {
		//overwrites entire list of materials
		this.materials = materials;
	}
	public void setCostOfMaterials(double costOfMaterials) {
		this.costOfMaterials = costOfMaterials;
	}
	public void setSuggestedCharge(double suggestedCharge) {
		this.suggestedCharge = suggestedCharge;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	public void setTypeIndex(int typeIndex) {
		this.typeIndex = typeIndex; 
	}
	
	
	
	private static double calculateCost(ArrayList<Material> materials) {
		double cost = 0.0;
		for(Material m : materials) {
			cost += m.getCost();
		}
		return cost;
	}
	
}