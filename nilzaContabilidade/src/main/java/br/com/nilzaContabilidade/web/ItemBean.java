package br.com.nilzaContabilidade.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.nilzaContabilidade.model.Item;
import br.com.nilzaContabilidade.model.ItemRN;

@ManagedBean(name = "ItemBean")
@SessionScoped
public class ItemBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Item item = new Item();
	private List<Item> lsItens = null;
	private ItemRN itemRN = new ItemRN();
	
 public String actionBaixar(){
	 
	return "form_baixa?faces-redirect=true";
	 
 }
 public String actionSalvarBaixar(){
	 
		return "listagemBaixa?faces-redirect=true";
		 
	 }
	public String actionSalvar() {
		itemRN.insertBem(item);
		return "index?faces-redirect=true";
	}

	public String actionNovo() {
		this.item = new Item();
		return "index?faces-redirect=true";
	}

	public String actionListar() {

		lsItens = itemRN.selecItens(item);
		return "listagemDeBens?faces-redirect=true";
	}

	// getters e Setters

	public List<Item> getLsItens() {
		return lsItens;
	}

	public void setLsItens(List<Item> lsItens) {
		this.lsItens = lsItens;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ItemRN getItemRN() {
		return itemRN;
	}

	public void setItemRN(ItemRN itemRN) {
		this.itemRN = itemRN;
	}



	

}
