package org.java.shop;

public class Main {
	
	public static void main(String[] args) {

		Prodotto p1 = new Prodotto("Iphone 15","Apple", 799.99f);
		System.out.println(p1);
		
		Smartphone s1 = new Smartphone("Telefono", "Samsung", 500.00f, 128);
		System.out.println(s1);

	}
	
}
