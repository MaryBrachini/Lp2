package br.edu.ifsp.vtp.teste.view;

import br.edu.ifsp.vtp.teste.Pessoa;
import br.edu.ifsp.vtp.teste.Status;
import br.edu.ifsp.vtp.teste.Telefone;
import javax.swing.JOptionPane;

public class CadastroPessoaV2 {

    public static void main(String[] args) {
        Pessoa obj1 = new Pessoa();
        obj1.setId(Integer.parseInt(JOptionPane.showInputDialog("digite id:")));
        obj1.setNome(JOptionPane.showInputDialog("digite o nome:"));

        Status status = new Status();
        status.setId(Integer.parseInt(JOptionPane.showInputDialog("digite id do status:")));
        status.setDescricao(JOptionPane.showInputDialog("digite a descrição do status:"));
        obj1.setStatus(status);

        do {
            Telefone tel = new Telefone();
            tel.setId(Integer.parseInt(JOptionPane.showInputDialog("digite id do telefone:")));
            tel.setDdd(Integer.parseInt(JOptionPane.showInputDialog("digite ddd do telefone:")));
            tel.setNumero(JOptionPane.showInputDialog("digite o numero do telefone:"));
            tel.setTipo(JOptionPane.showInputDialog("digite id do telefone:"));

            obj1.adicionarTelefone(tel);
        } while (JOptionPane.showConfirmDialog(null, "deseja cadastrar outro telefone?",
                "Pessoa", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

    }
}
