package classAndObjects;

import java.util.Scanner;

public class Employee {
	String name;
	int year;
	double salary;
	String address;
	Employee(String name,int year,double salary,String address){
		this.name = name;
		this.year = year;
		this.salary = salary;
		this.address = address;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Employee em[] = new Employee[3];
		String name;
		int year;
		String address;
		double salary;
		for(int i=0;i<3;i++) {
			
		System.out.println("Enter employee details:");
		System.out.println("Name:");
		name = in.next();
		System.out.println("Salary:");
		salary = in.nextDouble();
		System.out.println("year:");
		year = in.nextInt();
		in.nextLine();
		System.out.print("address:");
		address = in.nextLine();
		em[i] = new Employee(name,year,salary,address);
		}
		System.out.println("Name\tYear\tAddress\n");
		for(int i=0;i<3;i++) {
			System.out.println(em[i].name+"\t"+em[i].year+"\t"+em[i].address+"\n");
		}
		in.close();

	}

}
