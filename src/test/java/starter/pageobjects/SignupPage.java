package starter.pageobjects;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class SignupPage {
    public static final Target PAGE_TITLE = PageElement.located(By.cssSelector("h2.section-heading"));
}
