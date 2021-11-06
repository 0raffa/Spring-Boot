package br.org.generation.lojadegames.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O nome do produto é obrigatório.")
	@Size(min = 5, max = 30, message = "O nome deve conter entre 5 e 30 caracteres.")
	private String nomeProduto;
	
	@NotBlank(message = "A descrição do produto é obrigatória.")
	@Size(min = 10, max = 500, message = "A descrição deve conter entre 10 e 500 caracteres.")
	private String descricaoProduto;
	
	@NotNull(message = "O preço do produto é obrigatório.")
	private double precoProduto;
	
	@NotNull(message = "O código do produto é obrigatório.")
	private long codigoBarrasProduto;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataProduto = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private CategoriaModel categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public long getCodigoBarrasProduto() {
		return codigoBarrasProduto;
	}

	public void setCodigoBarrasProduto(long codigoBarrasProduto) {
		this.codigoBarrasProduto = codigoBarrasProduto;
	}

	public Date getDataProduto() {
		return dataProduto;
	}

	public void setDataProduto(Date dataProduto) {
		this.dataProduto = dataProduto;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
}

