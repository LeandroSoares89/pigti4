package br.com.nilzaContabilidade.model;

import java.util.List;





public class ItemRN {

	private ItemDAO itemDAO = new ItemDAO();
	private List<Item> lsItens = null;
	
	
	public void insertBem(Item item){
		this.itemDAO.inserirItem(item);			
	}
	
	public List<Item> selecItens(){
	lsItens = this.itemDAO.selecItens();
		return lsItens;
		
	}
	
//getters e setters
	public ItemDAO getItemDAO() {
		return itemDAO;
	}

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
}
