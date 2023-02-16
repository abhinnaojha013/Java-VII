import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends ImplementationExample {
    public Server() { }

    public static void main(String[] args) {
        try {
            ImplementationExample obj = new ImplementationExample();

            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.getRegistry();

            registry.bind("Hello", stub);
            System.err.println("Server Ready");
        }
        catch (Exception exception) {
            System.out.println("Server error" + exception.toString());
            exception.printStackTrace();
        }
    }
}
