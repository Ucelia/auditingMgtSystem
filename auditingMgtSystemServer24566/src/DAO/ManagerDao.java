
package DAO;

import java.util.List;
import model.Manager;
import org.hibernate.Session;

/**
 *
 * @author Celia
 */
public class ManagerDao {
    public Manager recordManager(Manager theManager){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(theManager);
            ss.beginTransaction().commit();
            ss.close();
            return theManager;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Manager updateManager(Manager theManager){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(theManager);
            ss.beginTransaction().commit();
            ss.close();
            return theManager;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Manager deleteManager(Manager theManager){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(theManager);
            ss.beginTransaction().commit();
            ss.close();
            return theManager;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Manager searchManager(Manager theManager){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Manager managObj = (Manager) ss.get(Manager.class, theManager.getId());
            ss.close();
            return managObj;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<Manager> allManager(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Manager> theManager = ss.createQuery("select manag from Manager manag").list();
            ss.close();
            return theManager;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
