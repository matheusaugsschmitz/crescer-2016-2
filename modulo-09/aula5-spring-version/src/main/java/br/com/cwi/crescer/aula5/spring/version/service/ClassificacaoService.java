/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.spring.version.service;

import br.com.cwi.crescer.aula5.spring.version.entity.Classificacao;
import br.com.cwi.crescer.aula5.spring.version.repository.ClassificacaoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author matha
 */
@Service
public class ClassificacaoService {
    @Autowired
    private ClassificacaoRepositorio classificacoes;
        
    public Iterable<Classificacao> list() {
        return classificacoes.findAll();
    }
    public void add(Classificacao c){
        classificacoes.save(c);
    }

    public Classificacao findOne(Long id) {
        return classificacoes.findOne(id);
    }
    
    public Page<Classificacao> findAll(Pageable pgbl) {
        return classificacoes.findAll(pgbl);
    }
}
