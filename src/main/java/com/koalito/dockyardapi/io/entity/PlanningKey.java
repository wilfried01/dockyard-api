package com.koalito.dockyardapi.io.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PlanningKey implements Serializable {

    @Column(name = "id_chantier")
    private Long chantierId;

    @Column(name = "id_employee")
    private Long employeeId;

    public Long getChantierId() {
        return chantierId;
    }

    public void setChantierId(Long chantierId) {
        this.chantierId = chantierId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
}
