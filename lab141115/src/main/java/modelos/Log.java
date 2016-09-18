package modelos;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Log")
public class Log implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", updatable = false, nullable = false)
	private Long id;

	@Column(name="nomeMDB", nullable = false)
	private String nomeMDB;

	@Column(name="dataHora", nullable = false)
	private Timestamp dataHora;

	@Column(name="informacao", nullable = false)
	private String informacao;


	public Log(){}

	public Log(Long id, String nomeMDB, Timestamp dataHora, String informacao) {
		super();
		this.id = id;
		this.nomeMDB = nomeMDB;
		this.dataHora = dataHora;
		this.informacao = informacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeMDB() {
		return nomeMDB;
	}

	public void setNomeMDB(String nomeMDB) {
		this.nomeMDB = nomeMDB;
	}

	public Timestamp getDataHora() {
		return dataHora;
	}

	public void setDataHora(Timestamp dataHora) {
		this.dataHora = dataHora;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
}
