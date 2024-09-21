package org.generation.main;

import java.util.HashMap;

import org.generation.clases.Employee;
import org.generation.clases.SalesManager;
import org.generation.clases.SalesRep;

public class Main {

	public static void main(String[] args) {
		
		Employee ricardo= new Employee("Ricardo","Alfaro", 215, 24, 357, 4, 14258.32, 2 );
		SalesRep adrian= new SalesRep("Adrian","García", 216, 38, 340, 10, 24258.32, 29, 35800 );
		SalesRep paola= new SalesRep("Paola","Perea", 350, 57, 339, 10, 15288.32, 33, 15800 );
		SalesRep lizeth= new SalesRep("Lizeth", "García", 400, 28, 360, 7, 35800, 5, 40000);
		SalesRep alberto= new SalesRep("Alberto", "Rojas", 425, 42, 358, 5, 37800, 15, 42000);
		HashMap<Integer, SalesRep> salesTeam = new HashMap<Integer, SalesRep>();
		salesTeam.put(216,adrian);
		salesTeam.put(350,paola);
		salesTeam.put(400,lizeth);
		salesTeam.put(425,alberto);
		SalesManager alejandro = new SalesManager("Alejandro", "Ramirez",632,50,364,10,50000,25,57000,salesTeam);
		
		ricardo.toString();
		adrian.toString();
		paola.toString();
		lizeth.toString();
		alberto.toString();
		alejandro.toString();
		
		
		//Calcula el tiempo faltante para retirarase
		System.out.println("Imprime el tiempo faltante para su retiro");
		System.out.println(ricardo.timeToRetirement()+"años");
		System.out.println(paola.timeToRetirement()+"años");
		System.out.println(alejandro.timeToRetirement()+"años");
	
		//Calcula el tiempo faltante de vacaciones
		System.out.println("Imprime su tiempo restante de vacaciones disponibles");
		System.out.println(adrian.vacationTimeLeft()+" día de vacaciones");
		System.out.println(lizeth.vacationTimeLeft()+" día de vacaciones");
		System.out.println(alejandro.vacationTimeLeft()+" día de vacaciones");
		
		 
		//calcula el bonus correspondiente
		System.out.println("Imprime su bono correspondiente");
		System.out.println("$"+ricardo.timeToRetirement());
		System.out.println("$"+lizeth.timeToRetirement());
		System.out.println("$"+alberto.timeToRetirement());
		
		//calcula la comision
		System.out.println("Calcula la comision correspondiente");
		System.out.println("$"+paola.calculateComission());
		System.out.println("$"+adrian.calculateComission());
		System.out.println("$"+lizeth.calculateComission());
		
		//calcula comision del sales manager
		System.out.println("Calcula la comisiondel sales manager");
		System.out.println("$"+alejandro.calculateComission());

	}

}
