package employees;
import enumerations.*;
import randomize.Randomize;
import java.util.Random;

final public class HourlyBasedStaff extends Academic {
		private WorkingExperience years;
		private int workedhours;
	    private int monthlysalary;
	    
    //thelo na valo mesa tin calculate kai tin print k na simperilavo tin academic gia na exo to basic salary
    // xrisimopoio tin extends gia na einai derived apo tin academic
	//final class because ot cannot be extended , have subclasses 
	public HourlyBasedStaff(int id) {
		super(id);//constructor
		//the class is extended
		years = Randomize.WorkingExperience();
		this.workedhours = new Random().nextInt(41);
     }

	@Override 
	
	
	public int CalculateMonthlySalary() {
		int onTopSalary=0;
		if(years==WorkingExperience.uptoFiveYears) onTopSalary=10;
		if(years==WorkingExperience.FiveToTenYears) onTopSalary=20;
		if(years==WorkingExperience.morethanTenYears) onTopSalary=30;
		monthlysalary=baseMonthlySalary+(workedhours*onTopSalary);
		return monthlysalary;
	}
	
	public WorkingExperience getExperience() {
		return years;
	}
	
	public void printInfo() {
		System.out.println("");
		System.out.println("EmployeeID"+super.getEmployeeID()+"is hourly based.");
		System.out.println("Academic years:"+years);
		System.out.println("Hourly based employee salary:"+monthlysalary);
	}
}

