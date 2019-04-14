package in.mac.durga.beans;

/**
 * 
 * @author mahesh 14-Apr-2019 Purpose:Engine Implements as CNG Engine.
 * 
 */
public class CNGEngine implements Engine {

	public CNGEngine() {
		System.out.println("CNG Engine:: 0 Param Constructor.");
	}

	public void start() {
		System.out.println("CNG Engine :: Started.");
	}

	public void stop() {
		System.out.println("CNG Engine :: Stopped.");

	}

}
