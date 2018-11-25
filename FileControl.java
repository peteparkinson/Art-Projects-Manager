/************************************************
 * FileControl.java
 * 11-20-2018
 * Pete Parkinson
 * 
 * IO for material and project files
 * 
 ************************************************/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileControl {
	
	public static void createMaterialFile(Material m) throws IOException{

		BufferedWriter bw = null;
		FileWriter writer = null;
		File f = new File(
				materialsPath + "\\" + m.getName() + ".txt");
		  
		//Create the file
		if (f.createNewFile())
		{
		    System.out.println("File is created!");
		} else {
		    System.out.println("File already exists.");
		}
		 
		writer = new FileWriter(f);
		bw = new BufferedWriter(writer);

		/*****************************
		 * Write content by line:
		 *  - name
		 *  - quantity
		 *  - cost
		 *  - notes
		 */
		
		bw.write(m.getName());
        bw.newLine();
		bw.write(ListData.materialTypes[m.getTypeIndex()]);
        bw.newLine();
		bw.write(String.valueOf(m.getQOH()));
        bw.newLine();
		bw.write(String.valueOf(m.getCost()));
        bw.newLine();
		bw.write(m.getNotes());
		bw.close();
		
	}
	
	public static void loadMaterialsLists(){
		File folder = new File("C://Tools//workspace//Inventory System//Materials");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        System.out.println(file.getName());
		    }
		}
	}
	
	public static void loadProjects(){
		
	}
	
	public static void createProjectFile(Project p) throws IOException{

		BufferedWriter bw = null;
		FileWriter writer = null;
		File f = new File(
				"projectsPath" + p.getName() + ".txt");
		  
		//Create the file
		if (f.createNewFile())
		{
		    System.out.println("File is created!");
		} else {
		    System.out.println("File already exists.");
		}
		 
		writer = new FileWriter(f);
		bw = new BufferedWriter(writer);

		//Write content by line:
		bw.write(p.getName());
        bw.newLine();
		bw.close();
		
	}

	public static void initDirectory() {
		// Create a directory; all non-existent ancestor directories are
		// automatically created

	}

	public static boolean validateDirectories() {

		//validate main directory exists
		if (Files.exists(APMPath)) {
		    System.out.println("Art Projects Manager directory exists");
		} else {
			System.out.println("Art Projects Manager directory does not exist");
			boolean created = (new File(String.valueOf(APMPath))).mkdirs();
			if (created) {
				System.out.println("Created Art Projects Manager directory");
			} else {
			    System.out.println("Could not create main file directory");
			    System.out.println("Exiting program");
			    return false;
			}
		}
		
		//validate materials directory
		if (Files.exists(materialsPath)) {
		    System.out.println("Materials directory exists");
		} else {
			System.out.println("Materials directory does not exist");
			boolean created = (new File(String.valueOf(materialsPath))).mkdirs();
			if (created) {
				System.out.println("Created Materials directory");
			} else {
			    System.out.println("Could not create Materials file directory");
			    System.out.println("Exiting program");
			    return false;
			}
		}
		
		//validate projects directory
		if (Files.exists(projectsPath)) {
		    System.out.println("Projects directory exists");
		} else {
			System.out.println("Projects directory does not exist");
			boolean created = (new File(String.valueOf(projectsPath))).mkdirs();
			if (created) {
				System.out.println("Created Projects directory");
			} else {
			    System.out.println("Could not create Projects file directory");
			    System.out.println("Exiting program");
			    return false;
			}
		}
		
		//validate customer directory
		if (Files.exists(customersPath)) {
		    System.out.println("Customers directory exists");
		} else {
			System.out.println("Customers directory does not exist");
			boolean created = (new File(String.valueOf(customersPath))).mkdirs();
			if (created) {
				System.out.println("Created Customers directory");
			} else {
			    System.out.println("Could not create Customers file directory");
			    System.out.println("Exiting program");
			    return false;
			}
		}
		
		//validate invoices directory
		if (Files.exists(invoicesPath)) {
		    System.out.println("Invoices directory exists");
		} else {
			System.out.println("Invoices directory does not exist");
			boolean created = (new File(String.valueOf(invoicesPath))).mkdirs();
			if (created) {
				System.out.println("Created Invoices directory");
			} else {
			    System.out.println("Could not create Invoices file directory");
			    System.out.println("Exiting program");
			    return false;
			}
		}
		return true;
	}
	
	static Path APMPath 	  = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager");
	static Path materialsPath = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Materials");
	static Path projectsPath  = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Projects");
	static Path customersPath = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Customers");
	static Path invoicesPath  = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Invoices");
}