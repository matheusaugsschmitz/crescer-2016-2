/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.spring.version.service;

import br.com.cwi.crescer.aula5.spring.version.entity.Genero;
import br.com.cwi.crescer.aula5.spring.version.repository.GeneroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author matha
 */
@Service
public class GeneroService {
    @Autowired
    private GeneroRepositorio generos;
        
    public Iterable<Genero> list() {
        return generos.findAll();
    }
    public void add(Genero g){
        generos.save(g);
    }

    public Genero findOne(Long id) {
        return generos.findOne(id);
    }
    
    public Page<Genero> findAll(Pageable pgbl) {
        return generos.findAll(pgbl);
    }
}
