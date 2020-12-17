package br.localiza.app.test;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;

import br.localiza.app.core.BaseTest;
import br.localiza.app.page.LoginPage;
import br.localiza.app.page.Sidebar;

public class LoginTest extends BaseTest {

	private LoginPage login = new LoginPage();

	private Sidebar sidebar = new Sidebar();

	@Test
	public void loginComSucesso() throws MalformedURLException {
		login.with("110508", "3487");
		Assert.assertEquals("ANDRE", sidebar.usuario());
	}
}
