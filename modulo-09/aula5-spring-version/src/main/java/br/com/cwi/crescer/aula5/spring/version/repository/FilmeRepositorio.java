/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.spring.version.repository;

import br.com.cwi.crescer.aula5.spring.version.entity.Filme;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author matha
 */
public interface FilmeRepositorio  extends PagingAndSortingRepository<Filme, Long>{
    
}
