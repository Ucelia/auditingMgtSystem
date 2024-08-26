
package model;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Celia
 */
public class Manager implements Serializable{
    private static final long serialVersionUID = -5184102231963301986L;
    private Integer id;
    private String names;
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

    @Override
    public String toString() {
        return names;
    }
    
    
    
}
