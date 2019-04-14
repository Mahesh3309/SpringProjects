package in.mac.durga.beans;

/**
 * 
 * @author mahesh 14-Apr-2019 Purpose:Inject Name No and salary automatically
 *         while creating Employee object using Constructor Injection.
 *
 */
public class Employee {
	private String empName;
	private int empNo;
	private float salary;

	public Employee(String empName, int empNo, float salary) {
		super();
		this.empName = empName;
		this.empNo = empNo;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empNo=" + empNo + ", salary=" + salary + "]";
	}


	public Employee() {
		System.out.println("Employee :: 0 Param Constructor.");
	}

}
