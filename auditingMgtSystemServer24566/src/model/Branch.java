
package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Celia
 */
@Entity
public class Branch implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    private Integer id;
    @Column(name = "branch_name")
    private String names;
    @OneToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;
    @OneToMany(mappedBy = "branch")
    private List<Institution> institutions = new ArrayList<>();
    @OneToMany(mappedBy = "branch")
    private List<Auditor> auditors = new ArrayList<>();
    private Date startedDate = new Date();

    public Branch() {
    }

    public Branch(Integer id) {
        this.id = id;
    }

    public Branch(Integer id, String names, Manager manager) {
        this.id = id;
        this.names = names;
        this.manager = manager;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Institution> getInstitutions() {
        return institutions;
    }

    public void setInstitutions(List<Institution> institutions) {
        this.institutions = institutions;
    }

    public List<Auditor> getAuditors() {
        return auditors;
    }

    public void setAuditors(List<Auditor> auditors) {
        this.auditors = auditors;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }
    
    
    
}
