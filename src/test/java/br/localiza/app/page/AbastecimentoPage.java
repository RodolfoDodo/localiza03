package br.localiza.app.page;

import br.localiza.app.core.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AbastecimentoPage {

	public String verificarPlaca() {

		return DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/tvTitulo").getText();
	}

	public void selecionarFornecedor() {

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtCodigoMatricula").clear();

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtCodigoMatricula")
				.sendKeys("110508");

		DriverFactory.getDriver()
				.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[1]").click();

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/headerResponsavel").click();
	}

	public void btnVouAbastecer() {
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/btnAbastecer").click();
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/botaoPositivo").click();

		// SA
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/botaoPositivo").click();
	}

	public void combustivelEtanol() {

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/text_input_end_icon").click();

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView")
				.click();

	}

	public void combustivelGasolina() {

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/dropdownTipoCombustivel").click();

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.TextView")
				.click();
	}

	public void combustivelGasolinaAditivada() {

		DriverFactory.getDriver()
				.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"]").click();

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout[3]")
				.click();
	}

	public void informarTanque(String litros, String valor) {
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtLitros").sendKeys(litros);
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtValor").sendKeys(valor);
	}

	public void informarTanqueInterno(String litros) {
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtLitros").sendKeys(litros);

	}

	public void btnConfirmarAbastecimento() {
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/btnConfirmarAbastecimento").click();
	}

	public void confirmarAbastecimento() {
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/botao_positivo").click();
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/botaoPositivo").click();
	}

	public void btnVoltarAgencia() {
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/btnEncerrar").click();

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/botaoPositivo").click();

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/botaoPositivo").click();

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/botaoPositivo").click();
	}

	public void partidaFrioGasolina() {

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/dropdownTipoCombustivelAFrio")
				.click();
	}

	public void partidaFrioEtanol() {
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/dropdownTipoCombustivelAFrio")
				.click();
	}

	public void tapGasolina(int x, int y) {

		new TouchAction<>(DriverFactory.getDriver()).tap(PointOption.point(x, y)).perform();
	}

	public void tapEtanol(int x, int y) {
		new TouchAction<>(DriverFactory.getDriver()).tap(PointOption.point(x, y)).perform();

	}

	public void informarTanqueFrio(String litros, String valor) {

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]")
				.isDisplayed();

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]")
				.click();

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout")
				.isDisplayed();
		
		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout")
				.click();

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtLitrosAFrio").isDisplayed();

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtLitrosAFrio").sendKeys(litros);

		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtValorAFrio").isDisplayed();
		
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/edtValorAFrio").sendKeys(valor);
	}

	public void abastecimentoInterno() {
		DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/swAbastecimentoInterno").click();
	}
}
