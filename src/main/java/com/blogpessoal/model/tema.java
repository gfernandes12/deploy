package com.blogpessoal.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import antlr.collections.List;

@Entity
@Table(name ="tb_tema")
public class tema {

	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
private Long Id;	

@NotBlank(message= "A descrição é obrigatória")
@Size(min = 5 ,max = 1000, message = "O atributo texto deve  conter no mínimo 5 e no máximo 1000 caracteres")
private String descricao;


@OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE)
@JsonIgnoreProperties("tema")
private List<postagem> postagem;


public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public List<postagem> getPostagem() {
	return postagem;
}
public void setPostagem(List<postagem> postagem) {
	this.postagem = postagem;
}



}
