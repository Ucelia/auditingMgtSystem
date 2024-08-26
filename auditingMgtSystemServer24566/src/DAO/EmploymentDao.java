
package DAO;

import java.util.List;
import model.Employment;
import org.hibernate.Session;

/**
 *
 * @author Celia
 */
public class EmploymentDao {
    public Employment recordEmployment(Employment theEmployment){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(theEmployment);
            ss.beginTransaction().commit();
            ss.close();
            return theEmployment;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Employment updateEmployment(Employment theEmployment){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(theEmployment);
            ss.beginTransaction().commit();
            ss.close();
            return theEmployment;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Employment deleteEmployment(Employment theEmployment){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(theEmployment);
            ss.beginTransaction().commit();
            ss.close();
            return theEmployment;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Employment searchEmployment(Employment theEmployment){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Employment empObj = (Employment) ss.get(Employment.class, theEmployment.getId());
            ss.close();
            return empObj;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<Employment> allEmployment(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Employment> theEmployment = ss.createQuery("select emp from Employment emp").list();
            ss.close();
            return theEmployment;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
