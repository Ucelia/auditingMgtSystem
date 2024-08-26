
package DAO;

import java.util.List;
import model.Institution;
import org.hibernate.Session;

/**
 *
 * @author Celia
 */
public class InstitutionDao {
    public Institution recordInstitution(Institution theInstitution){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(theInstitution);
            ss.beginTransaction().commit();
            ss.close();
            return theInstitution;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Institution updateInstitution(Institution theInstitution){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(theInstitution);
            ss.beginTransaction().commit();
            ss.close();
            return theInstitution;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Institution deleteInstitution(Institution theInstitution){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(theInstitution);
            ss.beginTransaction().commit();
            ss.close();
            return theInstitution;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Institution searchInstitution(Institution theInstitution){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Institution instObj = (Institution) ss.get(Institution.class, theInstitution.getId());
            ss.close();
            return instObj;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<Institution> allInstitution(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Institution> theInstitution = ss.createQuery("select inst from Institution inst").list();
            ss.close();
            return theInstitution;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
