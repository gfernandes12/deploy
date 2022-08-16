	package com.blogpessoal.model;

import java.time.LocalDateTime;

public class postagem {

private long id;

private String titulo;

private  String texto;

private LocalDateTime data;

private Usuario usuario;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getTexto() {
	return texto;
}

public void setTexto(String texto) {
	this.texto = texto;
}

public LocalDateTime getData() {
	return data;
}

public void setData(LocalDateTime data) {
	this.data = data;
}
public Tema getTema() {
	return tema;
}

public void setTema(Tema tema) {
	this.tema = tema;
}

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;



	



}
