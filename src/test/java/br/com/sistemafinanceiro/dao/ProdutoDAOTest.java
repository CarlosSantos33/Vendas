package br.com.sistemafinanceiro.dao;

import java.math.BigDecimal;


import org.junit.Test;

import br.com.SistemaFinanceiro.Dao.FornecedorDAO;
import br.com.SistemaFinanceiro.Dao.ProdutoDAO;
import br.com.SistemaFinanceiro.domain.Fornecedor;
import br.com.SistemaFinanceiro.domain.Produto;


public class ProdutoDAOTest {
	@Test
	
	public void salvar(){
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscar(new Long("1"));
		
		Produto produto = new Produto();
		produto.setDescricao("Curso de Java");
		produto.setFornecedor(fornecedor);
		produto.setPreco(new BigDecimal("13.70"));
		produto.setQuantidade(new Short("7"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		
		System.out.println("Produto salvo com sucesso");
	}
}

