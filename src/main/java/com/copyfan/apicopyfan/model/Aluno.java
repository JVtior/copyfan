package com.copyfan.apicopyfan.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Boolean ativo;
	@OneToOne
	
	private String matricula;
	private String cpf;
	private String curso;
	private Byte arquivo;
	
	public Aluno() {
	}
	public Aluno(String matricula, String cpf, String curso, Byte arquivo) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.curso = curso;
		this.arquivo = arquivo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Byte getArquivo() {
		return arquivo;
	}
	public void setArquivo(Byte arquivo) {
		this.arquivo = arquivo;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean aitvo) {this.ativo=ativo;}
	public Long getId(){return id;}
	public void setId(Long id) {this.id=id;}
	public void pedirArquivo() {
		
	}
	public void enviarArquivo() {
		
	}
}