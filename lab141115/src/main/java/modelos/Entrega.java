package modelos;

import java.io.Serializable;
import java.util.Date;

public class Entrega implements Serializable {

	int id;
	Date data_inicio;
	Date data_entrega;
	Venda venda;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}
	public Date getData_entrega() {
		return data_entrega;
	}
	public void setData_entrega(Date data_entrega) {
		this.data_entrega = data_entrega;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Entrega(){}

	public Entrega(int id, Date data_inicio, Date data_entrega, Venda venda) {
		super();
		this.id = id;
		this.data_inicio = data_inicio;
		this.data_entrega = data_entrega;
		this.venda = venda;
	}
}
