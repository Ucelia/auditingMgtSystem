
package model;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Celia
 */
public class Auditor implements Serializable{
    private static final long serialVersionUID = 2088446766229884661L;
    private Integer id;
    private String fullnames;
    private String Gender;
    private String birth_date;
    private String phoneNumber;
    
    private Branch branch;
    private Employment employment;
    private Set<Materials> materials;
    private Date startedDate = new Date();

    public Auditor() {
    }

    public Auditor(Integer id) {
        this.id = id;
    }

    public Auditor(Integer id, String fullnames, String Gender, String birth_date, String phoneNumber, Branch branch, Employment employment, Set<Materials> materials) {
        this.id = id;
        this.fullnames = fullnames;
        this.Gender = Gender;
        this.birth_date = birth_date;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
        this.employment = employment;
        this.materials = materials;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullnames() {
        return fullnames;
    }

    public void setFullnames(String fullnames) {
        this.fullnames = fullnames;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public Set<Materials> getMaterials() {
        return materials;
    }

    public void setMaterials(Set<Materials> materials) {
        this.materials = materials;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    @Override
    public String toString() {
        return fullnames;
    }

    
    
}
