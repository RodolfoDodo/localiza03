package br.localiza.app.core;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {

	@Rule
	public TestName testName = new TestName();

	@Before
	public void iniciarAppium() throws MalformedURLException {
		DriverFactory.getDriver();

		configracaoApp();
	
	}

	public void configracaoApp() {
		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botao_configuracoes").click();

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout")
				.click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_senha").sendKeys("111");

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/btn_continuar").click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/layout_input_patrimonio").click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_patrimonio").sendKeys("teste");

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/layout_input_agencia").click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/input_agencia").sendKeys("aabhz");

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/layout_configuracoes").click();

		DriverFactory.getDriver().findElementById("com.localiza.menuapp:id/botaoSalvar").click();
	}

	@After
	public void tearDown() {
		gerarScreenShot();
		// DriverFactory.killDriver();
		DriverFactory.getDriver().resetApp();
	}

	@AfterClass
	public static void fecharClasse() {
		DriverFactory.killDriver();
	}

	public void gerarScreenShot() {

		try {
			File imagem = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshot/" + testName.getMethodName() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
