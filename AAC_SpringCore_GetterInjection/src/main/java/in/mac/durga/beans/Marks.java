package in.mac.durga.beans;

/**
 * 
 * @author mahesh 14-Apr-2019 Inject m1,m2,m3,m4 automatically while creating
 *         Marks object using Constructor Injection.
 *
 */
public class Marks {
	private int m1;
	private int m2;
	private int m3;
	private int m4;

	public Marks() {
		System.out.println("Marks :: 0 Param Constructor.");
	}

	public Marks(int m1, int m2, int m3, int m4) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}

	@Override
	public String toString() {
		return "Marks [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}

}
