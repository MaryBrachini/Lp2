package secretaria;

	import java.util.Scanner;

	public class mainufhfrgygt {

	    	public static void main (String args[]) 
	    	{
	    	
	        Scanner entrada = new Scanner(System.in);
	        
	        int n = Integer.parseInt(entrada.nextLine());
	        System.out.print("Digite o números de alunos a serem cadastrados: ");
	        
	        String nome = entrada.nextLine();
	        System.out.print("Digite seu nome: ");

	        System.out.println("Digite a primeira nota: ");
	        double n1 = Double.parseDouble(entrada.nextLine());
	        
	        System.out.println("Digite a segunda nota: ");
	        double n2 = Double.parseDouble(entrada.nextLine());
	        

	        double nf = (n1 + n2) / 2;

	        System.out.println(nome);
	        System.out.println("Sua nota final é" + nf);

	        if (nf > 8) {
	            System.out.println("Seu conceito é A");
	        } else if ((nf <= 8) && (nf > 7)) {
	            System.out.println("Seu conceito é B");
	        } else if ((nf < 7) && (nf >= 6)) {
	            System.out.println("Seu conceito é C");
	        } else if ((nf < 6) && (nf <= 5)) {
	            System.out.println("Seu conceito é D");
	        } else {
	            System.out.println("Seu conceito é E");
	        }
	        
	        entrada.close();
	    }
}
