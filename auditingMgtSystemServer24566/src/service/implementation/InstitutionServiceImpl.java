
package service.implementation;

import DAO.InstitutionDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Institution;
import service.InstitutionService;

/**
 *
 * @author Celia
 */
public class InstitutionServiceImpl extends UnicastRemoteObject implements InstitutionService{
    
    public InstitutionServiceImpl() throws RemoteException{
        
    }
    InstitutionDao dao = new InstitutionDao();

    @Override
    public Institution recordInstitution(Institution theInstitution) throws RemoteException {
        return dao.recordInstitution(theInstitution);
    }

    @Override
    public Institution updateInstitution(Institution theInstitution) throws RemoteException {
        return dao.updateInstitution(theInstitution);
    }

    @Override
    public Institution deleteInstitution(Institution theInstitution) throws RemoteException {
        return dao.deleteInstitution(theInstitution);
    }

    @Override
    public Institution searchInstitution(Institution theInstitution) throws RemoteException {
        return dao.searchInstitution(theInstitution);
    }

    @Override
    public List<Institution> allInstitution() throws RemoteException {
        return dao.allInstitution();
    }
    
}
