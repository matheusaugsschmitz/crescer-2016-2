/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.spring.version.service;

import br.com.cwi.crescer.aula5.spring.version.entity.Elenco;
import br.com.cwi.crescer.aula5.spring.version.repository.ElencoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author matha
 */
@Service
public class ElencoService {
    @Autowired
    private ElencoRepositorio elencos;
        
    public Iterable<Elenco> list() {
        return elencos.findAll();
    }
    public void add(Elenco e){
        elencos.save(e);
    }

    public Elenco findOne(Long id) {
        return elencos.findOne(id);
    }
    
    public Page<Elenco> findAll(Pageable pgbl) {
        return elencos.findAll(pgbl);
    }
}
