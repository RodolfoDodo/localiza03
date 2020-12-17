package br.localiza.app.page;

import java.time.Duration;

import org.openqa.selenium.Dimension;

import br.localiza.app.core.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ComprovanteAbastecimentoPage {

	public String comprovanteCombustivel() {

		return DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/tvTipoCombustivel").getText();
	}

	public String comprovanteLitros() {

		return DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/tvLitro").getText();
	}

	public String comprovanteValor() {

		return DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/tvValor").getText();
	}

	public String comprovanteValorTotal() {

		return DriverFactory.getDriver().findElementById("com.localiza.combustivelapp:id/tvValorTotal").getText();
	}

	public String comprovanteCombustivelFrio() {

		return DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]")
				.getText();
	}

	public String comprovanteLitrosFrio() {

		return DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[5]")
				.getText();
	}

	public String comprovanteValorFrio() {
		return DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[6]")
				.getText();
	}
	
	public void scrol(double inicio, double fim) {
		Dimension size = DriverFactory.getDriver().manage().window().getSize();

		int x = size.width / 2;

		int start_y = (int) (size.height * inicio);

		int end_y = (int) (size.height * fim);

		new TouchAction(DriverFactory.getDriver())

				.press(PointOption.point(x, start_y))

				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))

				.moveTo(PointOption.point(x, end_y))

				.release().perform();
	}

}
