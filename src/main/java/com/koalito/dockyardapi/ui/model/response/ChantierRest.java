package com.koalito.dockyardapi.ui.model.response;

import java.sql.Timestamp;
import java.util.Date;

public class ChantierRest {
    private String adresse;
    private Double prix;
    private Double prixh;
    private Double m2;
    private Date datedeb;
    private Date datefin;
    private Boolean archive;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Double getPrixh() {
        return prixh;
    }

    public void setPrixh(Double prixh) {
        this.prixh = prixh;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    public Date getDatedeb() {
        return datedeb;
    }

    public void setDatedeb(Date datedeb) {
        this.datedeb = datedeb;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }
}
