package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.WikipediaStep;

import net.thucydides.core.annotations.Steps;

public class WikipediaDefinitions {

    @Steps
    WikipediaStep wikipediaStep;


    @Given("Usuario ingresa al sitio web de wikipedia")
    public void usuarioIngresaAlSitioWebDeWikipedia() {
        wikipediaStep.abrirUrlWikipedia();
    }

    @Then("^Visualiza el label (.*)$")
    public void visualizaElLabelBienvenidosAWikipedia(String validarTexto) {
        wikipediaStep.validarTexto(validarTexto);
    }

    @When("^da clic y realiza la busqueda de la palabra (.*)$")
    public void daClicYRealizaLaBusquedaDeLaPalabraSistemas(String palabraABuscar) {
        wikipediaStep.realizarBusqueda(palabraABuscar);
    }


    @Then("^visualizando el tiluto (.*)$")
    public void visualizandoElTilutoSistemas(String tituloAvalidar) {
        wikipediaStep.validarTitulo(tituloAvalidar);
    }
}
