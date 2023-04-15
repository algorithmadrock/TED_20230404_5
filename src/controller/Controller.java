/*
 RESUMO		  : Classe para a checagem dos palíndromos
 PROGRAMADORA : Luiza Felix
 DATA		  : 14/04/2023
 */

package controller;

import br.edu.fateczl.filas.Fila;
import br.edu.fateczl.pilhas.Pilha;

public class Controller {
	
	public static boolean palindromo(String txt) throws Exception {
		
		Pilha arvalap = new Pilha();
		Fila palavra = new Fila();
		REverse(txt, palavra, arvalap);
		
		if(palavra.toString().equals(arvalap.toString())) {
			return true;
		} else {
			return false;
		}
	}
	
	private static void REverse(String txt, Fila palavra, Pilha arvalap) throws Exception {
		int size = txt.length();
		for (int i = 0; i< size; i++) {
			char letra = txt.charAt(i);
			arvalap.push(letra);
			palavra.insert(letra);
		}
	}
	
	
	
	
	

}
