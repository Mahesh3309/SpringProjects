package in.mac.durga.beans;

/**
 * 
 * @author mahesh 14-Apr-2019 Purpose: Engine Implemented as Petrol Engine.
 *
 */
public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("Pertol Engine:: 0 Param Constructor.");
	}

	public void start() {
		System.out.println("Petrol Engine:: Started.");
	}

	public void stop() {
		System.out.println("Petrol Engine:: Stopped.");
	}

}
