package br.com.pegapelucia.peluciabrmachine.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pegapelucia.peluciabrmachine.dao.JogadaInclusaoDao;
import br.com.pegapelucia.peluciabrmachine.entities.Jogada;
import br.com.pegapelucia.peluciabrmachine.repository.JogadaRepository;

@Service
public class JogadaService {
	@Autowired
	JogadaRepository repository;

	public Jogada salvar(JogadaInclusaoDao jogadaDao) {

		Jogada jogada = new Jogada();

		jogada.setId(gerarUUID());
		jogada.setDataCaptura(jogadaDao.getDataCaptura());
		jogada.setQuantidadePelucia(jogadaDao.getQuantidadePelucia());
		jogada.setValorPorPelucia(
				calcularValorPorPelucia(jogadaDao.getQuantidadePelucia(), jogadaDao.getValorInvestido()));
		jogada.setTentativaPorPelucia(
				calcularTentativaPorPelucia(jogada.getValorPorPelucia(), jogadaDao.getValorTentativa(), jogadaDao.getQuantidadePelucia()));
		jogada.setValorInvestido(jogadaDao.getValorInvestido());
		jogada.setValorTentativa(jogadaDao.getValorTentativa());
		jogada.setTentativaTotal(calcularTentativaTotal(jogada.getValorInvestido(), jogada.getValorTentativa()));

		return repository.save(jogada);
	}

	private Integer calcularTentativaTotal(BigDecimal valorInvestido, BigDecimal valorTentativa) {
		BigDecimal tentativas = valorInvestido.divide(valorTentativa, RoundingMode.HALF_UP);
		return tentativas.intValue();
	}

	private BigDecimal calcularTentativaPorPelucia(BigDecimal valorPorPelucia,BigDecimal valorTentativa, Integer quantidadePelucia) {
		if (quantidadePelucia.intValue() == 0) {
			valorTentativa = new BigDecimal(1);
		}
		return valorPorPelucia.divide(valorTentativa, RoundingMode.HALF_UP);
	}

	private BigDecimal calcularValorPorPelucia(Integer quantidadeTentativa, BigDecimal valorInvestido) {
		Integer tentativa = quantidadeTentativa == 0 ? 1 : quantidadeTentativa;
		return valorInvestido.divide(new BigDecimal(tentativa), RoundingMode.HALF_UP);
	}

	private String gerarUUID() {
		String id = UUID.randomUUID().toString();
		return id;
	}

}
