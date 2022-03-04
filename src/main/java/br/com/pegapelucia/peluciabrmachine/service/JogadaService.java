package br.com.pegapelucia.peluciabrmachine.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pegapelucia.peluciabrmachine.dto.JogadaDTO;
import br.com.pegapelucia.peluciabrmachine.dto.JogadaInclusaoDTO;
import br.com.pegapelucia.peluciabrmachine.entities.Jogada;
import br.com.pegapelucia.peluciabrmachine.repository.JogadaRepository;

@Service
public class JogadaService {
	@Autowired
	private JogadaRepository repository;

	@Autowired
	private ModelMapper mapper;

	public JogadaDTO salvar(JogadaInclusaoDTO jogadaDao) {

		Jogada jogada = mapper.map(jogadaDao, Jogada.class);

		jogada.setId(gerarUUID());
		jogada.setValorPorPelucia(
				calcularValorPorPelucia(jogadaDao.getQuantidadePelucia(), jogadaDao.getValorInvestido()));

		jogada.setTentativaPorPelucia(calcularTentativaPorPelucia(jogada.getValorPorPelucia(),
				jogadaDao.getValorTentativa(), jogadaDao.getQuantidadePelucia()));

		jogada.setTentativaTotal(calcularTentativaTotal(jogada.getValorInvestido(), jogada.getValorTentativa()));

		JogadaDTO jogadaDTO = mapper.map(repository.save(jogada), JogadaDTO.class);

		return jogadaDTO;
	}

	private Integer calcularTentativaTotal(BigDecimal valorInvestido, BigDecimal valorTentativa) {
		BigDecimal tentativas = valorInvestido.divide(valorTentativa, RoundingMode.HALF_UP);
		return tentativas.intValue();
	}

	private BigDecimal calcularTentativaPorPelucia(BigDecimal valorPorPelucia, BigDecimal valorTentativa,
			Integer quantidadePelucia) {
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
