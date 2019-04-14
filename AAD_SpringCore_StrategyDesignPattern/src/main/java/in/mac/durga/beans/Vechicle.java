package in.mac.durga.beans;
/**
 * 
 * @author mahesh 14-Apr-2019
 *
 */
public class Vechicle {
	private Engine eng;

	public Vechicle() {
		System.out.println("Vechicle ::0 Param Constructor.");
	}

	public void setEngg(Engine eng)
	{
		System.out.println("Vechicle :: SetEngg(-).");
		this.eng=eng;
	}
	
	public void move(){
		eng.start();
		System.out.println("Viechle is moving.....");
	}
	
	public void park(){
		eng.stop();
		System.out.println("Viechled Parked for rest.");
}
}
