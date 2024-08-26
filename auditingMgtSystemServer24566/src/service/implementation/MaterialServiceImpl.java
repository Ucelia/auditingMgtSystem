
package service.implementation;

import DAO.MaterialDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Materials;
import service.MaterialService;

/**
 *
 * @author Celia
 */
public class MaterialServiceImpl extends UnicastRemoteObject implements MaterialService{
    
    public MaterialServiceImpl() throws RemoteException{
        
    }
    MaterialDao dao = new MaterialDao();

    @Override
    public Materials recordMaterial(Materials theMaterial) throws RemoteException {
        return dao.recordMaterial(theMaterial);
    }

    @Override
    public Materials updateMaterial(Materials theMaterial) throws RemoteException {
        return dao.updateMaterial(theMaterial);
    }

    @Override
    public Materials deleteMaterial(Materials theMaterial) throws RemoteException {
        return dao.deleteMaterial(theMaterial);
    }

    @Override
    public Materials searchMaterial(Materials theMaterial) throws RemoteException {
        return dao.searchMaterial(theMaterial);
    }

    @Override
    public List<Materials> allMaterial() throws RemoteException {
        return dao.allMaterial();
    }
    
}
