package conta;

public class Conta {
	private int NumConta;
	private String titular;
	private double saldo;
	
	final double TAXA_SAQUE = 5.0;
	
	
	//CONSTRUTORES
	public Conta(int numConta, String titular, double depositoInicial) {
		NumConta = numConta;
		this.titular = titular;
		depositar(depositoInicial);
	}
	
	public Conta(int numConta, String titular) {
		NumConta = numConta;
		this.titular = titular;
		
	}
	
	//GETTERS E SETTERS
	public int getNumConta() {
		return NumConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	//MÉTODOS OPERACIONAIS
	public void depositar(double quantidade) {
		saldo += quantidade;
	}
	public void sacar(double quantidade) {
		saldo -= (quantidade + TAXA_SAQUE);
	}
	
	//MÉTODO PARA MOSTRAR DOS DAODOS
	public String toString() {
		return "Número: " 
				+ NumConta
				+", Titular: "
				+ titular
				+", Saldo: R$ "
				+String.format("%.2f%n", saldo);
	}
	
}
