package classes;
import java.lang.*;

public class Employee
{
	private String name;
	private String nid;
	private double salary;
	
	public void setName(String name){this.name = name;}
	public void setNid(String nid){this.nid = nid;}
	public void setSalary(double salary){this.salary = salary;}
	
	public String getName(){return name;}
	public String getNid(){return nid;}
	public double getSalary(){return salary;} 
}