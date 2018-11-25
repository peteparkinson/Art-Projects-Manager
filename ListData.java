/**
 * This file controls the lists found in the app, when and what data
 * gets loaded
 *
 */

import java.util.ArrayList;

public class ListData {

	public static ArrayList<Material> materials = new ArrayList<Material>();
	
	//types of materials
	public static String[] materialTypes = new String[] 
			{	
				"",
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

	/*
	public ArrayList<String> getMaterialsNames(){
		
	}
	*/
	

}
