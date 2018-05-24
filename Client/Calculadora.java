import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote{
	public default long add(long a, long b) throws RemoteException{
		return a + b;
	}
	public default long mult(long a, long b) throws RemoteException{
		return a * b;
	}
}
