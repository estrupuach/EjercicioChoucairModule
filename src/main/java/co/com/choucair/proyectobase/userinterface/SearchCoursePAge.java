package co.com.choucair.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePAge extends PageObject {
    public static final Target CLIC_COURSE = Target.the("link que permite acceder a el curso")
            .locatedBy("(//div[@style='background-image: " +
                    "url(\"https://operacion.choucairtesting.com/academy/" +
                    "pluginfile.php/14075/course/overviewfiles/pexels-energepiccom-2988232.jpg\");'])[1]");
    public static final Target NAME_CUORSE = Target.the("get name of course").
            locatedBy("//span[text()='Foro de Bienvenida']");

}
