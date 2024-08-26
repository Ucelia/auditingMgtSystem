
package DAO;

import java.util.List;
import model.Materials;
import org.hibernate.Session;

/**
 *
 * @author Celia
 */
public class MaterialDao {
    public Materials recordMaterial(Materials theMaterial){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(theMaterial);
            ss.beginTransaction().commit();
            ss.close();
            return theMaterial;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Materials updateMaterial(Materials theMaterial){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(theMaterial);
            ss.beginTransaction().commit();
            ss.close();
            return theMaterial;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Materials deleteMaterial(Materials theMaterial){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(theMaterial);
            ss.beginTransaction().commit();
            ss.close();
            return theMaterial;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Materials searchMaterial(Materials theMaterial){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Materials stockObj = (Materials) ss.get(Materials.class, theMaterial.getId());
            ss.close();
            return stockObj;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public List<Materials> allMaterial(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Materials> theMaterial = ss.createQuery("select st from Material st").list();
            ss.close();
            return theMaterial;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
