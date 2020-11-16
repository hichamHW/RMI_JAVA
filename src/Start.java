import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Start {
    public static void main(String[] args) throws Exception {
        StudentOperations studentOperations = new StudentOperations();
        Operations sub = (Operations) UnicastRemoteObject.exportObject(studentOperations,0);

        Registry registry = LocateRegistry.createRegistry(1099);

        registry.rebind("n1",sub);


        System.out.println("server.......");
    }
}
