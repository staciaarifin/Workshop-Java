import java.util.Vector;

//oop -> object oriented programming
//encapsulation -> menyembunyikan data
//inheritance -> hubungan antara parent dan child (child ngambil smua punya parent)
//polymorphism -> override & overload
//override -> nama method sama, parameter sama
//overload -> namae method sama, parameter beda

//alt + shift + N
public class Main {

	Vector<Binusian> vecBinusian = new Vector<Binusian>();
	
	public Main() {
		Binusian bs1 = new Binusian("Budi", 20);
		B23 bs2 = new B23("Tini", 19, "23018124231");
		B24 bs3 = new B24("Hana", 18, "127462184");

		//ctrl + spasi
		System.out.println("Nama: " + bs1.getName());
		bs1.setName("Anton");
		System.out.println("Nama: " + bs1.getName());
		
		System.out.println("NIM: " + bs2.getNim());
		System.out.println("FYP Number: " + bs3.getFypNumber());
		System.out.println("Nama: " + bs2.getName());
		
		bs2.sleep(20, bs2.getName()); //overloading
		bs3.sleep(10); //overriding
		bs1.sleep(40);
		bs2.sleep(50);
		
		vecBinusian.add(bs1); // data ke 0
		vecBinusian.add(bs2);
		vecBinusian.add(bs3); // 1
		vecBinusian.add(new Binusian("Loki", 22)); // 2
		
		System.out.println("Nama: " + vecBinusian.elementAt(1).getName());
		
		vecBinusian.remove(1);
		
		System.out.println("Nama: " + vecBinusian.elementAt(1).getName());
		
		for (int i = 0; i < vecBinusian.size(); i++) {
			System.out.println(i+1 + ". Umur: " + vecBinusian.elementAt(i).getAge());
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
