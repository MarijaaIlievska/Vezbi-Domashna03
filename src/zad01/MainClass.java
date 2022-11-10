package zad01;

public class MainClass {
	public static void main(String[] args) {
		Avtomobil av = new Avtomobil("Toyota", "Corolla", "Bela", 12400, 2012, "BT-0000-AA" );
		
		av.prvMetod();
		System.out.println(av.vtorMetod());
	}
}
