package br.com.SistemaFinanceiro.domain;


	import javax.persistence.Column;
	import javax.persistence.Entity;


	@Entity
	public class Fornecedor extends GeneriDomain {
		@Column(length = 50, nullable = false)
		private String descricao;
		
		public String getDescricao() {
			return descricao;
		}
		
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

}
