package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@DefaultUrl("https://es.wikipedia.org/wiki/Wikipedia:Portada")
public class WikipediaPageObjects extends PageObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(WikipediaPageObjects.class);


    @FindBy(xpath = "//span[@id='Bienvenidos_a_Wikipedia,']")
    WebElementFacade wikipediaLabelValidacion;

    @FindBy(xpath = "//div[@id='simpleSearch']")
    WebElementFacade divBusqueda;

    @FindBy(xpath = "//input[@id='searchInput']")
    WebElementFacade inputBusqueda;

    @FindBy(xpath = "//input[@id='searchButton']")
    WebElementFacade inputEjecutarBusqueda;

    @FindBy(xpath = "//h1[@id='firstHeading']")
    WebElementFacade LabelValidador;


    public void realizarBusqueda(String palabraBusqueda) {
        divBusqueda.click();
        inputBusqueda.type(palabraBusqueda);
        inputEjecutarBusqueda.click();
    }


    public void verificarpalabraWikipedia(String labelText) {
        validarTexto(labelText, wikipediaLabelValidacion);
    }

    public void validarTituloBusqueda(String titulo) {
        validarTexto(titulo,LabelValidador);
    }

    public void validarTexto(String palabra, WebElementFacade webElementFacade) {

        if (webElementFacade.getText().equalsIgnoreCase(palabra)) {
            LOGGER.info("OK, SCENARIO PASSED");
        } else
            Assert.fail("YOU ARE NOT ON THE EXPECTED PAGE");

    }


}
