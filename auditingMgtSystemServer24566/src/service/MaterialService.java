
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Materials;

/**
 *
 * @author Celia
 */
public interface MaterialService extends Remote{
    Materials recordMaterial (Materials theMaterial) throws RemoteException;
    Materials updateMaterial (Materials theMaterial) throws RemoteException;
    Materials deleteMaterial (Materials theMaterial) throws RemoteException;
    Materials searchMaterial (Materials theMaterial) throws RemoteException;
    List<Materials> allMaterial () throws RemoteException;
}
