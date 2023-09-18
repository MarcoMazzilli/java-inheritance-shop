package org.java.shop;

public class Prodotto {
	
	private String codice;
	private String nome;
	private String marca;
	private float prezzo;
	private final static int IVA = 22; 
	
	Prodotto(String nome, String marca, float prezzo){
		
		setCodice();
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		
	}
	
	//GETTER ~ SETTER
	
	//CODICE PRODOTTO
	public String getCodice() {
		return codice;
	}
	private void setCodice() {
		this.codice = "LogicaDelCodiceProdotto";
	}

	//NOME PRODOTTO
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//MARCA
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//PREZZO
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		
		//logica per impostare il prezzo
		
		this.prezzo = prezzo;
	}
	
	//IVA
	public int getIva() {
		return IVA;
	}
	
	@Override
	public String toString() {
		
		return "Info Product: Codice : " + getCodice() + "|"
			+ "Nome : " + getNome() + "|"
			+ "Marca : " + getMarca() + "|"
			+ "Prezzo : " + getPrezzo() + "|"
			+ "IVA applicata : " + getIva()	+ "%"	
			;
	}
	
}
