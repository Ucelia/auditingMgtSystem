
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Institution;

/**
 *
 * @author Celia
 */
public interface InstitutionService extends Remote{
    Institution recordInstitution (Institution theInstitution) throws RemoteException;
    Institution updateInstitution (Institution theInstitution) throws RemoteException;
    Institution deleteInstitution (Institution theInstitution) throws RemoteException;
    Institution searchInstitution (Institution theInstitution) throws RemoteException;
    List<Institution> allInstitution () throws RemoteException;
}
