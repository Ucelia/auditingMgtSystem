
package model;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Celia
 */
public class Institution implements Serializable{
    private static final long serialVersionUID = 9138594758443682582L;
    private Integer id;
    private String names;
    private Branch branch;
    private List<Employment> employments = new ArrayList<>();
    private Date startedDate = new Date();

    public Institution() {
    }

    public Institution(Integer id) {
        this.id = id;
    }

    public Institution(Integer id, String names, Branch branch) {
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

    public List<Employment> getEmployments() {
        return employments;
    }

    public void setEmployments(List<Employment> employments) {
        this.employments = employments;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    @Override
    public String toString() {
        return names;
    }

    
    
}
