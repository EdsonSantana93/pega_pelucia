package br.com.pegapelucia.peluciabrmachine.dao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class JogadaDao {

	private String id;
	private LocalDate dataCaptura;
	private Integer quantidadeTentativa;
	private BigDecimal valorTentativa;
	private BigDecimal valorInvestido;
	private BigDecimal valorPorPelucia;
	private Double tentativaPorPelucia;
	private Integer tentativaTotal;

	public JogadaDao(String id, LocalDate dataCaptura, Integer quantidadeTentativa, BigDecimal valorTentativa,
			BigDecimal valorInvestido, BigDecimal valorPorPelucia, Double tentativaPorPelucia, Integer tentativaTotal) {
		super();
		this.id = id;
		this.dataCaptura = dataCaptura;
		this.quantidadeTentativa = quantidadeTentativa;
		this.valorTentativa = valorTentativa;
		this.valorInvestido = valorInvestido;
		this.valorPorPelucia = valorPorPelucia;
		this.tentativaPorPelucia = tentativaPorPelucia;
		this.tentativaTotal = tentativaTotal;
	}

	public JogadaDao() {
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

	public Integer getQuantidadeTentativa() {
		return quantidadeTentativa;
	}

	public void setQuantidadeTentativa(Integer quantidadeTentativa) {
		this.quantidadeTentativa = quantidadeTentativa;
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

	public Double getTentativaPorPelucia() {
		return tentativaPorPelucia;
	}

	public void setTentativaPorPelucia(Double tentativaPorPelucia) {
		this.tentativaPorPelucia = tentativaPorPelucia;
	}

	public Integer getTentativaTotal() {
		return tentativaTotal;
	}

	public void setTentativaTotal(Integer tentativaTotal) {
		this.tentativaTotal = tentativaTotal;
	}

}
