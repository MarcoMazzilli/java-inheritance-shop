package org.java.shop;

public class Cuffie extends Prodotto{
	
	private String colore;
	private boolean wireless;

	Cuffie(String nome, String marca, float prezzo,String colore,boolean wireless) {
		super(nome, marca, prezzo);
		
		setColore(colore);
		setWireless(wireless);
	}
	
	//GETTER SETTER
	
	//COLORE
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	//WIRELESS
	public boolean getWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	//TO-STRING
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "|"
				+ "COLORE : " + getColore() + "|"
				+ "WIRELESS : " + (getWireless()?"SI":"NO")
		;
	}

}
