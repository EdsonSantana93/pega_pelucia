package br.com.pegapelucia.peluciabrmachine.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jogada {
	
	@Id
	private String id;
	
	@Column(name="data_captura", nullable=false)
	private LocalDate dataCaptura;
	
	@Column(name="quantidade_pelucia")
	private Integer quantidadePelucia;
	
	@Column(name="valor_tentativa")
	private BigDecimal valorTentativa;
	
	@Column(name="valor_investido")
	private BigDecimal valorInvestido;
	
	@Column(name="valor_por_pelucia")
	private BigDecimal valorPorPelucia;
	
	@Column(name="tentativa_por_pelucia")
	private BigDecimal tentativaPorPelucia;
	
	@Column(name="tentativa_total")
	private Integer tentativaTotal;

	public Jogada(String id, LocalDate dataCaptura, Integer quantidadePelucia,
			BigDecimal valorTentativa, BigDecimal valorInvestido, BigDecimal valorPorPelucia,
			BigDecimal tentativaPorPelucia, Integer tentativaTotal) {
		super();
		this.id = id;
		this.dataCaptura = dataCaptura;
		this.quantidadePelucia = quantidadePelucia;
		this.valorTentativa = valorTentativa;
		this.valorInvestido = valorInvestido;
		this.valorPorPelucia = valorPorPelucia;
		this.tentativaPorPelucia = tentativaPorPelucia;
		this.tentativaTotal = tentativaTotal;
	}

	public Jogada() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getDataCaptura() {
		return dataCaptura;
	}

	public void setDataCaptura(LocalDate dataCaptura) {
		this.dataCaptura = dataCaptura;
	}

	public Integer getQuantidadePelucia() {
		return quantidadePelucia;
	}

	public void setQuantidadePelucia(Integer quantidadePelucia) {
		this.quantidadePelucia = quantidadePelucia;
	}

	public BigDecimal getValorTentativa() {
		return valorTentativa;
	}

	public void setValorTentativa(BigDecimal valorTentativa) {
		this.valorTentativa = valorTentativa;
	}

	public BigDecimal getValorInvestido() {
		return valorInvestido;
	}

	public void setValorInvestido(BigDecimal valorInvestido) {
		this.valorInvestido = valorInvestido;
	}

	public BigDecimal getValorPorPelucia() {
		return valorPorPelucia;
	}

	public void setValorPorPelucia(BigDecimal valorPorPelucia) {
		this.valorPorPelucia = valorPorPelucia;
	}

	public BigDecimal getTentativaPorPelucia() {
		return tentativaPorPelucia;
	}

	public void setTentativaPorPelucia(BigDecimal tentativaPorPelucia) {
		this.tentativaPorPelucia = tentativaPorPelucia;
	}

	public Integer getTentativaTotal() {
		return tentativaTotal;
	}

	public void setTentativaTotal(Integer tentativaTotal) {
		this.tentativaTotal = tentativaTotal;
	}

}
