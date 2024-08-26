/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Celia
 */
@Entity
public class Employment implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employment_id")
    private Integer id;
    @OneToOne
    @JoinColumn(name = "auditor_id")
    private Auditor auditor;
    @ManyToOne
    @JoinColumn(name = "institution_id")
    private Institution institution;
    private Date startedDate = new Date();

    public Employment() {
    }

    public Employment(Integer id) {
        this.id = id;
    }

    public Employment(Integer id, Auditor auditor, Institution institution) {
        this.id = id;
        this.auditor = auditor;
        this.institution = institution;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Auditor getAuditor() {
        return auditor;
    }

    public void setAuditor(Auditor auditor) {
        this.auditor = auditor;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }
    
    
}
