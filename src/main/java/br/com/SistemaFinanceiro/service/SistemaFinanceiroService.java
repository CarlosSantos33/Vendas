package br.com.SistemaFinanceiro.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

// http://localhost:8080/Financeiro/rest/financeiro
@Path("financeiro")
public class SistemaFinanceiroService {
	@GET
	public String exibir() {
		return "Cursos de Hugo Vasconcelos";
	}
}
