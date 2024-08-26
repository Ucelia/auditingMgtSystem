
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Auditor;

/**
 *
 * @author Celia
 */
public interface AuditorService extends Remote{
    Auditor recordAuditor (Auditor theAuditor) throws RemoteException;
    Auditor updateAuditor (Auditor theAuditor) throws RemoteException;
    Auditor deleteAuditor (Auditor theAuditor) throws RemoteException;
    Auditor searchAuditor (Auditor theAuditor) throws RemoteException;
    List<Auditor> allAuditor () throws RemoteException;
    
}
