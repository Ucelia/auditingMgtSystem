
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Employment;

/**
 *
 * @author Celia
 */
public interface EmploymentService extends Remote{
    Employment recordEmployment (Employment theEmployment) throws RemoteException;
    Employment updateEmployment (Employment theEmployment) throws RemoteException;
    Employment deleteEmployment (Employment theEmployment) throws RemoteException;
    Employment searchEmployment (Employment theEmployment) throws RemoteException;
    List<Employment> allEmployment () throws RemoteException;
}
