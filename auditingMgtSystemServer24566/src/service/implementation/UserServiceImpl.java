
package service.implementation;

import DAO.UserDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import model.User;
import service.UserService;

/**
 *
 * @author Celia
 */
public class UserServiceImpl extends UnicastRemoteObject implements UserService{
    
    public UserServiceImpl() throws RemoteException{
        
    }
    
    UserDao dao = new UserDao();

    @Override
    public User userLogin(String email, String password, String roles) throws RemoteException {
        return dao.userLogin(email, password, roles);
    }

    @Override
    public User signupUser(User userObj) throws RemoteException {
        return dao.signupUser(userObj);
    }
    
}
