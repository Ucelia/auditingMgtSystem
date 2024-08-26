
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Manager;

/**
 *
 * @author Celia
 */
public interface ManagerService extends Remote{
    Manager recordManager (Manager theManager) throws RemoteException;
    Manager updateManager (Manager theManager) throws RemoteException;
    Manager deleteManager (Manager theManager) throws RemoteException;
    Manager searchManager (Manager theManager) throws RemoteException;
    List<Manager> allManager () throws RemoteException;
}
