package br.com.specification.spec;

import org.springframework.data.jpa.domain.Specification;

import br.com.specification.model.Contabil;

public class ContabilSpecification {

	public static Specification<Contabil> codigo(Long codigo) {
		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("codigo"), codigo);
	}
	
	public static Specification<Contabil> descricao(String descricao) {
		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("descricao"), "%" + descricao.trim());
	}
	
}
