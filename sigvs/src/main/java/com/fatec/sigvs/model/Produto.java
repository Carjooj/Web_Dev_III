package com.fatec.sigvs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/**
 * 
 * @author Carjooj
 *
 */
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descricao;
	private String categoria;
	private double custo;
	private int quantidadeNoEstoque;

	public Produto(String descricao, String categoria, double custo, int quantidadeNoEstoque) {
		setDescricao(descricao);
		setCategoria(categoria);
		setCusto(custo);
		setQuantidadeNoEstoque(quantidadeNoEstoque);
	}

	public Produto() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao == null || descricao.isBlank()) {
			throw new IllegalArgumentException("A descrição não deve estar em branco");

		} else {
			this.descricao = descricao;
		}

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if (categoria == null || categoria.isBlank()) {
			throw new IllegalArgumentException("A categoria não deve estar em branco");
		} else {
			this.categoria = categoria;
		}
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		try {
			if (custo <= 0) {
				throw new IllegalArgumentException("O custo deve ser amior que zero");
			} else {
				this.custo = custo;
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("O custo deve ser númerico maior que zero");
		}
	}

	public int getQuantidadeNoEstoque() {
		return quantidadeNoEstoque;
	}

	public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
		try {
			if (quantidadeNoEstoque <= 0) {
				throw new IllegalArgumentException("A quantidade deve ser amior que zero");
			} else {
				this.quantidadeNoEstoque = quantidadeNoEstoque;
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("A quantidade deve ser númerico maior que zero");
		}
	}

}
