package in.mac.durga.beans;

public class FirstFlight implements Courier {

	/**
	 * 
	 * @author mahesh 12-Apr-2019 
	 * Purpose:Override Method of Courier.
	 *
	 */
	public FirstFlight() {
		System.out.println("FirstFlight: o-param Constructor.");
	}

	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return "FirstFlight is ready to deliver Product of :" + orderId;
	}

}
