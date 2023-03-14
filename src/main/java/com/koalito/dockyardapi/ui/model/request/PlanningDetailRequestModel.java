package com.koalito.dockyardapi.ui.model.request;

import java.util.Date;

public class PlanningDetailRequestModel {

    private Long chantier;
    private Long employee;
    private Double heure;

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getChantier() {
        return chantier;
    }

    public void setChantier(Long chantier) {
        this.chantier = chantier;
    }

    public Long getEmployee() {
        return employee;
    }

    public void setEmployee(Long employee) {
        this.employee = employee;
    }

    public Double getHeure() {
        return heure;
    }

    public void setHeure(Double heure) {
        this.heure = heure;
    }
}
