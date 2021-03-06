/************************************************
 * FileControl.java
 * 3-11-20
 * Pete Parkinson
 * 
 * IO for material and project files
 * 
 ************************************************/

import java.awt.Desktop;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class FileControl {
	
	static Path APMPath 	  = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager");
	static Path materialsPath = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Materials");
	static Path projectsPath  = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Projects");
	static Path customersPath = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Customers");
	static Path invoicesPath  = Paths.get("C:\\Users\\Public\\Documents\\Art Projects Manager\\Invoices");
	
	public static void createMaterialFile(Material m) throws IOException{

		BufferedWriter bw = null;
		FileWriter writer = null;
		File f = new File(materialsPath + "\\" + m.getName() + ".txt");
		  
		//Create the file
		if (f.createNewFile()) {
		    System.out.println(m + " File is created");
		} else {
		    System.out.println(m + " File already exists");
		}
		 
		writer = new FileWriter(f);
		bw = new BufferedWriter(writer);

		/*****************************
		 * Write content by line:
		 *  - serial
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

	public static void createCustomerFile(Customer c) throws IOException {

		BufferedWriter bw = null;
		FileWriter writer = null;
		File f = new File(
				customersPath + "\\" + c.getName() + ".txt");
		  
		//Create the file
		if (f.createNewFile()) {
		    System.out.println(c + " file is created");
		} else {
		    System.out.println(c + " file already exists");
		}
		 
		writer = new FileWriter(f);
		bw = new BufferedWriter(writer);

		/*****************************
		 * Write content by line:
		 *  - serial
		 *  - name
		 *  - address
		 *  - phone
		 */

		bw.write(c.getSerial());
        bw.newLine();
		bw.write(c.getName());
        bw.newLine();
		bw.write(c.getAddress());
        bw.newLine();
		bw.write(c.getPhone());
		bw.close();
		
		
	}
	
	public static void createProjectFile(Project p) throws IOException {

		BufferedWriter bw = null;
		FileWriter writer = null;
		File f = new File(projectsPath + "\\" +  p.getName() + ".txt");
		  
		//Create the file
		if (f.createNewFile()) {
		    System.out.println(p + " file is created");
		} else {
		    System.out.println(p + " file already exists");
		}
		 
		writer = new FileWriter(f);
		bw = new BufferedWriter(writer);

		/*****************************
		 * Write content by line:
		 *  - serial
		 *  - name
		 *  - type
		 *  - customer
		 *  - notes
		 *  - openStatus
		 *  - hours
		 *  - charge
		 *  - finished status
		 *  - materials
		 */

		bw.write(p.getSerial());
        bw.newLine();
		bw.write(p.getName());
        bw.newLine();
		bw.write(ListData.projectTypes[p.getTypeIndex()]);
        bw.newLine();
		bw.write(p.getCustomer().getName());
        bw.newLine();
		bw.write(p.getNotes());
        bw.newLine();
		bw.write(String.valueOf(p.getOpenStatus()));
        bw.newLine();
		bw.write(String.valueOf(p.getHours()));
        bw.newLine();
		bw.write(String.valueOf(p.getCharge()));
        bw.newLine();
		bw.write(String.valueOf(p.getFinishedStatus()));
		for(int i = 0; i < p.getMaterials().size(); i++) {
			bw.newLine();
			bw.write(p.getMaterials().get(i).getName());
		}
		bw.close();
		
	}

	public static void createInvoiceFile(Project p) throws IOException{

		BufferedWriter bw = null;
		FileWriter writer = null;
		File f = new File(invoicesPath + "\\" + p.getName() + ".txt");
		  
		//Create the file
		if (f.createNewFile()) {
		    System.out.println(p + " Invoice is created");
		} else {
		    System.out.println(p + " Invoice already exists");
		}
		 
		writer = new FileWriter(f);
		bw = new BufferedWriter(writer);
	    Date today = Calendar.getInstance().getTime();
	    String message = GUI.ITMessageArea.getText();

		/*****************************
		 * Write content by line:
		 *  - Business name
		 *  - today's date
		 *  - customer's name
		 *  - customer's address
		 *  - project name
		 *  - qty 1
		 *  - $ charge
		 *  - message
		 */

		bw.write("Eluna Mae Arts");
        bw.newLine();
		bw.write(String.valueOf(today));
        bw.newLine();
		bw.write(p.getCustomer().getName());
        bw.newLine();
		bw.write(p.getCustomer().getAddress());
        bw.newLine();
		bw.write(p.getName());
        bw.newLine();
		bw.write("Qty: 1");
        bw.newLine();
		bw.write("$" + String.valueOf(p.getCharge()));
        bw.newLine();
		bw.write(message);
		bw.close();
		
		//open file in notepad
		if (Desktop.isDesktopSupported()) {
		    Desktop.getDesktop().edit(f);
		} else {
		    // dunno, up to you to handle this
		}
		
	}
	
	public static boolean directoryContainsFile(Path path, String fileName) {
		File folder = new File(String.valueOf(path));
		File[] listOfFiles = folder.listFiles();

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
			System.out.println("loaded " + listOfFiles[i]);
		}
		
		for (File file : listOfFiles) {
		    if (file.isFile()) {
		    	try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line = null;
					Material m = new Material();

					line = br.readLine();
					//set global serial to 1 higher than highest read
					if(Integer.parseInt(line) >= ListData.getMatSerial()) {
						ListData.setMatSerial(String.valueOf(Integer.parseInt(line) + 1));
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
		    }
		}
	}
	
	//loads material files into RAM, displays on GUI lists
	public static void loadCustomersLists(){
		File folder = new File(String.valueOf(customersPath));
		File[] listOfFiles = folder.listFiles();
		
		for(int i = 0; i < listOfFiles.length; i++) {
			System.out.println("loaded " + listOfFiles[i]);
		}
		
		for (File file : listOfFiles) {
		    if (file.isFile()) {
		    	try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line = null;
					Customer c = new Customer();

					line = br.readLine();
					//set global serial to 1 higher than highest read
					if(Integer.parseInt(line) >= ListData.getCustSerial()) {
						ListData.setCustSerial(String.valueOf(Integer.parseInt(line) + 1));
					}
					
					c.setSerial(line);
					line = br.readLine();
					c.setName(line);
					line = br.readLine();
					c.setAddress(line);
					line = br.readLine();
					c.setPhone(line);
					br.close();
					
					//add material to global arraylist
					ListData.customers.add(c);
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					System.out.println("Cannot find file " + file);
				} catch (IOException e) {
					System.out.println("Cannot read from file " + file);
					e.printStackTrace();
				}
		    }
		}
		//display global materials list on GUI lists
		Action.updateCustList(GUI.customersModel, ListData.customers);
	}
	
	//loads material files into RAM, displays on GUI lists
	public static void loadProjectsLists(){
		File folder = new File(String.valueOf(projectsPath));
		File[] listOfFiles = folder.listFiles();
		
		for(int i = 0; i < listOfFiles.length; i++) {
			System.out.println("loaded " + listOfFiles[i]);
		}
		
		for (File file : listOfFiles) {
		    if (file.isFile()) {
				Project p = new Project();
		    	try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line = null;

					 /*********************
					  *  - serial
					  *  - name
					  *  - type
					  *  - customer
					  *  - notes
					  *  - openStatus
					  *  - hours
					  *  - charge
					  *  - finished status
					  *  - materials
					 *********************/
					 
					line = br.readLine();
					//set global serial to 1 higher than highest read
					if(Integer.parseInt(line) >= ListData.getProSerial()) {
						ListData.setProSerial(String.valueOf(Integer.parseInt(line) + 1));
					}
					p.setSerial(line);
					line = br.readLine();
					p.setName(line);
					line = br.readLine();
					p.setTypeIndex(Arrays.asList(ListData.projectTypes).indexOf(line));
					line = br.readLine();
					Customer c = new Customer();
					for(int i = 0; i < ListData.customers.size(); i++) {
						if(ListData.customers.get(i).getName().equals(line)) {
							c = ListData.customers.get(i);
							break;
						}
					}
					p.setCustomer(c);
					line = br.readLine();
					p.setNotes(line);
					line = br.readLine();
					boolean status = true;
					if(line.equals("false")) {
						status = false;
					}
					p.setOpenStatus(status);
					line = br.readLine();
					p.setHours(Integer.parseInt(line));
					line = br.readLine();
					p.setCharge(Double.parseDouble(line));
					line = br.readLine();
					if(line.equals("false")) {
						p.setFinishedStatus(false);
					} else {
						p.setFinishedStatus(true);
					}
					Material m;
					while ((line = br.readLine()) != null) {
						for(int i = 0; i < ListData.materials.size(); i++) {
							m = ListData.materials.get(i);
							if(String.valueOf(ListData.materials.get(i)).equals(line)) {
								if(status) {
									m.useOne();
								}
								p.addMaterial(m);
							}
						}
					}
					br.close();
					
					//add project to global arraylist
					if(p.getOpenStatus()) {
						ListData.openProjects.add(p);
					} else {
						ListData.closedProjects.add(p);
					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					System.out.println("Cannot find file " + file);
				} catch (IOException e) {
					System.out.println("Cannot read from file " + file);
					e.printStackTrace();
				}
		    }
		}
		//display global materials list on GUI lists
		Action.updateProList(GUI.openProModel, ListData.openProjects);
		Action.updateProList(GUI.closedProModel, ListData.closedProjects);
		
	}



	//delete customer's respective file
	public static void deleteCustFile(Customer c) {
		File folder = new File(String.valueOf(customersPath));
		File[] listOfFiles = folder.listFiles();
		folder = new File(String.valueOf(customersPath));
	

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		    	try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line = br.readLine();

					//finds the material's serial number in the file
					if(c.getSerial().equals(line)) {
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

	//delete material's respective file
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

	//delete project's respective file
	public static void deleteProFile(Project p) {
		File folder = new File(String.valueOf(projectsPath));
		File[] listOfFiles = folder.listFiles();
		folder = new File(String.valueOf(projectsPath));
	

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		    	try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String line = br.readLine();

					//finds the material's serial number in the file
					if(p.getSerial().equals(line)) {
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
