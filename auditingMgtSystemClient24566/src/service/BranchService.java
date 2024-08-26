
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Branch;

/**
 *
 * @author Celia
 */
public interface BranchService extends Remote{
    Branch recordBranch (Branch theBranch) throws RemoteException;
    Branch updateBranch (Branch theBranch) throws RemoteException;
    Branch deleteBranch (Branch theBranch) throws RemoteException;
    Branch searchBranch (Branch theBranch) throws RemoteException;
    List<Branch> allBranch () throws RemoteException;
}
