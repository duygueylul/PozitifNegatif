package Temel_Kavramlar;


import java.util.Scanner;
public class PozitifNegatif {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		 System.out.print("Bir Sayı Girin:");
		 
	        double sayi = reader.nextInt();
	      
	        if (sayi < 0.0)
	            System.out.println(sayi + " Negatiftir.");
	 
	        
	        else if ( sayi > 0.0)
	            System.out.println(sayi + " Pozitiftir.");
	 
	        
	        else
	            System.out.println(sayi + "  Sıfırdır.");

	}

}
