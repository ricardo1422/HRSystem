package org.generation.clases;

public class SalesRep extends Employee{

	private double salesMade;

	//constructor
	public SalesRep(String firstName, String lastname, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastname, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}
	
	//calcula la comision
	
	public int calculateComission(){
		 return  (int)(0.1 * salesMade);
	}

	//getters and setters
	public double getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}

	@Override
	public String toString() {
		return "SalesRep [salesMade=" + salesMade + ", getFirstName()=" + getFirstName() + ", getLastname()="
				+ getLastname() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + "]";
	}
	
	
	
	
	
	
	
}
