/************************************************
 * Material.java
 * 11-16-2018
 * Pete Parkinson
 * 
 * this file creates a "material" object such as
 * wood plank, canvas, paint, frame, etc.
 * each material must be defined by the user.
 * 
 * each object tracks:
 * - name
 * - description
 * - cost
 * - extended cost
 * - total quantity
 * - quantity in use
 * - quantity available
 * - associated projects
 * 
 ************************************************/

import java.util.ArrayList;

public class Material {
	
	private String name;
	private String desc;
	private int qtyOnHand;
	private int qtyInUse;
	private int qtyAvailable;
	private double cost;
	private double extCost = cost * qtyOnHand;
	private ArrayList<String> relProjects;
	
	//full parameterized constructor
	public Material(String name, String desc, int qtyOnHand, int qtyInUse, 
			int qtyAvailable, double cost, double extCost /*, ArrayList<String> relProjects */) {
		this.name = name;
		this.desc = desc;
		this.qtyOnHand = qtyOnHand;
		this.setQtyInUse(qtyInUse);
		this.setQtyAvailable(qtyAvailable);
		this.cost = cost;
		this.setExtCost(extCost);
		//this.relProjects = relProjects;
	}
	
	public void addToProject(String project){ this.relProjects.add(project); }
	
	//getters
	public String getName() { return name; }
	public String getDesc() { return desc; }
	public int getQtyInUse() { return qtyInUse; }
	public int getQtyAvailable() { return qtyAvailable; }
	public double getCost() { return cost; }
	public double getExtCost() { return extCost; }
	
	//setters
	public void setName(String name) { this.name = name; }
	public void setDesc(String desc) { this.desc = desc; }
	public void setCost(double cost) { this.cost = cost; }
	public void setQtyInUse(int qtyInUse) { this.qtyInUse = qtyInUse; }
	public void setQtyAvailable(int qtyAvailable) { this.qtyAvailable = qtyAvailable; }
	public void setExtCost(double extCost) { this.extCost = extCost; }
	
	
	
}