package org.java.shop;

import java.util.Scanner;

public class Carrello {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vuoi inserire un nuovo prodotto? [s/n]");
		String feedback = sc.nextLine();
		
		if (feedback.toLowerCase().equals("s")) {
			
			String nomeDelProdotto;
			String marcaDelProdotto;
			float prezzoDelProdotto;
			
			System.out.println("Inserisci il nome del prodotto :");
			nomeDelProdotto = sc.nextLine();
			
			System.out.println("Inserisci la marca del prodotto :");
			marcaDelProdotto = sc.nextLine();
			
			System.out.println("inserisci il prezzo del prodotto : ");
			prezzoDelProdotto = sc.nextFloat();
			
			System.out.println("Iniziamo a creare il prodotto,che tipo di prodotto vuoi creare? digita il numero corrispondente e premi invio");
			System.out.println(""
					+ "|[1] Smartphone |"
					+ "|[2] Televisore |"
					+ "|[3] Cuffie |"
					);
			int prodottoDaCreare = sc.nextInt();
					switch (prodottoDaCreare) {
					
					case 1: {
						System.out.println("Inserisci la quantita di memoria : ");
						int memorySize = sc.nextInt();
						
						
						Smartphone s1 = new Smartphone(nomeDelProdotto, marcaDelProdotto, prezzoDelProdotto, memorySize);
						System.out.println(s1);
					break;
					}
					
					case 2: {
						int polliciTv;
						boolean smartTv;
						
						System.out.println("Quanti pollici?");
						polliciTv = sc.nextInt();
						
						// Qui mi si inchioda!!!!!!!
						System.out.println("E uno smart tv? [s/n]");
						String feedbackSmartTv = sc.nextLine();
						
						System.out.println(feedbackSmartTv);
						smartTv = feedbackSmartTv.equals("s") ?  true : false;
						
						
//						Televisore t1 = new Televisore(nomeDelProdotto, marcaDelProdotto, prezzoDelProdotto, polliciTv, smartTv);
						
	
					break;
					}
					default:
						System.out.println("Il numero digitato non corrisponde a nessun prodotto, rilancia il codice");
					}
			
		}else {
			System.out.println("Allora perchè hai lanciato il programma umano!");
		}
		
		
		sc.close();
	}
	

}