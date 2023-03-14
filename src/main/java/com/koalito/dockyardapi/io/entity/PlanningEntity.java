package com.koalito.dockyardapi.io.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "plannings")
public class PlanningEntity {
    @EmbeddedId
    PlanningKey id;

    @ManyToOne
    @MapsId("chantierId")
    @JoinColumn(name = "id_chantier")
    ChantierEntity chantier;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "id_employee")
    EmployeeEntity employee;

    Double heure;

    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PlanningKey getId() {
        return id;
    }

    public void setId(PlanningKey id) {
        this.id = id;
    }

    public ChantierEntity getChantier() {
        return chantier;
    }

    public void setChantier(ChantierEntity chantier) {
        this.chantier = chantier;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

    public Double getHeure() {
        return heure;
    }

    public void setHeure(Double heure) {
        this.heure = heure;
    }
}
