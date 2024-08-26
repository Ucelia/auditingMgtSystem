
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.User;

/**
 *
 * @author Celia
 */
public interface UserService extends Remote{
    User userLogin (String email, String password, String roles) throws RemoteException;
    User signupUser (User userObj) throws RemoteException;
}
