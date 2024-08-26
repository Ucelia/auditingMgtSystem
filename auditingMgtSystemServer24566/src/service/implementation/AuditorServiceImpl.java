
package service.implementation;

import DAO.AuditorDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Auditor;
import service.AuditorService;

/**
 *
 * @author Celia
 */
public class AuditorServiceImpl extends UnicastRemoteObject implements AuditorService{
    
    public AuditorServiceImpl() throws RemoteException{
        
    }
    AuditorDao dao = new AuditorDao();

    @Override
    public Auditor recordAuditor(Auditor theAuditor) throws RemoteException {
        return dao.recordAuditor(theAuditor);
    }

    @Override
    public Auditor updateAuditor(Auditor theAuditor) throws RemoteException {
        return dao.updateAuditor(theAuditor);
    }

    @Override
    public Auditor deleteAuditor(Auditor theAuditor) throws RemoteException {
        return dao.deleteAuditor(theAuditor);
    }

    @Override
    public Auditor searchAuditor(Auditor theAuditor) throws RemoteException {
        return dao.searchAuditor(theAuditor);
    }

    @Override
    public List<Auditor> allAuditor() throws RemoteException {
        return dao.allAuditor();
    }
    
}
