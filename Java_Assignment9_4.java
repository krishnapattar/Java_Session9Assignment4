package Java_Assignment94;
/*
 * This class will help to master your skills on Collections Framework in Java.
 */

import java.util.Comparator;
import java.util.TreeSet;
 

public class Java_Assignment9_4 
{


	public static void main(String[] args) 
	{
        //Treeset for storing thr employee object
        TreeSet<Employee> salComp = new TreeSet<Employee>(new MySalaryComp());
        //Adding Employees with different name designation and Salary
        salComp.add(new Employee("Ram","Programmer",30000));
        salComp.add(new Employee("John","Clerk",20000));
        salComp.add(new Employee("Crish","Account",20000));
        salComp.add(new Employee("Crish","Prof",20000));
        salComp.add(new Employee("Tom","Prof",24000));
        salComp.add(new Employee("Crish","Programmer",60000));
        salComp.add(new Employee("Rajeev","Attendant",13000));
        for(Employee e:salComp) // printng the employee details in sorting orders
        {
            System.out.println(e);

        }

}
}
 
// MySalaryComp class which inherited from Comparator interface
class MySalaryComp implements Comparator<Employee>{
 
   
    public int compare(Employee e1, Employee e2) 
    {
    	if(e1.getSalary() == e2.getSalary())//if salary are same then compare with name
    	{
    		if (e1.getName() == e2.getName()) //if name are same compare with Designation
    		{
    			return e1.getDesignation().compareTo(e2.getDesignation()); //Designation comparision
    		}
    		else
    		{
    			return e1.getName().compareTo(e2.getName()); //name comparision
    		}
    	}
    	else if(e1.getSalary() > e2.getSalary())
        {
            return 1;
        } else 
        {
            return -1;
        }
    }
}
 
class Employee //Employee Class
{
     
    private String name,Desig;
    private int salary;
     
    public Employee(String n,String desi, int s)
    {
        this.name = n;
        this.Desig=desi;
        this.salary = s;
    }
     
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
     public String getDesignation() 
     {
        return Desig;
    }
    public void setDesignation(String des) 
    {
        this.Desig = des;
    }
    public int getSalary() 
    {
        return salary;
    }
    public void setSalary(int salary) 
    {
        this.salary = salary;
    }
    public String toString() //Printing the employee details
    {
        return "Name: "+this.name+"--Designation: "+this.Desig+"-- Salary: "+this.salary;
    }
}