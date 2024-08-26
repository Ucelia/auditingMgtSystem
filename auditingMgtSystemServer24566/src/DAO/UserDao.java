
package DAO;

import model.User;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Celia
 */
public class UserDao {
    public User userLogin(String email, String password, String roles){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            String sqlquery ="from User where email = :email and password= :password and roles= :roles";
            Query query = ss.createQuery(sqlquery);
            query.setParameter("email", email);
            query.setParameter("password", password);
            query.setParameter("roles", roles);
            User usr = (User) query.uniqueResult();
            ss.close();
            return usr;
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
 
    } public User signupUser(User userObj){
            try {
                Session ss = HibernateUtil.getSessionFactory().openSession();
                ss.save(userObj);
                ss.beginTransaction().commit();
                ss.close();
                return userObj;
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return null;
    }
    
}
