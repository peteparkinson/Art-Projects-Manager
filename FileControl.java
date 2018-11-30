/************************************************
 * FileControl.java
 * 11-20-2018
 * Pete Parkinson
 * 
 * IO for material and project files
 * 
 ************************************************/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileControl {
	
	static Path APMPath 	  = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager");
	static Path materialsPath = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Materials");
	static Path projectsPath  = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Projects");
	static Path customersPath = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Customers");
	static Path invoicesPath  = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Invoices");
	
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
		 *  - type
		 *  - quantity
		 *  - cost
		 *  - notes
		 */

		bw.write(m.getSerial());
        bw.newLine();
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
	
	public static boolean directoryContainsFile(Path path, String fileName) {
		File folder = new File(String.valueOf(materialsPath));
		File[] listOfFiles = folder.listFiles();

		System.out.println(listOfFiles.length);
		
		for(File file : listOfFiles) {
			if(String.valueOf(file).contains(fileName + ".txt")) {
				return true;
			}
		}
		
		return false;
	}
	
	//loads material files into RAM, displays on GUI lists
	public static void loadMaterialsLists(){
		File folder = new File(String.valueOf(materialsPath));
		File[] listOfFiles = folder.listFiles();

		for(int i = 0; i < listOfFiles.length; i++) {

			System.out.println("\nloaded " + listOfFiles[i]);
		}
			
		
		for (File file : listOfFiles) {
		    if (file.isFile()) {
		    	try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line = null;
					Material m = new Material();

					line = br.readLine();
					if(Integer.parseInt(line) >= Integer.parseInt(ListData.getNewSerial())) {
						ListData.setSerial(String.valueOf(Integer.parseInt(line) + 1));
					}
					
					m.setSerial(line);
					
					line = br.readLine();
					m.setName(line);

					line = br.readLine();
					m.setTypeIndex(Arrays.asList(ListData.materialTypes).indexOf(line));
					
					line = br.readLine();
					m.setQOH(Integer.parseInt(line));

					line = br.readLine();
					m.setCost(Double.parseDouble(line));

					line = br.readLine();
					m.setNotes(line);
					
					br.close();
					
					//add material to global arraylist
					ListData.materials.add(m);
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					System.out.println("Cannot find file " + file);
				} catch (IOException e) {
					System.out.println("Cannot read from file " + file);
					e.printStackTrace();
				}
				//display global materials list on GUI lists

				Action.updateMatList(GUI.allMaterialsModel, ListData.materials);
		        System.out.println();
		    }
		}
	}
	

	//delete objects respective file
	public static void deleteMatFile(Material m) {
		File folder = new File(String.valueOf(materialsPath));
		File[] listOfFiles = folder.listFiles();
		folder = new File(String.valueOf(materialsPath));
	

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		    	try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line = br.readLine();

					//finds the material's serial number in the file
					if(m.getSerial().equals(line)) {
						br.close();
						file.delete();
						System.out.println("deleted " + String.valueOf(file));
						return;
						
					}
					
					br.close();
					
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					System.out.println("Cannot find file " + file);
				} catch (IOException e) {
					System.out.println("Cannot read from file " + file);
					e.printStackTrace();
				}

		    }
		}
		
		
	}
	
	public static void loadProjects() {
		
	}
	
	public static void createProjectFile(Project p) throws IOException {

		BufferedWriter bw = null;
		FileWriter writer = null;
		File f = new File(projectsPath + "\\" +  p.getName() + ".txt");
		  
		//Create the file
		if (f.createNewFile()) {
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

	public static boolean init() {
		if(!initDirectory(APMPath) ||
		   !initDirectory(materialsPath) ||
		   !initDirectory(projectsPath)  ||
		   !initDirectory(customersPath) ||
		   !initDirectory(invoicesPath)) {

			return false;
		} 
		return true;
		
	}
	
	public static boolean initDirectory(Path path) {
		if (Files.exists(path)) {
		    System.out.println(path + " directory exists");
		} else {
			System.out.println(path + " does not exist");
			boolean created = (new File(String.valueOf(path))).mkdirs();
			if (created) {
				System.out.println("Created " + path + " directory");
			} else {
			    System.out.println("Could not create " + path);
			    System.out.println("Exiting program");
			    return false;
			}
		}		
		return true;
	}

	
}