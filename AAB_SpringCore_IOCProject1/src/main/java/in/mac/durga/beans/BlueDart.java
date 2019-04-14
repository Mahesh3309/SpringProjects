package in.mac.durga.beans;

/**
 * 
 * @author mahesh 12-Apr-2019 
 * Purpose:Override Method of Courier.
 */
public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart: o-param Constructor.");
	}

	public String deliver(int orderId) {
		// TODO Auto-generated method stub
		return "BlueDart is ready to deliver Product of :" + orderId;
	}

}
