package com.exemplo.singleton.repository;

import com.exemplo.singleton.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
