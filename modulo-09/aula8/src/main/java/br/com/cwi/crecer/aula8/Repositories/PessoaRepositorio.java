/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crecer.aula8.Repositories;

import br.com.cwi.crecer.aula8.Entities.Pessoa;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author matheus.schmitz
 */
public interface PessoaRepositorio extends CrudRepository<Pessoa, Long>{
    
}
