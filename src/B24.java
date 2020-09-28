
public class B24 extends Binusian {

	private String fypNumber;
	
	public B24(String name, int age, String fypNumber) {
		super(name, age);
		this.fypNumber = fypNumber;
	}

	public String getFypNumber() {
		return fypNumber;
	}

	public void setFypNumber(String fypNumber) {
		this.fypNumber = fypNumber;
	}
	
	//overriding
	public void sleep(int detik) {
		System.out.println("B24 Zzz for " + detik + " seconds");
	}

	public B24() {
		// TODO Auto-generated constructor stub
	}

}
