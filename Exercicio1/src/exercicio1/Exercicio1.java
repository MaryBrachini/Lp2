package exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome(JOptionPane.showInputDialog("Informe o nome do aluno"));
        int[] n = new int[3];
        double media = 0;

        for (int i = 0; 3 > i; i++) {

            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota" + (i + 1)));
            media += n[i];
        }
        aluno.setNotas(n);
        JOptionPane.showMessageDialog(null, "Nome do aluno: " + aluno.getNome()
                + "\A media é: " + (media / 3));
    }

}
