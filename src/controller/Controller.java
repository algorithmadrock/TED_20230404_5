/*
 RESUMO		  : Classe para a checagem dos palíndromos
 PROGRAMADORA : Luiza Felix
 DATA		  : 14/04/2023
 */

package controller;

import br.edu.fateczl.pilhas.Pilha;

public class Controller {
	String verso, reverso;
	
	public  boolean palindromo(String palavra) throws Exception {
		versoreverso(palavra);
		if (verso.equals(reverso)) {
			return true;
		} else {
			return false;
		}
	}
	private  void versoreverso(String palavra) throws Exception {
		 String[] letras = palavra.split("");
		 Pilha word = new Pilha(), drow = new Pilha();
		 int i = letras.length - 1;
		
		 for (String letra : letras) {
			drow.push(letra);
		}
		 reverso = drow.toString();
		
		while(i>=0) {
			word.push(letras[i]);
			i--;
		}
		 verso = word.toString();
	}
	
	
	
	
	

}
