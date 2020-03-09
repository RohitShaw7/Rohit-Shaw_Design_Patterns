package creationalPatterns;

import java.io.*;

interface Prototype {  
	  
    public Prototype getClone();  
     
}

class SalaryRecords implements Prototype{  
    
	   private int id;  
	   private String name;  
	   private double salary;    
	      
	   public  SalaryRecords(int id, String name, double salary) {  
	    this.id = id;  
	    this.name = name;    
	    this.salary = salary;    
	} 
	   
	   public void printRecords(){  
	          
	        System.out.println("Employee ID is :"+id+"\t name is :"+name+"\t salary is :"+salary+"\t");  
	   }  
	  
	    public Prototype getClone() {  
	          
	        return new SalaryRecords(id,name,salary);  
	    }  	 
}


public class PrototypePattern {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
		
		System.out.print("Enter Employee Id: ");  
        int empid=Integer.parseInt(br.readLine());  
        System.out.println();  
          
        System.out.print("Enter Employee Name: ");  
        String empname=br.readLine();  
        System.out.println();     
          
        System.out.print("Enter Employee Salary: ");  
        double empsalary= Double.parseDouble(br.readLine());  
        System.out.println();  
           
        SalaryRecords emp1=new SalaryRecords(empid,empname,empsalary);  
          
        emp1.printRecords();  
        System.out.println();  
        SalaryRecords emp2=(SalaryRecords) emp1.getClone();  //Cloning Done
        emp2.printRecords();  
	}

}
