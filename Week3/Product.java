package casestudy3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class Product {
	
	 private static int pid; 
	 private String pname; 
	 private int pamount;
	 private int pcode; 
	 private String paddress;
	 private int ppincode;
	 
	 public Product()          //Default Constructor
	 {
		 
	 }
	 
	public Product(int pid, String pname, int pamount, int pcode, String paddress, int ppincode) {
		this.pid = pid;
		this.pname = pname;
		this.pamount = pamount;
		this.pcode = pcode;
		this.paddress = paddress;
		this.ppincode = ppincode;
	}
	
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPamount() {
		return pamount;
	}

	public void setPamount(int pamount) {
		this.pamount = pamount;
	}

	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public int getPpincode() {
		return ppincode;
	}

	public void setPpincode(int ppincode) {
		this.ppincode = ppincode;
	}



	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pamount=" + pamount + ", pcode=" + pcode + ", paddress="
				+ paddress + ", ppincode=" + ppincode + "]";
	}



	public void addProduct()                                                     //Add a Product
	{
		Scanner sc = new Scanner(System.in);
		
		    System.out.println("Enter Product id");
		    pid = sc.nextInt();
		
			System.out.println("Enter Product name");
			pname = sc.next();
			
			System.out.println("Enter Product Code");
			pcode = sc.nextInt();
			
			System.out.println("Enter Product amount");
			pamount = sc.nextInt();
			
			System.out.println("Enter Pincode");
			ppincode = sc.nextInt();
			
			System.out.println("Enter Address");
			paddress = sc.next();
			
			System.out.println("Product Added Successfully! with product id = "+pid);		
		
	}
	
	public void updateProduct()                                                    //Update Product Details
	{
		Scanner sc2 = new Scanner(System.in);
		int input;
		
		System.out.println("Enter Product id");
		input = sc2.nextInt();
		
		if(input==pid)
		{
			System.out.println("Enter Product name");
			pname = sc2.next();                                                 //We can use getpname also but i have used scanner class instead
			
			
			System.out.println("Enter Product Code");
			pcode = sc2.nextInt();
			
			System.out.println("Enter Product amount");
			pamount = sc2.nextInt();
			
			System.out.println("Enter Pincode");
			ppincode = sc2.nextInt();
			
			System.out.println("Enter Address");
			paddress = sc2.next();
			
			System.out.println("Product Added Successfully! with product id = "+pid);
		}
		else
		{
			System.out.println("Enter valid Product id");
		}
		
		
	}
	
	public void deleteProduct()                                                         //Deletes the Product
	{
		Scanner scd = new Scanner(System.in);
		System.out.println("Enter Product ID");
		pid = scd.nextInt();
	}
	
	public void getProduct()                                                           // Display Product Details
	{
		Scanner scp = new Scanner(System.in);
		System.out.println("Enter Product ID");
		pid = scp.nextInt();
		
		
	}
	
	 
	
	
	public static void main(String[] args) {
		
		Product p1 = new Product();  		                             //Storing in Hashmap
		Map<Integer, Product> hs3 = new HashMap();
		hs3.put(pid, p1);
		
		System.out.println("Enter Your Choice");
		System.out.println("1. Add Product");
		System.out.println("2. Update Product");
		System.out.println("3. Delete Product");
		System.out.println("4. Get Product");
		System.out.println("5. GetAllProducts");
		
			
		int choice;                                                  //Taking user Choices
		Scanner scch = new Scanner(System.in);
		choice = scch.nextInt();
		
		
		switch(choice)
		{
		case 1: 
			p1.addProduct();
			System.out.println("------------------------------------");
			System.out.println("");
			System.out.println("Enter Your Choice");
			System.out.println("1. Add Product");
			System.out.println("2. Update Product");
			System.out.println("3. Delete Product");
			System.out.println("4. Get Product");
			System.out.println("5. GetAllProducts");
			
			int nextchoice;
			Scanner scnch = new Scanner(System.in);
			nextchoice = scnch.nextInt();
			
			switch(nextchoice)
			{
			case 1:
				p1.addProduct();
				System.out.println("------------------------------------");
				System.out.println("Enter Your Choice");
				System.out.println("1. Add Product");
				System.out.println("2. Update Product");
				System.out.println("3. Delete Product");
				System.out.println("4. Get Product");
				System.out.println("5. GetAllProducts");
				
				int nextchoice2;
				Scanner scnch1 = new Scanner(System.in);
				nextchoice2 = scnch1.nextInt();
				
				switch(nextchoice2)
				{
				case 1:
					p1.addProduct();
					break;
				case 2:
					p1.updateProduct();
					break;
				case 3:
					p1.deleteProduct();
					hs3.clear();
					//hs3.remove(pid);
					
					System.out.println("Product Deleted Successfully !");
					
					break;
				case 4: 
					p1.getProduct();
					hs3.forEach((key, value) -> System.out.println(key + " : " + value));
				    break;
				case 5:
					System.out.println("Printing all Products...");
					System.out.println(hs3);
					break;
				}
				
			case 2:
				p1.updateProduct();
				System.out.println("------------------------------------");
				System.out.println("Enter Your Choice");
				System.out.println("1. Add Product");
				System.out.println("2. Update Product");
				System.out.println("3. Delete Product");
				System.out.println("4. Get Product");
				System.out.println("5. GetAllProducts");
				
				int nextchoice4;
				Scanner scnch15 = new Scanner(System.in);
				nextchoice4 = scnch15.nextInt();
				
				switch(nextchoice4)
				{
				case 1:
					p1.addProduct();
					break;
				case 2:
					p1.updateProduct();
					break;
				case 3:
					p1.deleteProduct();
					hs3.clear();
					//hs3.remove(pid);
					System.out.println("Product Deleted Successfully !");
					
					break;
				case 4: 
					p1.getProduct();
					hs3.forEach((key, value) -> System.out.println(key + " : " + value));
				    break;
				case 5:
					System.out.println("Printing all Products...");
					System.out.println(hs3);
					break;
	
				}			
				break;
				
			case 3:
				p1.deleteProduct();
				hs3.clear();
				//hs3.remove(pid);
				
				System.out.println("Product Deleted Successfully !");
				
				System.out.println("------------------------------------");
				System.out.println("Enter Your Choice");
				System.out.println("1. Add Product");
				System.out.println("2. Update Product");
				System.out.println("3. Delete Product");
				System.out.println("4. Get Product");
				System.out.println("5. GetAllProducts");
				
				int nextchoice7;
				Scanner scnch17 = new Scanner(System.in);
				nextchoice7 = scnch17.nextInt();
				
				switch(nextchoice7)
				{
				case 1:
					p1.addProduct();
					break;
				case 2:
					p1.updateProduct();
					break;
				case 3:
					p1.deleteProduct();
					hs3.clear();
					//hs3.remove(pid);
					System.out.println("Product Deleted Successfully !");
					
					break;
				case 4: 
					p1.getProduct();
					hs3.forEach((key, value) -> System.out.println(key + " : " + value));
				    break;
				case 5:
					System.out.println("Printing all Products...");
					System.out.println(hs3);
					break;
	
				}			
				break;
				
			case 4: 
				p1.getProduct();
				hs3.forEach((key, value) -> System.out.println(key + " : " + value));
			    break;
			case 5:
				System.out.println("Printing all Products...");
				System.out.println(hs3);
				break;
			}			
			break;
		
		default:
			System.out.println("Please Enter a valid input");
							
		}
		
	}
}
