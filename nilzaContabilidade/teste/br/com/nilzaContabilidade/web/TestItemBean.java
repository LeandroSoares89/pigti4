package br.com.nilzaContabilidade.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestItemBean {
//	instanciando a classe webdriver
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//			dizer onde esta o executavel do driver
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:9090/nilzaContabilidade");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testActionBaixar() {
		int teste = 5;
		assertEquals(5, teste);
	}
//
//	@Test
//	void testActionSalvarBaixar() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testActionSalvar() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testActionNovo() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testActionListar() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetLsItens() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSetLsItens() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetItem() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSetItem() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetItemRN() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSetItemRN() {
//		fail("Not yet implemented");
//	}
//
}
