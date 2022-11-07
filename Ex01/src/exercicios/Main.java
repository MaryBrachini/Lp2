package exercicios;


import java.util.Scanner;

import javax.swing.JOptionPane;

import exercicios.Aluno;

public class Main {
public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);
	do {
	
	System.out.println("Digite seu nome: ");
	String nome = entrada.nextLine();
	
	System.out.println("Digite sua Primeira Nota");
	double n1 = Double.parseDouble(entrada.nextLine());
	System.out.println("Digite sua Segunda Nota");
	double n2 = Double.parseDouble(entrada.nextLine());
	
	double mf = (n1+n2)/2;
	
	System.out.println(nome);
	System.out.println("Sua nota final é:"+ mf);
	
	if (mf>8) {
		System.out.println("Seu conceito é: A");
	} else if((mf<=8)&&(mf >= 7)) {
		System.out.println("Seu conceito é: B");
	} else if ((mf < 7 ) && (mf >=6 )){
		System.out.println("Seu conceito é: C");
	} else if ((mf <= 6) && (mf >= 5)){
		System.out.println("Seu conceito é: D");
	} else {
		System.out.println("Seu conceito é: E");
	}
	
	}while(JOptionPane.showConfirmDialog(null
			, "Deseja cadastrar mais alunos?", "Aluno", 
			JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
	
	entrada.close();
	}
}
