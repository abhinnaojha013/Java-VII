import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client() { }

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();

            Hello stub = (Hello) registry.lookup("Hello");

            stub.printMessage();
        }
        catch (Exception exception) {
            System.out.println("Client accepted" + exception.toString());
            exception.printStackTrace();
        }

    }
}
