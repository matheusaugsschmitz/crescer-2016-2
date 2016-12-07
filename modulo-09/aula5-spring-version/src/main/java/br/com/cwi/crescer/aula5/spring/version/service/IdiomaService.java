/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.spring.version.service;

import br.com.cwi.crescer.aula5.spring.version.entity.Idioma;
import br.com.cwi.crescer.aula5.spring.version.repository.IdiomaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author matha
 */
@Service
public class IdiomaService {
    @Autowired
    private IdiomaRepositorio idiomas;
        
    public Iterable<Idioma> list() {
        return idiomas.findAll();
    }
    public void add(Idioma i){
        idiomas.save(i);
    }

    public Idioma findOne(Long id) {
        return idiomas.findOne(id);
    }
    
    public Page<Idioma> findAll(Pageable pgbl) {
        return idiomas.findAll(pgbl);
    }
}
