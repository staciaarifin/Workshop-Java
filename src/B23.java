
public class B23 extends Binusian {

	private String nim;
	
	public B23(String name, int age, String nim) {
		super(name, age);
		this.nim = nim;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	
	//overloading
	public void sleep(int detik, String name) {
		System.out.println(name + " Zzz for " + detik + " seconds");
	}

	public B23() {
		// TODO Auto-generated constructor stub
	}

}
