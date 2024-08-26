
package DAO;

import java.util.List;
import model.Branch;
import org.hibernate.Session;

/**
 *
 * @author Celia
 */
public class BranchDao {
  public Branch recordBranch(Branch theBranch){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(theBranch);
            ss.beginTransaction().commit();
            ss.close();
            return theBranch;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Branch updateBranch(Branch theBranch){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(theBranch);
            ss.beginTransaction().commit();
            ss.close();
            return theBranch;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Branch deleteBranch(Branch theBranch){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(theBranch);
            ss.beginTransaction().commit();
            ss.close();
            return theBranch;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Branch searchBranch(Branch theBranch){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Branch branchObj = (Branch) ss.get(Branch.class, theBranch.getId());
            ss.close();
            return branchObj;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<Branch> allBranch(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Branch> theBranch = ss.createQuery("select br from Branch br").list();
            ss.close();
            return theBranch;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }  
}
