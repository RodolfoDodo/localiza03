package br.localiza.app.page;

import br.localiza.app.core.DriverFactory;

public class PlacaPage {
	
	public void pesquisarPlaca(String placa) {
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtPlaca").click();
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtPlaca").sendKeys(placa);
	}
	
	public void btnBuscar() {
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/btnBuscar").click();
	}

}
