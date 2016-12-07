/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.spring.version.service;

import br.com.cwi.crescer.aula5.spring.version.entity.Filme;
import br.com.cwi.crescer.aula5.spring.version.repository.FilmeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author matha
 */
@Service
public class FilmeService {
    @Autowired
    private FilmeRepositorio filmes;
        
    public Iterable<Filme> list() {
        return filmes.findAll();
    }
    public void add(Filme f){
        filmes.save(f);
    }

    public Filme findOne(Long id) {
        return filmes.findOne(id);
    }
    
    public Page<Filme> findAll(Pageable pgbl) {
        return filmes.findAll(pgbl);
    }
}
