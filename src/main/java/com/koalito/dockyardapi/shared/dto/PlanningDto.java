package com.koalito.dockyardapi.shared.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * A DTO for the {@link com.koalito.dockyardapi.io.entity.PlanningEntity} entity
 */
public class PlanningDto implements Serializable {
    private PlanningKeyDto id;
    private ChantierDto chantier;
    private EmployeeDto employee;
    private Double heure;

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PlanningKeyDto getId() {
        return id;
    }

    public ChantierDto getChantier() {
        return chantier;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public Double getHeure() {
        return heure;
    }

    public void setId(PlanningKeyDto id) {
        this.id = id;
    }

    public void setChantier(ChantierDto chantier) {
        this.chantier = chantier;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }

    public void setHeure(Double heure) {
        this.heure = heure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanningDto entity = (PlanningDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.chantier, entity.chantier) &&
                Objects.equals(this.employee, entity.employee) &&
                Objects.equals(this.heure, entity.heure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chantier, employee, heure);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "chantier = " + chantier + ", " +
                "employee = " + employee + ", " +
                "nbHeures = " + heure + ")";
    }

    /**
     * A DTO for the {@link com.koalito.dockyardapi.io.entity.PlanningKey} entity
     */
    public static class PlanningKeyDto implements Serializable {
        private final Long chantierId;
        private final Long employeeId;

        public PlanningKeyDto(Long chantierId, Long employeeId) {
            this.chantierId = chantierId;
            this.employeeId = employeeId;
        }

        public Long getChantierId() {
            return chantierId;
        }

        public Long getEmployeeId() {
            return employeeId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PlanningKeyDto entity = (PlanningKeyDto) o;
            return Objects.equals(this.chantierId, entity.chantierId) &&
                    Objects.equals(this.employeeId, entity.employeeId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(chantierId, employeeId);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "chantierId = " + chantierId + ", " +
                    "employeeId = " + employeeId + ")";
        }
    }
}