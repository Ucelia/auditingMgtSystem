
package model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Celia
 */
@Entity
public class Manager implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private Integer id;
    @Column(name = "manager_names")
    private String names;
    @OneToOne(mappedBy = "manager")
    private Branch branch;
    private Date startedDate = new Date();

    public Manager() {
    }

    public Manager(Integer id) {
        this.id = id;
    }

    public Manager(Integer id, String names, Branch branch) {
        this.id = id;
        this.names = names;
        this.branch = branch;
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

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }
    
    
    
}
