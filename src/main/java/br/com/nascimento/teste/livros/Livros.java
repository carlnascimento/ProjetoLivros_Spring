package br.com.nascimento.teste.livros;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livros {

	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	@Id
	private Long id;
	private String nome;
	private String valor;
	private String descricao;
	private String categoria;
	private String subcategoria;
	
	public Long getId() {
        return id;
	}
	public String getNome() {
		
		return nome;
	}
		
		public void setNome(String nome) {
			
			this.nome = nome;
		}
		
		public String getValor() {
		return valor;
			
		}public void  setValor(String valor) {
		
		 this.valor = valor;	
	}
		
		public String getDescricao() {
			
			return descricao;
			
		}
		public void setDescricao(String descricao) {
			
			
			this.descricao = descricao;
		}
		
		public String getCategoria() {
			return categoria;
		}
		
		public void setCategoria(String categoria) {
			
			this.categoria = categoria;
		}
		
		public String getSubcategoria() {
			
			return subcategoria;
		}
		
		public void setSubcategoria(String subcategoria) {
			
			this.subcategoria = subcategoria;
		}
	
	
	
}
