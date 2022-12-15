package enumeracao;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(5487, new Date(), PedidoStatus.EMBALADO);
		
		System.out.println(pedido);
	}

}
