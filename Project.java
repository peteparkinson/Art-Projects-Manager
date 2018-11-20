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

	private String customer;
	private String name;
	private boolean openStatus;
	private ArrayList<Material> materials;
	private double costOfMaterials;
	private double suggestedCharge;
	private double profit;
	private int hours;
	
	public Project(String name, String customer){
		this.name = name;
		this.customer = customer;
		this.openStatus = true;
		this.materials = new ArrayList<Material>();
		this.costOfMaterials = 0.0;
		this.suggestedCharge = 0.0;
		this.profit = 0.0;
		this.hours = 0;
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
	public String getCustomer() {
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

	//setters
	public void setOpenStatus(boolean openStatus) {
		this.openStatus = openStatus;
	}
	public void setMaterials(ArrayList<Material> materials) {
		this.materials = materials;
	}
	public void setCostOfMaterials(double costOfMaterials) {
		this.costOfMaterials = costOfMaterials;
	}
	public void setSuggestedCharge(double suggestedCharge) {
		this.suggestedCharge = suggestedCharge;
	}
	public void setCustomer(String customer) {
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
	
	
}
