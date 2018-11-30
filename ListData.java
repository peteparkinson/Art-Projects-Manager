/**
 * This file controls the lists found in the app, when and what data
 * gets loaded
 *
 */

import java.util.ArrayList;

public class ListData {

	public static ArrayList<Material> materials = new ArrayList<Material>();
	public static ArrayList<Material> dedicate  = new ArrayList<Material>();
	public static ArrayList<Project> openProjects     = new ArrayList<Project>();
	public static ArrayList<Project> closedProjects   = new ArrayList<Project>();
	public static ArrayList<Project> projectsToFinish = new ArrayList<Project>();
	public static ArrayList<Customer> customers = new ArrayList<Customer>();
	
	private static String materialSerialNumber = "0";
	
	//types of materials
	public static String[] materialTypes = new String[] 
			{	
				"",
				"Ceramic",
				"Clay",
				"Cloth",
				"Glass",
				"Metal",
				"Other",
				"Paper",
				"Plastic",
				"Sand",
				"Stone",
				"String",
				"Wood"
			};

	//types of projects
	public static String[] projectTypes = new String[] 
			{	
				"Shadow Box",
				"Other",
				"Wood Burning"
			};
	

	public static void ListAllMaterials() {
		
	}

	public static String getNewSerial() {
		String tmp = materialSerialNumber;
		materialSerialNumber = String.valueOf(Integer.parseInt(materialSerialNumber) + 1);
		return tmp;
	}
	
	public static void setSerial(String num) {
		materialSerialNumber = num;;
	}
	
}
