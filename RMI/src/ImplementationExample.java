import java.rmi.RemoteException;

public class ImplementationExample implements Hello {
    @Override
    public void printMessage() throws RemoteException {
        System.out.println("This is an example RMI program.");
    }
}