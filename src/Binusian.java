
public class Binusian {

	private String name;
	private int age;
	
	//alt + shift + S
	
	public Binusian(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void sleep(int detik) {
		System.out.println("Zzz for " + detik + " seconds");
	}

	public Binusian() {
		// TODO Auto-generated constructor stub
	}

}
