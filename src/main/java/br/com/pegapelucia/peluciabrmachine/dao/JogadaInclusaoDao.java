package br.com.pegapelucia.peluciabrmachine.dao;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JogadaInclusaoDao {
	@JsonProperty("data_captura")
	private LocalDate dataCaptura;
	@JsonProperty("quantidade_pelucia")
	private Integer quantidadePelucia;
	@JsonProperty("valor_tentativa")
	private BigDecimal valorTentativa;
	@JsonProperty("valor_investido")
	private BigDecimal valorInvestido;

	public JogadaInclusaoDao(LocalDate dataCaptura, Integer quantidadePelucia, BigDecimal valorTentativa,
			BigDecimal valorInvestido) {
		super();
		this.dataCaptura = dataCaptura;
		this.quantidadePelucia = quantidadePelucia;
		this.valorTentativa = valorTentativa;
		this.valorInvestido = valorInvestido;
	}

	public JogadaInclusaoDao() {
		super();
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

}
