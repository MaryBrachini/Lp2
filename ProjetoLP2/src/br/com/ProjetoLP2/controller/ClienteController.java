package br.com.ProjetoLP2.controller;

import java.sql.ResultSet;
import br.com.ProjetoLP2.model.ClienteModel;
import br.com.ProjetoLP2.dao.ClienteDAO;
import br.com.ProjetoLP2.dao.ConexaoDAO;

public class ClienteController {

    ClienteDAO clienteDAO = new ClienteDAO();

    public ClienteController() {
    }

    public String inserirCliente(ClienteModel clienteDTO) {
        try {
            if (clienteDAO.inserirCliente(clienteDTO)) {
                return "Cliente Cadastrado com sucesso!!!";
            } else {
                return "Cliente não Cadastrado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Cliente não Cadastrado!!!";
        }
    }

    public ResultSet consultarCliente(ClienteModel clienteDTO, int opcao) {

        ResultSet rs = null;

        rs = clienteDAO.consultarCliente(clienteDTO, opcao);
        return rs;

    }

    public void CloseDB() {
        ConexaoDAO.ConectDB();
    }

    public String alterarCliente(ClienteModel clienteDTO) {
        try {
            if (clienteDAO.alterarCliente(clienteDTO)) {
                return "Cliente alterado com sucesso!!!";
            } else {
                return "cliente Não alterado!!!";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "cliente não alterado!!!";
        }
    }
    
     public String excluirCliente(ClienteModel clienteDTO) {
        try {
            if (clienteDAO.excluirCliente(clienteDTO)) {
                return "Cliente excluido com sucesso!!!";
            } else {
                return "cliente Não excluido!!!";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "cliente não excluido!!!";
        }
    }
    
}

