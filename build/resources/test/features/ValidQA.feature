# language: en
# Author: Juan Camilo Alvarez Barrios

@historias
Feature:
  El usuario desea interactuar con la pagina de wikipedia

  @escenario1
  Scenario:
    Given Usuario ingresa al sitio web de wikipedia
    Then Visualiza el label Bienvenidos a Wikipedia,

  @escenario2
  Scenario Outline:
    Given Usuario ingresa al sitio web de wikipedia
    When da clic y realiza la busqueda de la palabra <palabra>
    Then visualizando el tiluto <palabra>
    Examples:
      | palabra |
      | Sistema |
      | Sistema |
