package br.com.ProjetoLP2.controller;

import br.com.ProjetoLP2.model.ClienteModel;
import br.com.ProjetoLP2.model.VendaModel;
import br.com.ProjetoLP2.dao.VendaDAO;
import br.com.ProjetoLP2.dao.ConexaoDAO;
import javax.swing.JTable;

public class VendaController {

    VendaDAO vendaDAO = new VendaDAO();

    public VendaController() {
    }

    public String inserirVenda(VendaModel vendaDTO, ClienteModel clienteDTO, JTable produtos) {
        try {
            if (vendaDAO.inserirVenda(vendaDTO, clienteDTO, produtos)) {
                return "Venda Cadastrada com sucesso!!!";
            } else {
                return "Venda não Cadastrada!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Venda não Cadastrada!!!";
        }
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }

}
