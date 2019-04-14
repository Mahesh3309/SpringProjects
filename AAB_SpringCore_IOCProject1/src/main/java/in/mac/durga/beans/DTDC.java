package in.mac.durga.beans;

/**
 * 
 * @author mahesh 12-Apr-2019 
 * Purpose:Override Method of Courier.
 *
 */
public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC: o-param Constructor.");
	}

	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return "DTDC is ready to deliver Product of :" + orderId;
	}

}
