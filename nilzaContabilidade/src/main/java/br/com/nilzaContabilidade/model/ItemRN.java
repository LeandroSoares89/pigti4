package br.com.nilzaContabilidade.model;





public class ItemRN {

	private ItemDAO itemDAO = new ItemDAO();
	
	
	public String insertBem(Item item){
		this.itemDAO.inserirItem(item);
		
		return null;
		
	}

	public ItemDAO getItemDAO() {
		return itemDAO;
	}

	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
}
