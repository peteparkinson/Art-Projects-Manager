/*
  Material.java
  11-16-2018
  Pete Parkinson
  
  this file creates a material object such as
  wood plank, canvas, paint, frame, etc.
  each material must be defined by the user.
  
  each object tracks
  - name
  - description
  - cost
  - extended cost
  - total quantity
  - quantity in use
  - quantity available
  - associated projects
*/

import java.util.ArrayList;

public class Material {

	public static ArrayList<Material> loadedMaterials;
	
	private String name;
	private String notes;
	private int qtyOnHand;
	private int qtyInUse;
	private int qtyAvail;
	private double cost;
	private double extCost;
	private ArrayList<Project> projects;
	
	/*************************************************
	 * constructor
	 * @param name
	 * @param qtyOnHand
	 * @param cost
	 * @param notes
	 *  qtyInUse
	 *  qtyAvailable
	 *  extCost
	 *  relProjects
	 */
	public Material(String name, int qtyOnHand, double cost, String notes) {
		this.name = name;
		this.qtyOnHand = qtyOnHand;
		this.cost  = cost;
		this.notes = notes;
		this.qtyInUse = 0;
		this.qtyAvail = this.qtyOnHand - this.qtyInUse;
		this.extCost  = this.cost * this.qtyOnHand;
		this.projects = new ArrayList<Project>();
		
	}
	
	//getters
	public String getName() { 
		return name; 
	}
	public double getCost() { 
		return cost; 
	}
	public int getQtyOnHand() { 
		return qtyOnHand; 
	}
	public String getNotes() { 
		return notes; 
	}
	public int getQtyInUse() { 
		return qtyInUse; 
	}
	public int getQtyAvail() { 
		return qtyAvail; 
	}
	public double getExtCost() { 
		return extCost; 
	}
	
	//setters
	public void setName(String name) {
		this.name = name; 
	}
	public void setCost(double cost) { 
		this.cost = cost; 
	}
	public void setQtyOnHand(int qtyOnHand) { 
		this.qtyOnHand = qtyOnHand; 
	}
	public void setNotes(String notes) { 
		this.notes = notes; 
	}
	public void setQtyInUse(int qtyInUse) { 
		this.qtyInUse = qtyInUse; 
	}
	public void setQtyAvail(int qtyAvail) {
		this.qtyAvail = qtyAvail; 
	}
	public void setExtCost(double extCost) { 
		this.extCost = extCost; 
	}
	//add material to list of related projects
	public void addToProject(Project project){ 
		this.projects.add(project); 
	}
	
	
}
