
package service.implementation;

import DAO.BranchDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Branch;
import service.BranchService;

/**
 *
 * @author Celia
 */
public class BranchServiceImpl extends UnicastRemoteObject implements BranchService{
    
    public BranchServiceImpl() throws RemoteException{
        
    }
    BranchDao dao = new BranchDao();

    @Override
    public Branch recordBranch(Branch theBranch) throws RemoteException {
        return dao.recordBranch(theBranch);
    }

    @Override
    public Branch updateBranch(Branch theBranch) throws RemoteException {
        return dao.updateBranch(theBranch);
    }

    @Override
    public Branch deleteBranch(Branch theBranch) throws RemoteException {
        return dao.deleteBranch(theBranch);
    }

    @Override
    public Branch searchBranch(Branch theBranch) throws RemoteException {
        return dao.searchBranch(theBranch);
    }

    @Override
    public List<Branch> allBranch() throws RemoteException {
        return dao.allBranch();
    }
    
}
