#Autor: Juan



@Stories
Feature: Registro de usuario en la pagina Product Store


  @Scenario1
  Scenario Outline: Registro de Juan en Product Store
    Given Juan  quiere registrarse en la pagina Product Store

    When  ingrese toda la informacion requerida
    |strNombre| strPassword|
    |  <strNombre>  |<password>|

    Then  se completa el registro de manera exitosa <text>

    Examples:
      |strNombre| password|text|
      |  fajkfsdkfd5 |12345| Sign up successful.|