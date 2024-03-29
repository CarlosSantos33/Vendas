package br.com.sistemafinanceiro.dao;


import org.junit.Test;

import br.com.SistemaFinanceiro.Dao.PessoaDAO;
import br.com.SistemaFinanceiro.Dao.UsuarioDAO;
import br.com.SistemaFinanceiro.domain.Pessoa;
import br.com.SistemaFinanceiro.domain.Usuario;

public class UsuarioDAOTest {
	@Test

	public void salvar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(1L);

		System.out.println("Pessoa Encontrada");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());

		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("q1w2e3r4");
		usuario.setTipo('A');

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);

		System.out.println("Usuário salvo com sucesso.");
	}
}
