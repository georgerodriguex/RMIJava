import java.rmi.Naming;

public class CalculadoraClient {
	public static void main(String[] args) {
		try {
			Calculadora c = (Calculadora) Naming.lookup("rmi://127.0.0.1:1099/CalculadoraService");
			System.out.println("Resultado :" + c.mult(10,3213));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
