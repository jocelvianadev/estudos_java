package enumeracao;

import java.util.Date;

public class Pedido {
	private Integer id;
	private Date momento;
	private PedidoStatus status;
	
	//==========================================================
	//Construtor padrão vazio
	public Pedido() {
		
	}
	//==========================================================
	//Construtor padrão
	public Pedido(Integer id, Date momento, PedidoStatus status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}
	//Getters e Setters
	//==========================================================
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public PedidoStatus getStatus() {
		return status;
	}
	public void setStatus(PedidoStatus status) {
		this.status = status;
	}
	//toString()
	//==========================================================
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
	
	
	
}
