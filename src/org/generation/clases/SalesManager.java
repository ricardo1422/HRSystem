package org.generation.clases;


import java.util.HashMap;

public class SalesManager extends SalesRep {

	private HashMap<Integer, SalesRep> salesTeam = new HashMap<Integer, SalesRep>();

	//constructor
	public SalesManager(String firstName, String lastname, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade,
			HashMap<Integer, SalesRep> salesTeam) {
		super(firstName, lastname, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesTeam = salesTeam;
	}
	//calcula comision
	@Override
	public int calculateComission(){
		double comission=0;
		
		for (SalesRep sales : this.salesTeam.values()) {
			
			comission+=sales.getSalary();	
		}
		
		comission= comission*0.03;
		      // 0.03 * all sales made by team
		return (int) comission;
		   
	}
	//getter and setter
	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}
	public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}
	
	
	
}
