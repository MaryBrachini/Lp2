package ativ06_09;

public class main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Fulano");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("------------------------------------");
        System.out.println(" ");

        Funcionario funcionario = new Funcionario("Fulano", 123, 10000);
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSal());
        System.out.println("Número da matricula: " + funcionario.getNumat());
        System.out.println("------------------------------------");
        System.out.println(" ");

        Prof prof = new Prof("Fulano", 10000, 123, "Doutor");
        System.out.println("Nome: " + prof.getNome());
        System.out.println("Salario: " + prof.getSal());
        System.out.println("Número da matricula: " + prof.getNumat());
        System.out.println("Titulo: " + prof.getTitulo());
        System.out.println("------------------------------------");
        System.out.println(" ");

        Aluno aluno = new Aluno("Fulano", "Vp3015", 123456);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("RA: " + aluno.getRa());
        System.out.println("Número de disciplinas: " + aluno.getNumdisc());

        //**********************EQUALS**********************HASHCODE**********************//

        Pessoa pessoa2 = new Pessoa("Beltrano");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("------------------------------------");
        System.out.println(" ");

        System.out.println("As duas pessoas são iguais? ");
        System.out.println(pessoa.getNome().equals(pessoa2.getNome()));

        System.out.println(pessoa.getNome().hashCode());
        System.out.println(pessoa2.getNome().hashCode());

    }
}
