package com.koalito.dockyardapi.io.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@Entity(name = "chantiers")
public class ChantierEntity implements Serializable {

    public static final long serialVersionUID = 64512135165L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true, length = 150)
    private String adresse;
    private Double prix;
    private Double prixh;
    private Double m2;
    private Date datedeb;
    private Date datefin;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp updated;

    @PrePersist
    private void onCreate() {
        updated = new Timestamp(System.currentTimeMillis());
    }

    private Boolean archive;

    @OneToMany(mappedBy = "chantier")
    Set<PlanningEntity> planningEntities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<PlanningEntity> getPlanningEntities() {
        return planningEntities;
    }

    public void setPlanningEntities(Set<PlanningEntity> planningEntities) {
        this.planningEntities = planningEntities;
    }

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

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }
}
