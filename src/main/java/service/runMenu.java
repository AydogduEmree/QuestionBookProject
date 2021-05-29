package main.java.service;

import java.util.Scanner;

import main.java.model.CoktanSecmeliSinav;
import main.java.model.SoruTipiMultipleChoice;

public class runMenu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SoruBankasiServiceImpl sbs = new SoruBankasiServiceImpl();
		CoktanSecmeliSinav mCSS= new CoktanSecmeliSinav(0, null, 0, null);
		
		int choice;
		 while(true){
			 System.out.println();
			 System.out.println("Student's Menu\n");
			 System.out.print("1.) Coktan Secmeli Sinava Girelim \n");
			 System.out.print("2.) Dogru Yanlis Sinavina Girelim \n");
			 System.out.print("3.) Karisik Sorulardan Olusan Sinava Girelim \n");
			 System.out.print("4.) Exit\n");
			 choice = input.nextInt();
			 
			 switch(choice){

			    case 1:
			    	mCSS= sbs.sinavOlustur2(1);
			    	
					for( SoruTipiMultipleChoice c: mCSS.getSinavSorulari()) {
						System.out.println(c.getSoruMetni());
						System.out.print(c.getSecenekler() );
						System.out.println();
					}
					//cevap AL
					String[] cevapList= new String[mCSS.getSinavSorulari().size()];
					for(int i=0; i< cevapList.length; i++ ) {
						String answerGive = input.next();
						cevapList[i]=answerGive;
					}
				
					//cevap DEGERLENDIR
					int sinavCSSSonucum=0;
					int dogruSoruSayisi=0;
					
					for( SoruTipiMultipleChoice c: mCSS.getSinavSorulari()) {
						int j=0;
						if(c.getCevap().equalsIgnoreCase(cevapList[j])) {
							sinavCSSSonucum = sinavCSSSonucum+ c.getSoruPaun();
							dogruSoruSayisi++;
						}
						j++;
					}
						System.out.println("Sinav Sonucum : " +  sinavCSSSonucum);
						System.out.println("Dogru cevap : " + dogruSoruSayisi + " Yanlis cevap :" + ( cevapList.length -dogruSoruSayisi) );
			    		break;
			    case 2:
			    		break;
			    case 3: 
			    		break;
			    case 4: 
				    	System.out.println("Exiting Program...");
				        System.exit(0);
				         break;
			    default :
		             System.out.println("Gecersiz Menu Degeri! Duzgun bir deger giriniz:");
		             break;
			 }
		 }
	}

}
