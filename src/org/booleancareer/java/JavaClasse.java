package org.booleancareer.java;

import java.util.Scanner;

// LEZIONE 1
public class JavaClasse {
	public static void main(String[] args) {
		
//		HELLO WORD RUNNATO IN CONSOLE
	System.out.println("Hello word!");	
	
//      VARIABILI IN JAVA
  // DICHIARAZIONI DI VARIABILI
	
	// dichiaro il tipo di dato + nome = valore
	int num = 10;
	System.out.println(num);
	
//CONCATENAZIONE STRINGA + NUMERO
	String str = "hello ";
	int value = 100;
	
	System.out.println(str + value);
	
// COMUNICARE TRAMITE UN INPUT DA TASTIERA 
	Scanner sc = new Scanner(System.in);
	System.out.println("come va ?");
	String risposta = sc.nextLine();
	System.out.println(risposta);
	}
}
