package br.com.nilzaContabilidade.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

import br.com.nilzaContabilidade.util.ConnectionFactory;

public class ItemDAO extends ConnectionFactory implements InterfaceItensDAO{

	@Override
	public void inserirItem(Item item) {
		Connection conexao = null;
		PreparedStatement psInsert = null;
		String sql = "INSERT INTO patrimonio (nome, categoria, condicao, vida_util, data_compra, valor_compra, tempo_uso)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?)";

		try {
			conexao = openConnection();
			psInsert = conexao.prepareStatement(sql);
			psInsert.setString(1, item.getNome());
			psInsert.setString(2,item.getCategoria());
			psInsert.setString(3, item.getCondicao());
			psInsert.setInt(4, item.getVidaUtil());;
			psInsert.setDate(5, new Date(item.getDataCompra().getTime()));
			psInsert.setDouble(6, item.getValorCompra());
			psInsert.setInt(7, item.getTempoUso());
			psInsert.executeUpdate();
		} catch (Exception e) {
			System.err.println("----------------------");
			System.err.println("Erro no insert");
			e.printStackTrace();
		} finally {
			closeConnection(conexao, psInsert, null);
		}
		
	}

	@Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateBaixaItem(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Item> selecItens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> selectItensBaixados() {
		// TODO Auto-generated method stub
		return null;
	}

}
