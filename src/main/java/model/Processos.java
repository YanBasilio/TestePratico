package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Processos implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String requerentes;
	private String titulo;

	@Column(name="num_preocesso")
	private String numProcesso;
	
	@Column(name="num_pedido_internacional")
	private String numPedidoInternacional;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_publicacao")
	private String dataPublicacao;

	public Processos() {
		super();
	}

	public Processos(Long id, String requerentes, String titulo, String numProcesso, String numPedidoInternacional,
			String dataPublicacao) {
		super();
		this.id = id;
		this.requerentes = requerentes;
		this.titulo = titulo;
		this.numProcesso = numProcesso;
		this.numPedidoInternacional = numPedidoInternacional;
		this.dataPublicacao = dataPublicacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRequerentes() {
		return requerentes;
	}

	public void setRequerentes(String requerentes) {
		this.requerentes = requerentes;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNumProcesso() {
		return numProcesso;
	}

	public void setNumProcesso(String numProcesso) {
		this.numProcesso = numProcesso;
	}

	public String getNumPedidoInternacional() {
		return numPedidoInternacional;
	}

	public void setNumPedidoInternacional(String numPedidoInternacional) {
		this.numPedidoInternacional = numPedidoInternacional;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

}
