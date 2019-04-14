package in.mac.durga.beans;

/**
 * 
 * @author mahesh 14-Apr-2019 Purpose: Engine interface implemented.
 *
 */
public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("DieselEngine: 0-Param Constructor.");
	}

	public void start() {
		System.out.println("Diesel Engine:: Started.");
	}

	public void stop() {
		System.out.println("Diesel Engine:: Stooped.");
	}

}
