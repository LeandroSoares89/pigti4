package br.com.nilzaContabilidade.util;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

class ConnectionFactoryTest {

	@Test
	void testOpenConnection() {
		ConnectionFactory conexao = new ConnectionFactory();
		Connection result = conexao.openConnection();
		assertNotNull(result);
	}

	@Test
	void testCloseConnection() {
		ConnectionFactory conexao = new ConnectionFactory();
		conexao.closeConnection(null, null, null);
		assertNotNull(conexao);

	}

}
