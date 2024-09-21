package org.generation.clases;

public class Employee {

	private String firstName;
	private String lastname;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationDaysTaken;
	private double salary;
	private int yearsWorked;
	
	//constructor
	public Employee(String firstName, String lastname, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}
	
	
	
	
	//Calcula el tiempo faltante para retirarase
	public int timeToRetirement(){
			int rage=60-this.age;
			int rexp=40-this.yearsWorked;
			if (rage>=rexp) {
				return rexp;
			} else {
				return rage;
			}
			
	   }
	
	  //Calcula el tiempo restante de vacaciones
	   public int vacationTimeLeft(){
	       int vacation= (this.daysWorked/360)*(30 - this.vacationDaysTaken);
		   return vacation;
	   }
	   //calcula el bonus correspondiente
	   public int calculateBonus(){
	       int bono=(int)(2.2*this.salary);
		   return bono;
	   }
	
	   //getters and setters
	   public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public int getRegistration() {
			return registration;
		}
		public void setRegistration(int registration) {
			this.registration = registration;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getDaysWorked() {
			return daysWorked;
		}
		public void setDaysWorked(int daysWorked) {
			this.daysWorked = daysWorked;
		}
		public int getVacationDaysTaken() {
			return vacationDaysTaken;
		}
		public void setVacationDaysTaken(int vacationDaysTaken) {
			this.vacationDaysTaken = vacationDaysTaken;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getYearsWorked() {
			return yearsWorked;
		}
		public void setYearsWorked(int yearsWorked) {
			this.yearsWorked = yearsWorked;
		}
		
		//to string
		@Override
		public String toString() {
			return "Employee [firstName=" + firstName + ", lastname=" + lastname + ", registration=" + registration
					+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
					+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
		}
}
