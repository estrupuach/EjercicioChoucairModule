package co.com.choucair.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that " +
            "shows us the form to longin").locatedBy("(//a[@data-target='#Ingresar'])[1]");

    public static final Target INPUT_USER = Target.the("input for write username").located(
            By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("input for write password").located(
            By.id("password"));
    public static final Target INTRO_BUTTON = Target.the("Button that" +
            " It allows sign in").locatedBy("//button[@type='submit']");
}
