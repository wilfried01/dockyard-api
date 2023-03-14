package com.koalito.dockyardapi.ui.model.response;

import java.util.Date;

public class PlanningRest {

    private String chantier;
    private String employee;
    private Double heure;

    private Date Date;

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getChantier() {
        return chantier;
    }

    public void setChantier(String chantier) {
        this.chantier = chantier;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Double getHeure() {
        return heure;
    }

    public void setHeure(Double heure) {
        this.heure = heure;
    }
}
