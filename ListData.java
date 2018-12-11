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

	private static String customerSerialNumber = "0";
	private static String materialSerialNumber = "0";
	private static String projectSerialNumber = "0";
	
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
				"",
				"Shadow Box",
				"Wood Burning",
				"Print",
				"Cross Stitch",
				"Painting",
				"Jewelry",
				"Other"
			};
	

	public static String[] getcustomerNames() {
		String[] tmp = new String[customers.size() + 1];
		for(int i = 0; i < customers.size(); i++) {
			tmp[i + 1] = customers.get(i).getName();
		}
		return tmp;
	}
	public static int getMatSerial() {
		return Integer.parseInt(materialSerialNumber);
	}

	public static int getCustSerial() {
		return Integer.parseInt(customerSerialNumber);
	}

	public static int getProSerial() {
		return Integer.parseInt(projectSerialNumber);
	}
	
	public static String getNewMatSerial() {
		String tmp = materialSerialNumber;
		materialSerialNumber = String.valueOf(Integer.parseInt(materialSerialNumber) + 1);
		return tmp;
	}
	
	public static String getNewCustSerial() {
		String tmp = customerSerialNumber;
		customerSerialNumber = String.valueOf(Integer.parseInt(customerSerialNumber) + 1);
		return tmp;
	}
	
	public static String getNewProSerial() {
		String tmp = projectSerialNumber;
		projectSerialNumber = String.valueOf(Integer.parseInt(projectSerialNumber) + 1);
		return tmp;
	}

	public static void setMatSerial(String num) {
		materialSerialNumber = num;;
	}

	public static void setCustSerial(String num) {
		customerSerialNumber = num;;
	}

	public static void setProSerial(String num) {
		projectSerialNumber = num;;
	}
	
}
