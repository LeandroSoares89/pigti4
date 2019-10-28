package br.com.nilzaContabilidade.model;

import java.io.Serializable;
import java.util.Date;


public class Item  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer codigo;	


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	private String nome;
	
	private String categoria;
	
	private Date dataCompra;
	
	private Double valorCompra;
	
	private Integer vidaUtil;
	
	private String condicao;
	
	private Integer tempoUso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Integer getVidaUtil() {
		return vidaUtil;
	}

	public void setVidaUtil(Integer vidaUtil) {
		this.vidaUtil = vidaUtil;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public Integer getTempoUso() {
		return tempoUso;
	}

	public void setTempoUso(Integer tempoUso) {
		this.tempoUso = tempoUso;
	}

	public Integer getCodigo() {
		return codigo;
	}

}
