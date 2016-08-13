package modelos;

import java.util.Date;
import java.util.List;

public class Venda {
	int id;
	Date data;
	int itens;
	String descricao;
	double valor;
	List<String> lista_de_itens;

	public Date getData() {
		return data;
	}
	public List<String> getLista_de_itens() {
		return lista_de_itens;
	}
	public void setLista_de_itens(List<String> lista_de_itens) {
		this.lista_de_itens = lista_de_itens;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItens() {
		return itens;
	}
	public void setItens(int itens) {
		this.itens = itens;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public Venda(){}
	public Venda(int id, Date data, int itens, String descricao, double valor, List<String> lista_de_itens) {
		super();
		this.id = id;
		this.data = data;
		this.itens = itens;
		this.descricao = descricao;
		this.valor = valor;
		this.lista_de_itens = lista_de_itens;
	}
}
