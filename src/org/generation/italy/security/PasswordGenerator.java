package org.generation.italy.security;
//IMPORTIAMO LO SCANNER PER L'INPUT
import java.util.Scanner;

public class PasswordGenerator {
	
//	Ciao Ragazzi e Ragazze,
//	esercizio di oggi è un (insicurissimo) Password Generator
//	nome del repo: java-password-generator
//	Create un nuovo progetto java chiamato java-password-generator
//	Aggiungete un package org.generation.italy.security
//	Aggiungete una classe PasswordGenerator che contiene un metodo main
//	Il programma deve fare quanto segue:
//	salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno in numero
//	generare (e stampare a video) una password  concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere -
//	Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
//	La sua password sarà Pinco-Pallo-magenta-2011
	// SECOND COMIT TEST


	public static void main(String[] args) {
		// CRIAMO LA CLASSE SCANNER DOVE ASSEGNEREMO LA POSSIBILITA' DI INSERIRE UN VALORE TRAMITE INPUT DA CONSOLE
		Scanner sc = new Scanner(System.in);
		
		// STAMPA DOMANDA
		System.out.println("come ti chiami ?");
		// RISPOSTA UTENTE
		String userName = sc.nextLine();
		
		System.out.println("come fai di cognome ?");
		String userSurName = sc.nextLine();
		
		System.out.println("il tuo colore preferito ?");
		String userColor = sc.nextLine();

		System.out.println("in che giorno sei nato ?");
		int birthdayDay = sc.nextInt();
		
		System.out.println("in che mese sei nato ?");
		int birthdayMouth = sc.nextInt();
		
		System.out.println("in che anno sei nato ?");
		int birthdayYear = sc.nextInt();
		
		int birthdaySum = birthdayDay + birthdayMouth + birthdayYear;
		
		System.out.println("Benvenuto "+ userName + " " + userSurName);
		System.out.println("la tua nuova password è: " + userName + "-" + userSurName + "-" + userColor + "-" + birthdaySum + "-");
		
		
		
		
	}
}
