package org.java.shop;

public class Smartphone extends Prodotto {
	
	private String imei;
	private int size;

	Smartphone(String nome, String marca, float prezzo,int size) {
		super(nome, marca, prezzo);
		setImei();
		setSize(size);
	}
	
	//GETTER SETTER
	
	// IMEI PRODOTTO
	public String getImei() {
		return imei;
	}
	public void setImei() {
		this.imei = "LogicaDellImei";
	}
	
	// QUANTITA' DI MEMORIA
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " " 
				+ "IMEI PRODOTTO : " + getImei() + "|"
				+ "TAGLIO DI MEMORIA : " + getSize() + "gb.";

	}

}
