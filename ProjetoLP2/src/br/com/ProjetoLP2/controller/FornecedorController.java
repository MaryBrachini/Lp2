package br.com.ProjetoLP2.controller;

import java.sql.ResultSet;
import br.com.ProjetoLP2.model.FornecedorModel;
import br.com.ProjetoLP2.dao.FornecedorDAO;
import br.com.ProjetoLP2.dao.ConexaoDAO;

public class FornecedorController {

    FornecedorDAO fornecedorDAO = new FornecedorDAO();

    public FornecedorController() {
    }

    public String inserirFornecedor(FornecedorModel fornecedorDTO) {
        try {
            if (fornecedorDAO.inserirFornecedor(fornecedorDTO)) {
                return "Fornecedor Cadastrado com sucesso!!!";
            } else {
                return "Fornecedor não Cadastrado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fornecedor não Cadastrado!!!";
        }
    }

    public ResultSet consultarFornecedor(FornecedorModel fornecedorDTO, int opcao) {

        ResultSet rs = null;

        rs = fornecedorDAO.consultarFornecedor(fornecedorDTO, opcao);
        return rs;

    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }

    public String alterarFornecedor(FornecedorModel fornecedorDTO) {
        try {
            if (fornecedorDAO.alterarFornecedor(fornecedorDTO)) {
                return "Fornecedor alterado com sucesso!!!";
            } else {
                return "Fornecedor NAO alterado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Fornecedor não alterado!!!";
        }
    }

    public String excluirFornecedor(FornecedorModel fornecedorDTO) {
        try {
            if (fornecedorDAO.excluirFornecedor(fornecedorDTO)) {
                return "Fornecedor excluido com sucesso!!!";
            } else {
                  return "Fornecedor Não excluido!!!";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "Fornecedor Não excluido!!!";
        }
    }

}
