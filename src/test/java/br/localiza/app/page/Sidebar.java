package br.localiza.app.page;

import br.localiza.app.core.DriverFactory;

public class Sidebar {

	public String usuario() {

		DriverFactory.getDriver()
				.findElementByXPath("//android.widget.ImageButton[@content-desc='Open navigation drawer']").click();

		return DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")
				.getText();
	}

	public void menuCombustivel() {
		DriverFactory.getDriver()
				.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();

		DriverFactory.getDriver().findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView")
				.click();

	}
}
