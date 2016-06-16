package br.com.nilzaContabilidade.model;

import java.util.List;

public class ItemRN {

	private ItemDAO itemDAO = new ItemDAO();
	private List<Item> lsItens= null;
	public void insertBem(Item item) {
		this.itemDAO.inserirItem(item);
	}

	public List<Item> selecItens(Item item) {	
		return this.itemDAO.selecItens();

	}

	// getters e setters
	public ItemDAO getItemDAO() {
		return itemDAO;
	}

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}

	public List<Item> getLsItens() {
		return lsItens;
	}

	public void setLsItens(List<Item> lsItens) {
		this.lsItens = lsItens;
	}
}
