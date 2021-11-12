package org.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
	@NotBlank(message = "O departamento é obrigatório!")
	@Size(min = 2, max = 50, message = "O departamento deve conter entre 2 e 50 caracteres.")
	private String departamento;
	
	@NotBlank(message = "A descrição é obrigatória!")
	@Size(min = 2, max = 500, message = "A descrição deve conter entre 2 e 500 caracteres.")
	private String descricao;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
    public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
