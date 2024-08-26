
package service.implementation;

import DAO.EmploymentDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Employment;
import service.EmploymentService;

/**
 *
 * @author Celia
 */
public class EmploymentServiceImpl extends UnicastRemoteObject implements EmploymentService{
    
    public EmploymentServiceImpl() throws RemoteException{
        
    }
    EmploymentDao dao = new EmploymentDao();

    @Override
    public Employment recordEmployment(Employment theEmployment) throws RemoteException {
        return dao.recordEmployment(theEmployment);
    }

    @Override
    public Employment updateEmployment(Employment theEmployment) throws RemoteException {
        return dao.updateEmployment(theEmployment);
    }

    @Override
    public Employment deleteEmployment(Employment theEmployment) throws RemoteException {
        return dao.deleteEmployment(theEmployment);
    }

    @Override
    public Employment searchEmployment(Employment theEmployment) throws RemoteException {
        return dao.searchEmployment(theEmployment);
    }

    @Override
    public List<Employment> allEmployment() throws RemoteException {
        return dao.allEmployment();
    }
    
}
