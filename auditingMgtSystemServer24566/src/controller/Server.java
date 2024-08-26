
package controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import service.implementation.AuditorServiceImpl;
import service.implementation.BranchServiceImpl;
import service.implementation.EmploymentServiceImpl;
import service.implementation.InstitutionServiceImpl;
import service.implementation.ManagerServiceImpl;
import service.implementation.MaterialServiceImpl;
import service.implementation.UserServiceImpl;

/**
 *
 * @author Celia
 */
public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry theRegistry = LocateRegistry.createRegistry(6000);
            theRegistry.rebind("auditor", new AuditorServiceImpl());
            theRegistry.rebind("branch", new BranchServiceImpl());
            theRegistry.rebind("employment", new EmploymentServiceImpl());
            theRegistry.rebind("institution", new InstitutionServiceImpl());
            theRegistry.rebind("manager", new ManagerServiceImpl());
            theRegistry.rebind("material", new MaterialServiceImpl());
            theRegistry.rebind("user", new UserServiceImpl());
            System.out.println("Server is running on port 6000");
            Thread.currentThread().join();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
