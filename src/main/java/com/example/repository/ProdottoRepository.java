package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.model.Prodotto;
//@CrossOrigin
public interface ProdottoRepository extends CrudRepository<Prodotto, Integer> {
    Prodotto findByNome(String nome);
    Prodotto findByTipoprodotto(String tipoprodotto);
    Prodotto findByIdprodotto(int idProdotto);

    
    
}
