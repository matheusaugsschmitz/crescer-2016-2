/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5exercicios.bean;

import br.com.cwi.crescer.aula5exercicios.Entity.Genero;
import br.com.cwi.crescer.aula5exercicios.dao.AbstractDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author matheus.schmitz
 */
@Stateless
public class GeneroBean extends AbstractDAO<Genero, Long>{
    @PersistenceContext(unitName = "CRESCER")
    private EntityManager entityManager;

    public GeneroBean() {
        super("Genero");
    }

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }
}
