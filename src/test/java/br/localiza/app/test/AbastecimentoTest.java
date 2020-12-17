package br.localiza.app.test;

import org.junit.Test;

import br.localiza.app.core.BaseTest;
import br.localiza.app.page.AbastecimentoPage;
import br.localiza.app.page.ComprovanteAbastecimentoPage;
import br.localiza.app.page.LoginPage;
import br.localiza.app.page.PlacaPage;
import br.localiza.app.page.Sidebar;
import org.junit.Assert;

public class AbastecimentoTest extends BaseTest {

	private LoginPage login = new LoginPage();

	private Sidebar sidebar = new Sidebar();

	private PlacaPage placa = new PlacaPage();

	private AbastecimentoPage abastecimento = new AbastecimentoPage();
	
	private ComprovanteAbastecimentoPage comprovante = new ComprovanteAbastecimentoPage();

	@Test
	public void abastecimentoEtanol() {
		login.with("110508", "3487");
		sidebar.menuCombustivel();
		placa.pesquisarPlaca("QQI9763");
		placa.btnBuscar();
		abastecimento.selecionarFornecedor();
		abastecimento.btnVouAbastecer();
		abastecimento.informarTanque("12,44", "87,43");
		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimento();
		
		Assert.assertEquals("Etanol", comprovante.comprovanteCombustivel());
		Assert.assertEquals("12,440 L", comprovante.comprovanteLitros());
		Assert.assertEquals("R$ 87,430", comprovante.comprovanteValor());
		Assert.assertEquals("R$ 87,430", comprovante.comprovanteValorTotal());
		abastecimento.btnVoltarAgencia();

	}
	
	@Test
	public void abastecimentoGasolina() throws InterruptedException {
		login.with("110508", "3487");
		sidebar.menuCombustivel();
		placa.pesquisarPlaca("QQI9763");
		placa.btnBuscar();
		abastecimento.selecionarFornecedor();
		abastecimento.btnVouAbastecer();
		abastecimento.combustivelGasolina();
		abastecimento.informarTanque("12,44", "87,43");
		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimento();
	
		Assert.assertEquals("Gasolina", comprovante.comprovanteCombustivel());
		Assert.assertEquals("12,440 L", comprovante.comprovanteLitros());
		Assert.assertEquals("R$ 87,430", comprovante.comprovanteValor());
		Assert.assertEquals("R$ 87,430", comprovante.comprovanteValorTotal());
		
		abastecimento.btnVoltarAgencia();
	}
	
	@Test
	public void abastecimentoFrioEtanolGasolina() throws InterruptedException {
		
		login.with("110508", "3487");
		sidebar.menuCombustivel();
		placa.pesquisarPlaca("QQI9763");
		placa.btnBuscar();

		abastecimento.selecionarFornecedor();
		abastecimento.btnVouAbastecer();

		abastecimento.informarTanque("12,44", "87,43");
		
		abastecimento.informarTanqueFrio("62,88", "23,99");
		abastecimento.partidaFrioGasolina();
		
		abastecimento.tapGasolina(162,1313);

		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimento();
		
		Assert.assertEquals("Etanol", comprovante.comprovanteCombustivel());
		Assert.assertEquals("12,440 L", comprovante.comprovanteLitros());
		Assert.assertEquals("R$ 87,430", comprovante.comprovanteValor());
		Assert.assertEquals("Gasolina", comprovante.comprovanteCombustivelFrio());
		Assert.assertEquals("62,880 L", comprovante.comprovanteLitrosFrio());
		Assert.assertEquals("R$ 23,990", comprovante.comprovanteValorFrio());
		comprovante.scrol(0.8, 0.2);
		Assert.assertEquals("R$ 111,420", comprovante.comprovanteValorTotal());
		
		abastecimento.btnVoltarAgencia();
	}
	
