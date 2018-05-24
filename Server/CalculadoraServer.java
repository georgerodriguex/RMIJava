import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

public class CalculadoraServer {
	CalculadoraServer(){
		try {
			System.setProperty("java.rmi.server.hostname", "127.0.0.1");
			LocateRegistry.createRegistry(1099);
			Calculadora c = new CalculadoraImple();
			Naming.bind("CalculadoraService", (Remote) c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new CalculadoraServer();
		System.out.println("Rodando o Servidor!");
	}
}
