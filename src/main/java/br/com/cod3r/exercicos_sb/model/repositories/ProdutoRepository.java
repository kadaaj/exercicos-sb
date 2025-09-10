package br.com.cod3r.exercicos_sb.model.repositories;

import br.com.cod3r.exercicos_sb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
