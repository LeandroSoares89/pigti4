package br.com.nilzaContabilidade.model;
import java.util.List;


public class ItemBaixadoRN {
	private List<ItemBaixado> lsItensBaixados= null;
	private ItemBaixadoDAO itembaixadoDAO = new ItemBaixadoDAO();

	
	public ItemBaixadoDAO getItembaixadoDAO() {
		
		return itembaixadoDAO;
	}

	public void setItembaixadoDAO(ItemBaixadoDAO itembaixadoDAO) {
		this.itembaixadoDAO = itembaixadoDAO;
	}

	public List<ItemBaixado> getLsItensBaixados() {
		lsItensBaixados = itembaixadoDAO.selecItens();
		return lsItensBaixados;
	}

	public void setLsItensBaixados(List<ItemBaixado> lsItensBaixados) {
		this.lsItensBaixados = lsItensBaixados;
	}

	
}