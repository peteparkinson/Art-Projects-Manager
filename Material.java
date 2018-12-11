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
	
	private String serial;
	private String name;
	private String notes;
	private int typeIndex;
	private int qtyOnHand;
	private int qtyInUse;
	private int qtyAvail;
	private double cost;
	private double extCost;
	private ArrayList<Project> projects;
	
	//default constructor
	public Material(){
		
	}
	
	//List constructor
	public Material(String name) {
		this.name = name;		
	}
	
	/*************************************************
	 * constructor
	 * @param serial
	 * @param name
	 * @param qtyOnHand
	 * @param cost
	 * @param typeIndex
	 * @param notes
	 *  qtyInUse
	 *  qtyAvailable
	 *  extCost
	 *  relProjects
	 */
	public Material(String serial, String name, int qtyOnHand, double cost, int typeIndex, String notes) {
		this.serial = serial;
		this.name = name;
		this.qtyOnHand = qtyOnHand;
		this.cost  = cost;
		this.typeIndex  = typeIndex;
		this.notes = notes;
		this.qtyInUse = 0;
		this.qtyAvail = this.qtyOnHand - this.qtyInUse;
		this.extCost  = this.cost * this.qtyOnHand;
		this.projects = new ArrayList<Project>();
		
	}
	
	//getters
	public String getSerial() {
		return serial;
	}
	public String getName() { 
		return name; 
	}
	public double getCost() { 
		return cost; 
	}
	public int getQOH() { 
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
	public int getTypeIndex() {
		return typeIndex;
	}
	public ArrayList<Project> getRelatedProjects() {
		return projects;
	}
	
	//setters
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public void setCost(double cost) { 
		this.cost = cost; 
	}
	public void setQOH(int qtyOnHand) { 
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
	public void setTypeIndex(int typeIndex) {
		this.typeIndex = typeIndex; 
	}
	public void addToProject(Project project){ 
		//add material to list of related projects
		this.projects.add(project); 
	}
	public void removeFromProject(Project project){ 
		//removes project from list of related projects
		this.projects.remove(project); 
	}
	public String toString() { 
		return name; 
	}


	
}