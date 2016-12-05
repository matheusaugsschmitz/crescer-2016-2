/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crecer.aula8.Services;

import br.com.cwi.crecer.aula8.Entities.Pessoa;
import br.com.cwi.crecer.aula8.Repositories.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author matheus.schmitz
 */
@Service
public class PessoaService {
    @Autowired
    private PessoaRepositorio pessoas;
        
    public Iterable<Pessoa> list() {
        return pessoas.findAll();
    }
    public void add(Pessoa p){
        pessoas.save(p);
    }
}
