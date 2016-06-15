package br.com.nilzaContabilidade.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.nilzaContabilidade.model.Item;
import br.com.nilzaContabilidade.model.ItemRN;

@ManagedBean (name="ItemBean")
@SessionScoped
public class ItemBean {
	private ItemRN itemRN = new ItemRN();
	private Item item = new Item();
	private List<Item> lsItens = null;

	public ItemRN getItemRN() {
		return itemRN;
	}

	public void setItemRN(ItemRN itemRN) {
		this.itemRN = itemRN;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<Item> getLsItens() {
		return lsItens;
	}

	public void setLsItens(List<Item> lsItens) {
		this.lsItens = lsItens;
	}
	
}
