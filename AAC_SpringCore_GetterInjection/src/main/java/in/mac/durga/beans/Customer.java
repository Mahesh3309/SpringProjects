package in.mac.durga.beans;
/**
 * 
 * @author mahesh 14-Apr-2019
 * Inject c_no, c_name, address, billAmt automatically while creating
 *         Customer object using Constructor Injection.
 *
 */
public class Customer {
	private int cno;
	private String cname;
	private String addrs;
	private float billAmt;

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", addrs=" + addrs + ", billAmt=" + billAmt + "]";
	}

	public Customer(int cno, String cname, String addrs, float billAmt) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.addrs = addrs;
		this.billAmt = billAmt;
	}

	public Customer() {
		System.out.println("Customer :: 0 Param Customer.");
	}

}
