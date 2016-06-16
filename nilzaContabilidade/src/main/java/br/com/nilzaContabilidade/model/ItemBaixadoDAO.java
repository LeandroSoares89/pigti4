package br.com.nilzaContabilidade.model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.nilzaContabilidade.util.ConnectionFactory;

public class ItemBaixadoDAO extends ConnectionFactory implements Serializable{

	private static final long serialVersionUID = 1L;

	public List<ItemBaixado> selecItens() {
		List<ItemBaixado> lsBaixados = null;
		Connection conexao = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT codigo, nome, categoria, condicao, vida_util, data_compra, valor_compra, tempo_uso "
				+ " FROM  patrimonio  ORDER BY codigo";

		try {
			conexao = openConnection();
			ps = conexao.prepareStatement(sql);
			rs = ps.executeQuery();
			lsBaixados = new ArrayList<ItemBaixado>();
			while (rs.next()) {
				ItemBaixado baixados = new ItemBaixado();
				baixados.setCodigo(rs.getInt("codigo"));
				baixados.setNome(rs.getString("nome"));
				baixados.setCategoria(rs.getString("categoria"));
				baixados.setCondicao(rs.getString("condicao"));
				baixados.setVidaUtil(rs.getInt("vida_util"));
				baixados.setDataCompra(rs.getDate("data_compra"));
				baixados.setValorCompra(rs.getDouble("valor_compra"));
				baixados.setTempoUso(rs.getInt("tempo_uso"));
				lsBaixados.add(baixados);
			}
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
			e.printStackTrace();
		} finally {
			closeConnection(conexao, ps, rs);
		}
		return lsBaixados;
	}

}
