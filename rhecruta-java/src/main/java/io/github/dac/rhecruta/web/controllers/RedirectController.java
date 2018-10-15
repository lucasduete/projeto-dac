package io.github.dac.rhecruta.web.controllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class RedirectController {

    public String buscarVagas() {
        return "homeCandidato.xhtml";
    }

    public String minhasEntrevistas() {
        return "minhasEntrevistas.xhtml";
    }

    public String minhasCandidaturas() {
        return "minhasCandidaturas.xhtml";
    }

    public String candidatura() {
        return "confirmarCandidatura.xhtml";
    }

    public String meusInteresses() {
        return "meusInteresses.xhtml";
    }

    public String homeCandidato() {
        return "homeCandidato.xhtml";
    }

}