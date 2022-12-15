package exercicio2;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void incrementarSalario(double porcentagem) {
		salarioBruto += (salarioBruto * porcentagem) / 100;
		System.out.printf("Salário atualizado: %.2f%n",salarioLiquido());
	}
	
	public String toString() {
		return nome + ", " + "$ " +  salarioLiquido();
	}
}
