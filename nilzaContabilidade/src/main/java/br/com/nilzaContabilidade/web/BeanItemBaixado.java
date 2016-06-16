package br.com.nilzaContabilidade.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.nilzaContabilidade.model.ItemBaixado;
import br.com.nilzaContabilidade.model.ItemBaixadoRN;

@ManagedBean (name="BeanItemBaixado")
@SessionScoped
public class BeanItemBaixado implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private ItemBaixado baixado = new ItemBaixado();
	private List<ItemBaixado> lsBaixados= null;
	private ItemBaixadoRN itembaixadoRN = new ItemBaixadoRN();
	public String actionSalvar(){
	  lsBaixados = itembaixadoRN.getLsItensBaixados();
		return "listagemBaixa?facesre";
	}
	
	///getters e setters
	public ItemBaixadoRN getItembaixadoRN() {
		return itembaixadoRN;
	}
	public void setItembaixadoRN(ItemBaixadoRN itembaixadoRN) {
		this.itembaixadoRN = itembaixadoRN;
	}
	public List<ItemBaixado> getLsBaixados() {
		return lsBaixados;
	}
	public void setLsBaixados(List<ItemBaixado> lsBaixados) {
		this.lsBaixados = lsBaixados;
	}

	public ItemBaixado getBaixado() {
		return baixado;
	}

	public void setBaixado(ItemBaixado baixado) {
		this.baixado = baixado;
	}

}
