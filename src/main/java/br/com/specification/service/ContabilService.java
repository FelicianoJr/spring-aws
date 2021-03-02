package br.com.specification.service;

import static org.springframework.data.jpa.domain.Specification.where;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.specification.model.Contabil;
import br.com.specification.repository.ContabilRepository;
import static br.com.specification.spec.ContabilSpecification.descricao;
import static br.com.specification.spec.ContabilSpecification.codigo;

@Service
public class ContabilService {

	@Autowired
	private ContabilRepository contabilRepository;

	public void vali(Long codigo, String descricao) {

		List<Contabil> contabeis = contabilRepository.findAll(
				where(
						codigo == 0L ? null : codigo(codigo))
				.and(
						descricao == null || descricao.isBlank() ? null : descricao(descricao))
				);
		
		System.out.println(contabeis);
		
	}
}
