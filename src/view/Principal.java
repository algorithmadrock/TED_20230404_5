/*
 RESUMO		  : Classe de execução do palindromador
 PROGRAMADORA : Luiza Felix
 DATA		  : 14/04/2023
 */

package view;

import javax.swing.JOptionPane;
import controller.Controller;

public class Principal {

	public static void main(String[] args) throws Exception {
		int confirmacao = 0;
		Controller palindromos = new Controller();
		do {
			String palavra = JOptionPane.showInputDialog("Insira uma palavra pra desobrir se é ou não palíndromo.");
			if (palindromos.palindromo(palavra)) {
				confirmacao = JOptionPane.showConfirmDialog(null,palavra + " é palíndroma! :) \nQuer testar outra palavra?");
			} else {
				confirmacao = JOptionPane.showConfirmDialog(null,palavra + " não é palíndroma! :( \nQuer testar outra palavra?");
			}
		} while (confirmacao != 1);

	}

}
