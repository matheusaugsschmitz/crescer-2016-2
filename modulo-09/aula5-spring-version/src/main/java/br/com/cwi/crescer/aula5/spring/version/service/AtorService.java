/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.spring.version.service;

import br.com.cwi.crescer.aula5.spring.version.entity.Ator;
import br.com.cwi.crescer.aula5.spring.version.repository.AtorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author matha
 */
@Service
public class AtorService {
    @Autowired
    private AtorRepositorio atores;
        
    public Iterable<Ator> list() {
        return atores.findAll();
    }
    public void add(Ator a){
        atores.save(a);
    }

    public Ator findOne(Long id) {
        return atores.findOne(id);
    }
    
    public Page<Ator> findAll(Pageable pgbl) {
        return atores.findAll(pgbl);
    }
}
