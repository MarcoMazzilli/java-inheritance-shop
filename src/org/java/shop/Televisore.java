package org.java.shop;

public class Televisore extends Prodotto {
	
	private int dimensioni;
	private boolean smartTv;

	Televisore(String nome, String marca, float prezzo,int dimensioni, boolean smartTv) {
		super(nome, marca, prezzo);
		
		setDimensioni(dimensioni);
		setSmartTv(smartTv);
		
	}
	
	//GETTER SETTER 
	
	//DIMENSIONI
	public int getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	//SMART-TV
	public boolean getSmartTv() {
		return smartTv;
	}
	public void setSmartTv(boolean smartTv) {
		this.smartTv = smartTv;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " "
				+ "DIMENISONI PRODOTTO : " + getDimensioni() + "| "
				+ "SmartTv : " + (getSmartTv()? "si" : "no")
				;
	}
}
