package co.com.choucair.proyectobase.questions;

import co.com.choucair.proyectobase.userinterface.SearchCoursePAge;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String questions;
    public Answer(String questions) {
        this.questions = questions;
    }
    public static Answer toThe(String questions) {
        return new Answer(questions);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCuorse = Text.of(SearchCoursePAge.NAME_CUORSE).viewedBy(actor).asString();
        if(questions.equals(nameCuorse)){
            result = true;
        }

        else{
            result = false;
        }
        /*System.out.println(nameCuorse);
        System.out.println(questions);
        System.out.println("Como no tengo acceso al titulo de automaticacion de bancolombia \n" +
                "realizo una comparacion inversa a otro titulo de un curso diferente");*/
        return result;
    }
}