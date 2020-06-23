package br.com.sistemafinanceiro.dao;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import org.junit.Test;

import br.com.SistemaFinanceiro.Dao.ClienteDAO;
import br.com.SistemaFinanceiro.Dao.PessoaDAO;
import br.com.SistemaFinanceiro.domain.Cliente;
import br.com.SistemaFinanceiro.domain.Pessoa;



public class ClienteDAOTest {
	@Test
	
	public void salvar() throws ParseException {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);

		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("21/06/2020"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);

		System.out.println("Cliente salvo com sucesso.");
	}

}
