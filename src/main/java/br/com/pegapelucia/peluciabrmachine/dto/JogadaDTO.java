package br.com.pegapelucia.peluciabrmachine.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JogadaDTO {

	@JsonProperty("id")
	private String id;

	@JsonProperty("data_captura")
	private LocalDate dataCaptura;

	@JsonProperty("quantidade_pelucia")
	private Integer quantidadePelucia;

	@JsonProperty("valor_tentativa")
	private BigDecimal valorTentativa;

	@JsonProperty("valor_investido")
	private BigDecimal valorInvestido;

	@JsonProperty("valor_por_pelucia")
	private BigDecimal valorPorPelucia;

	@JsonProperty("tentativa_por_pelucia")
	private Double tentativaPorPelucia;

	@JsonProperty("tentativa_total")
	private Integer tentativaTotal;

	public JogadaDTO(String id, LocalDate dataCaptura, Integer quantidadePelucia, BigDecimal valorTentativa,
			BigDecimal valorInvestido, BigDecimal valorPorPelucia, Double tentativaPorPelucia, Integer tentativaTotal) {
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

	public JogadaDTO() {
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

	public void setQuantidadePelucia(Integer quantidadeTentativa) {
		this.quantidadePelucia = quantidadeTentativa;
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
