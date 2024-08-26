
package model;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Celia
 */
public class Materials implements Serializable{
    private static final long serialVersionUID = -4151431925171382992L;
    private Integer id;
    private String names;
    private Integer quantity;
    private Set<Auditor> auditors = new HashSet<>();
    private Date startedDate = new Date();

    public Materials() {
    }

    public Materials(Integer id) {
        this.id = id;
    }

    public Materials(Integer id, String names, Integer quantity) {
        this.id = id;
        this.names = names;
        this.quantity = quantity;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<Auditor> getAuditors() {
        return auditors;
    }

    public void setAuditors(Set<Auditor> auditors) {
        this.auditors = auditors;
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
