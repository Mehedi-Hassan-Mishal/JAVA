import java.lang.*;
import classes.*;
import interfaces.*;
import java.io.File; 
import java.util.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FoodCourt fc = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		boolean choice = true;
		
		while(choice)
		{
			System.out.println("Choose from the Following Options: ");
			System.out.println("--------------------------------------");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant FoodItem Management");
			System.out.println("4. FoodItem Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println("--------------------------------------\n");
			
			System.out.print("You have choosed: ");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
				
					System.out.println("********************");
					System.out.println("Employee Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Remove Existing Employee");
					System.out.println("3. Show All Employees");
					System.out.println("4. Search an Employee");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input1 = sc.nextInt();
					
					switch(input1)
					{
						case 1:
							
							System.out.println("#####################");
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee ID: ");
							String nid1 = sc.next();
							
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							
							System.out.print("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setNid(nid1);
							e1.setName(name1);
							e1.setSalary(salary);
							
							fc.insertEmployee(e1);
							
							System.out.println("#####################");
							break;

						case 2:
							
							System.out.println("#####################");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String nid2 = sc.next();
							
							Employee e2 = fc.getEmployee(nid2);
							fc.removeEmployee(e2);
							
							System.out.println("#####################");
							break;	

						case 3:
							
							System.out.println("#####################");
							System.out.println("Show All Employees");
							
							fc.showAllEmployees();
							System.out.println("#####################");
							break;
                        case 4:
							
							System.out.println("#####################");
							System.out.println("Search An Employee");
							
							System.out.print("Enter Employee ID: ");
							String nid3 = sc.next();
							
							Employee e3 = fc.getEmployee(nid3);
							
							if(e3 !=null)
							{
								System.out.println("Employee ID: "+e3.getNid());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3.getSalary());
							}
							else
							{
								System.out.println("Employee Does Not Exists");
							}
							System.out.println("#####################");
							break;								

						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
				
				case 2:
				
					System.out.println("********************");
					System.out.println("Restaurant Management");
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New Restaurant");
					System.out.println("2. Remove Existing Restaurant");
					System.out.println("3. Show All Restaurant ");
					System.out.println("4. Search a Restaurant");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input2 = sc.nextInt();
					
					switch(input2)
					{
						case 1:
							
							System.out.println("#####################");
							System.out.println("Insert New Restaurant");
							
							System.out.print("Enter Restaurant Rid: ");
							String rid1 = sc.next();
							
							System.out.print("Enter  Name: ");
							String name1 = sc.next();
			
							Restaurant r1 = new Restaurant();
							r1.setRid(rid1);
							r1.setName(name1);
				
							fc.insertRestaurant(r1);
							
							System.out.println("#####################");
							break;

						case 2:
							
							System.out.println("#####################");
							System.out.println("Remove Existing Restaurant");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = sc.next();
							
							Restaurant r2 = fc.getRestaurant(rid2);
							fc.removeRestaurant(r2);
							
							System.out.println("#####################");
							break;	

						case 3:
							
							System.out.println("#####################");
							System.out.println("Show All Restaurant");
							
							fc.showAllRestaurants();
							System.out.println("#####################");
							break;

                        case 4:
							
							System.out.println("#####################");
							System.out.println("Search a Restaurant");
							
							System.out.print("Enter Restaurant Rid: ");
							String rid4 = sc.next();
							
							Restaurant r4 = fc.getRestaurant(rid4);
							
							if(r4 !=null)
							{
								System.out.println("Restaurant RID: "+r4.getRid());
								System.out.println("Restaurant Name: "+r4.getName());
								r4.showAllFoodItems();
							}
							else
							{
								System.out.println("Restaurant Does Not Exist");
							}
							System.out.println("#####################");
							break;								

						case 5:
							
							System.out.println("#####################");
							System.out.println("Go Back");
							System.out.println("#####################");
							break;
							
						default:
							System.out.println("#####################");
							System.out.println("Invaild Choice");
							System.out.println("#####################");
							break;
					}
					System.out.println("********************");
					break;
					
				case 3:
				
					System.out.println("********************");
					System.out.println("Restaurant Fooditem Management");
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Insert New FoodItem");
					System.out.println("2. Remove Existing FoodItem");
					System.out.println("3. Show All FoodItems");
					System.out.println("4. Search a FoodItem");
					System.out.println("5. Go Back");
					System.out.println("--------------------------------------\n");
					System.out.print("Enter your option: ");
					int input3 = sc.nextInt();
					
					switch(input3)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Insert New FoodItem\n");
							
							System.out.println("Which Type of FoodItem Do you Want?");
							System.out.println("1. MainDish");
							System.out.println("2. Appetizers");
							System.out.println("3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							FoodItem f = null;
							
							if(type == 1)
							{
								System.out.print("Enter FoodItem fid: ");
							    String fid1 = sc.next();
								System.out.print("Enter FoodItem name: ");
								String n1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Enter Price: ");
								double p1 = sc.nextDouble();
								System.out.print("Enter Category: ");
								String c1 = sc.next();
					
								MainDish md = new MainDish();
								
								md.setFid(fid1);
								md.setName(n1);
								md.setAvailableQuantity(aq1);
								md.setPrice(p1);
								md.setCategory(c1);
								
								f = md;
							}
							else if(type == 2)
							{
								System.out.print("Enter FoodItem fid: ");
							    String fid1 = sc.next();
								System.out.print("Enter FoodItem name: ");
								String n1 = sc.next();
								System.out.print("Enter Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Enter Price: ");
								double p1 = sc.nextDouble();
								System.out.print("Enter Size: ");
								String s1 = sc.next();
								
								Appetizers ap = new Appetizers();
								
								ap.setFid(fid1);
								ap.setName(n1);
								ap.setAvailableQuantity(aq1);
								ap.setPrice(p1);
								ap.setSize(s1);
								
								f = ap;
							}
							else if(type == 3)
							{
								System.out.println("Going Back....");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							
							if(f != null)
							{
								System.out.print("Enter Restaurant RID: ");
								String rid1 = sc.next();
								
								fc.getRestaurant(rid1).insertFoodItem(f);
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Remove Existing FoodItem");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = sc.next();
							System.out.print("Enter FoodItem name: ");
							String n2 = sc.next();
							
							fc.getRestaurant(rid2).removeFoodItem(fc.getRestaurant(rid2).getFoodItem(n2));
							
							System.out.println("#####################");
							break;
							
						case 3:
						
							System.out.println("#####################");
							System.out.println("Show All FoodItem");
							System.out.print("Enter Resaturant RID: ");
							String rid3 = sc.next();
							
							fc.getRestaurant(rid3).showAllFoodItems();
							
							System.out.println("#####################");
							break;
							
						case 4:
						
							System.out.println("#####################");
							System.out.println("Search a FoodItem");
							
							System.out.print("Enter Restaurant RID: ");
							String rid4 = sc.next();
							System.out.print("Enter FoodItem name: ");
							String n4 = sc.next();
							
							
							FoodItem ff = fc.getRestaurant(rid4).getFoodItem(n4);
							
							if(ff != null)
							{
								ff.showInfo();
							}
							
							System.out.println("#####################");
							break;
						
						case 5:
						
							System.out.println("#####################");
							System.out.println("Going Back ....");
							System.out.println("#####################");
							break;
							
						default:

							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
						
					}
					
					System.out.println("********************");
					break;
								
				case 4:
				
					System.out.println("********************");
					System.out.println("FoodItem Quantity Add-sell");
					
					
					System.out.println("What do you want to do?\n");
					System.out.println("--------------------------------------");
					System.out.println("1. Add FoodItem");
					System.out.println("2. Sell FoodItem");
					System.out.println("3. Show Add Sell History");
					System.out.println("4. Go Back");
					System.out.println("--------------------------------------\n");
					
					System.out.print("Enter your option: ");
					int input4 = sc.nextInt();
					
					switch(input4)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Add FoodItem\n");
							
							System.out.print("Enter Resaturant RID: ");
							String rid1 = sc.next();
							System.out.print("Enter FoodItem name: ");
							String n1 = sc.next();
							System.out.print("Enter Add FoodItem price: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								fc.getRestaurant(rid1).getFoodItem(n1).addQuantity(amount1);
								
								//frwd.writeInFile("$"+amount1+" has been Deposited in Account Number "+ an1);
								frwd.writeInFile("Add	: $"+ amount1+" in "+ n1);
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Sell FoodItem");
							
							System.out.print("Enter Restaurant RID: ");
							String rid2 = sc.next();
							System.out.print("Enter name: ");
							String n2 = sc.next();
							System.out.print("Enter Sell item: ");
							int amount2 = sc.nextInt();
							
							if(amount2>0 && amount2 <= fc.getRestaurant(rid2).getFoodItem(n2).getPrice())
							{
								fc.getRestaurant(rid2).getFoodItem(n2).sellQuantity(amount2);
								
								frwd.writeInFile("Sell	: $"+ amount2+" in "+ n2);
							}
							
							System.out.println("#####################");
							break;
							
						case 3:
						
							System.out.println("#####################");
							System.out.println("Show Add Sell History");
							frwd.readFromFile();
							
							System.out.println("#####################");
							break;
							
						case 5:
						
							System.out.println("#####################");
							System.out.println("Going Back..");
							System.out.println("#####################");
							break;
							
						default:
						
							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
					}
					
					System.out.println("********************");
					break;
								
				case 5:
				
					System.out.println("********************");
					System.out.println("Exit");
					choice = false;
					System.out.println("********************");
					break;
					
				default:
				
					System.out.println("********************");
					System.out.println("Invalid Option");
					System.out.println("********************");
					break;
			}
			
		}
		
		
	}
}
