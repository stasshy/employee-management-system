package employees;

public class Academic {
	private int id; //private to not be changed by either the programmer or the outsider
	static final int baseMonthlySalary= 500; //final to create constant and static to be able to be used in the whole class(not through instances)
	private int workedhours;
	Academic(int id){
		this.id=id; //this to have access to the private int of the specific class
	}
	public int CalculateMonthlySalary() { //ftiaxnw new method gia na xrisimopoio to basic salary kai allou
		return baseMonthlySalary;
	}
   
	public int getEmployeeID() { //getter method gia na exo prosvasi sto id kai na to vlepo
		return id;
	}
	
}
