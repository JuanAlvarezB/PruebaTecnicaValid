package steps;

import pageobjects.WikipediaPageObjects;
import net.thucydides.core.annotations.Step;


public class WikipediaStep {


    WikipediaPageObjects wikipediaPageObjects;

    @Step
    public void abrirUrlWikipedia() {
        wikipediaPageObjects.open();
    }

    @Step
    public void validarTexto(String palabra) {
        wikipediaPageObjects.verificarpalabraWikipedia(palabra);
    }

    @Step
    public void realizarBusqueda(String palabraBusqueda){
        wikipediaPageObjects.realizarBusqueda(palabraBusqueda);
    }

    @Step
    public void validarTitulo(String titulo){
        wikipediaPageObjects.validarTituloBusqueda(titulo);
    }


}




