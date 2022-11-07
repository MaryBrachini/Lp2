
package br.edu.ifsp.vtp.teste.newpack;
import javax.swing.JOptionPane;


public class TesteMensagem extends JOptionPane{
    public static void msg(String texto){
        showMessageDialog(null, texto,
                "Sistema de Cadastro", ERROR_MESSAGE);
    }
}
