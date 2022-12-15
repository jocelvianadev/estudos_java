/*ESTE É UM PROGRAMA SIMPLE PARA TREINAR A LÓGICA DE 
  ORIENTAÇÃO A OBJETOS EM JAVA DO CURSO DO PROF NÉLIO ALVES.
  DATA: 05/11/2022
 */

package estoque;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	
	//SEÇÃO DE MÉTODOS DA CLASSE
	//============================================
	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	//============================================
	public void adicionarProdutos(int quantidade) {
		this.quantidade+= quantidade; 
	}
	//============================================
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	//============================================
	//APRESENTAR OS DADOS
	public String toString() {
		return "Dados do produto: "
				+nome +", "
				+String.format("Preço: $ %.2f, ", preco)
				+quantidade + " unidades, "
				+String.format("Total: %.2f ", valorTotalEstoque());
	}
}
