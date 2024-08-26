
package service.implementation;

import DAO.ManagerDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Manager;
import service.ManagerService;

/**
 *
 * @author Celia
 */
public class ManagerServiceImpl extends UnicastRemoteObject implements ManagerService{
    
    public ManagerServiceImpl() throws RemoteException{
        
    }
    ManagerDao dao = new ManagerDao();

    @Override
    public Manager recordManager(Manager theManager) throws RemoteException {
        return dao.recordManager(theManager);
    }

    @Override
    public Manager updateManager(Manager theManager) throws RemoteException {
        return dao.updateManager(theManager);
    }

    @Override
    public Manager deleteManager(Manager theManager) throws RemoteException {
        return dao.deleteManager(theManager);
    }

    @Override
    public Manager searchManager(Manager theManager) throws RemoteException {
        return dao.searchManager(theManager);
    }

    @Override
    public List<Manager> allManager() throws RemoteException {
        return dao.allManager();
    }
    
}
