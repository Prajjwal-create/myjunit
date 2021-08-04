package Business;

public class Employee {

	
    private int empId;
    private String name;
    private int salary;
	public Employee(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    
	public  String getEmpNameWithHighestSalary(){
        /**   * logic to get Highest paid employee        */
        return "Raj";
    }
    
    public  Employee getHighestPaidEmployee(){
        /**  * hiding logic to get highest paid employee     */
        return new Employee(1, "Raj", 15000);
        
    }
	
}
