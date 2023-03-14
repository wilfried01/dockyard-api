package com.koalito.dockyardapi.io.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Entity(name = "employees")
public class EmployeeEntity implements Serializable {
    public static final long serialVersionUID = 345101132L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100)
    private String nom;

    @Column(nullable = false, length = 100)
    private String prenom;

    @Column(nullable = false, length = 20)
    private String telephone;

    @Column(nullable = false, length = 250)
    private String email;

    @Column(nullable = false, length = 200)
    private String adresse;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Timestamp updated;

    @PrePersist
    private void onCreate() {
        updated = new Timestamp(System.currentTimeMillis());
    }

    private Boolean archive;

    @OneToMany(mappedBy = "employee")
    Set<PlanningEntity> planningEntities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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

    public Set<PlanningEntity> getPlanningEntities() {
        return planningEntities;
    }

    public void setPlanningEntities(Set<PlanningEntity> planningEntities) {
        this.planningEntities = planningEntities;
    }
}