	@Test
	public void abastecimentoGasolinaFrioGasolina() {
		
		login.with("110508", "3487");
		sidebar.menuCombustivel();
		placa.pesquisarPlaca("QQI9763");
		placa.btnBuscar();
		abastecimento.selecionarFornecedor();
		abastecimento.btnVouAbastecer();
		abastecimento.combustivelGasolina();
		abastecimento.informarTanque("12,44", "87,43");
		
		abastecimento.informarTanqueFrio("62,88", "23,99");
		abastecimento.partidaFrioGasolina();
		
		abastecimento.tapGasolina(278,1313);

		
		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimento();
		
		Assert.assertEquals("Gasolina", comprovante.comprovanteCombustivel());
		Assert.assertEquals("75,320 L", comprovante.comprovanteLitros());
		Assert.assertEquals("R$ 111,420", comprovante.comprovanteValor());
		Assert.assertEquals("R$ 111,420", comprovante.comprovanteValorTotal());
		
		abastecimento.btnVoltarAgencia();
	}
	
	@Test
	public void abastecimentoEtanolFrioEtanol() {
		login.with("110508", "3487");
		sidebar.menuCombustivel();
		placa.pesquisarPlaca("QQI9763");
		placa.btnBuscar();
		abastecimento.selecionarFornecedor();
		abastecimento.btnVouAbastecer();
		abastecimento.informarTanque("12,44", "87,43");
		
		abastecimento.informarTanqueFrio("62,88", "23,99");
		abastecimento.partidaFrioEtanol();
		
		abastecimento.tapEtanol(164, 1124);
		
		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimento();
		
		Assert.assertEquals("Etanol", comprovante.comprovanteCombustivel());
		Assert.assertEquals("75,320 L", comprovante.comprovanteLitros());
		Assert.assertEquals("R$ 111,420", comprovante.comprovanteValor());
		Assert.assertEquals("R$ 111,420", comprovante.comprovanteValorTotal());
		
		abastecimento.btnVoltarAgencia();
	}
	
	@Test
	public void abastecimentoFrioGasolina() {
		login.with("110508", "3487");
		sidebar.menuCombustivel();
		placa.pesquisarPlaca("QQI9763");
		placa.btnBuscar();
		abastecimento.selecionarFornecedor();
		abastecimento.btnVouAbastecer();
		
		abastecimento.informarTanqueFrio("62,88", "23,99");
		abastecimento.partidaFrioGasolina();
		
		abastecimento.tapGasolina(162,1313);
		
		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimento();
		
		Assert.assertEquals("Gasolina", comprovante.comprovanteCombustivel());
		Assert.assertEquals("62,880 L", comprovante.comprovanteLitros());
		Assert.assertEquals("R$ 23,990", comprovante.comprovanteValor());
		Assert.assertEquals("R$ 23,990", comprovante.comprovanteValorTotal());
		
		abastecimento.btnVoltarAgencia();
	}
	
	@Test
	public void abastecimentoFrioEtanol() {
		login.with("110508", "3487");
		sidebar.menuCombustivel();
		placa.pesquisarPlaca("QQI9763");
		placa.btnBuscar();
		abastecimento.selecionarFornecedor();
		abastecimento.btnVouAbastecer();
		
		abastecimento.informarTanqueFrio("62,88", "23,99");
		abastecimento.partidaFrioEtanol();
		
		abastecimento.tapEtanol(164, 1124);
		
		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimento();
		
		Assert.assertEquals("Etanol", comprovante.comprovanteCombustivel());
		Assert.assertEquals("62,880 L", comprovante.comprovanteLitros());
		Assert.assertEquals("R$ 23,990", comprovante.comprovanteValor());
		Assert.assertEquals("R$ 23,990", comprovante.comprovanteValorTotal());
		
		abastecimento.btnVoltarAgencia();
	}
	
	@Test
	public void abastecimentoInternoGasolina() {
		
		login.with("110508", "3487");
		sidebar.menuCombustivel();
		placa.pesquisarPlaca("QQI9763");
		placa.btnBuscar();
		abastecimento.abastecimentoInterno();
		
		abastecimento.btnVouAbastecer();
		abastecimento.informarTanqueInterno("12,44");
		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimento();
	}
}
