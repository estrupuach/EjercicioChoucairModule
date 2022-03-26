package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.proyectobase.model.AcademyChoucairData;
import co.com.choucair.proyectobase.questions.Answer;
import co.com.choucair.proyectobase.task.Login;
import co.com.choucair.proyectobase.task.OpenUp;
import co.com.choucair.proyectobase.task.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Camilo wants to learn automation at the academy Choucair$")
    public void thatCamiloWantsToLearnAutomationAtTheAcademyChoucair
            (List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.thePage(), (Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search for the course on the chourcair$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChourcair
            (List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia
            (List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }

}

