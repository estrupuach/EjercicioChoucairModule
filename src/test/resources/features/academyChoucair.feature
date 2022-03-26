#Autor: Cristian Avendaño
  @Stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the choucair Academy with the automation course

    @scenary1
    Scenario Outline:Foro de Bienvenida
      Given that Camilo wants to learn automation at the academy Choucair
        | strUser   | strPassword   |
        | <strUser> | <strPassword> |
      When he search for the course on the chourcair
        | strCourse               |
        | <strCourse> |
      Then he finds the course called resources
        | strCourse          |
        | <strCourse> |

      Examples:
        | strUser    | strPassword   | strCourse          |
        | 1035879662 | Choucair2022* | Foro de Bienvenida |