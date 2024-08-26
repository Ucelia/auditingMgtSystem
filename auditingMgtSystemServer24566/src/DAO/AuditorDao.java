
package DAO;

import java.util.List;
import model.Auditor;
import org.hibernate.Session;

/**
 *
 * @author Celia
 */
public class AuditorDao {
    public Auditor recordAuditor(Auditor theAuditor){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(theAuditor);
            ss.beginTransaction().commit();
            ss.close();
            return theAuditor;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Auditor updateAuditor(Auditor theAuditor){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(theAuditor);
            ss.beginTransaction().commit();
            ss.close();
            return theAuditor;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Auditor deleteAuditor(Auditor theAuditor){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(theAuditor);
            ss.beginTransaction().commit();
            ss.close();
            return theAuditor;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Auditor searchAuditor(Auditor theAuditor){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Auditor auditorObj = (Auditor) ss.get(Auditor.class, theAuditor.getId());
            ss.close();
            return auditorObj;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<Auditor> allAuditor(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Auditor> theAuditor = ss.createQuery("select aud from Auditor aud").list();
            ss.close();
            return theAuditor;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
