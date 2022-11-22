package br.com.ProjetoLP2.controller;

import java.sql.ResultSet;
import br.com.ProjetoLP2.model.FornecedorModel;
import br.com.ProjetoLP2.model.ProdutoModel;
import br.com.ProjetoLP2.dao.ProdutoDAO;
import br.com.ProjetoLP2.dao.ConexaoDAO;

public class ProdutoController {

    ProdutoDAO produtoDAO = new ProdutoDAO();

    public ProdutoController() {
    }

    public String inserirProduto(ProdutoModel produtoDTO,FornecedorModel fornecedorDTO) {
        try {
            if (produtoDAO.inserirProduto(produtoDTO, fornecedorDTO)) {
                return "Produto Cadastrado com sucesso!!!";
            } else {
                return "Produto não Cadastrado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não Cadastrado!!!";
        }
    }
    
    public String alterarProduto(ProdutoModel produtoDTO,FornecedorModel fornecedorDTO) {
        try {
            if (produtoDAO.alterarProduto(produtoDTO, fornecedorDTO)) {
                return "Produto alterado com sucesso!!!";
            } else {
                return "Produto NAO alterado!!!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Produto não alterado!!!";
        }
    }
    
    public String excluirProduto(ProdutoModel produtoDTO) {
        try {
            if (produtoDAO.excluirProduto(produtoDTO)) {
                return "Produto excluido com sucesso!!!";
            } else {
                return "Produto Não excluido!!!";
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            return "Produto Não excluido!!!";
        }
    }

    public ResultSet consultarProduto(ProdutoModel produtoDTO, int opcao) {

        ResultSet rs = null;

        rs = produtoDAO.consultarProduto(produtoDTO, opcao);
        return rs;

    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }

}
