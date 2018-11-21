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

public class FileControl {
	
	public static void createMaterialFile(Material m) throws IOException{

		BufferedWriter bw = null;
		FileWriter writer = null;
		File f = new File(
				"C://Tools//workspace//Inventory System//Materials//" + m.getName() + ".txt");
		  
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
		bw.write(String.valueOf(m.getQtyOnHand()));
        bw.newLine();
		bw.write(String.valueOf(m.getCost()));
        bw.newLine();
		bw.write(m.getNotes());
		bw.close();
		
	}
	
	public void loadMaterials(){
		File folder = new File("C://Tools//workspace//Inventory System//Materials");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        System.out.println(file.getName());
		    }
		}
	}
	
	public void loadProjects(){
		
	}
	
	public static void createProjectFile(Project p) throws IOException{

		BufferedWriter bw = null;
		FileWriter writer = null;
		File f = new File(
				"C://Tools//workspace//Inventory System//Projects//" + p.getName() + ".txt");
		  
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
		 */
		
		bw.write(p.getName());
        bw.newLine();
		bw.close();
		
	}

}