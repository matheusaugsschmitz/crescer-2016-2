/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5exercicios.bean;

import br.com.cwi.crescer.aula5exercicios.Entity.Elenco;
import br.com.cwi.crescer.aula5exercicios.dao.AbstractDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author matheus.schmitz
 */
@Stateless
public class ElencoBean extends AbstractDAO<Elenco, Long>{
    @PersistenceContext(unitName = "CRESCER")
    private EntityManager entityManager;

    public ElencoBean() {
        super("Elenco");
    }

    @Override
    public EntityManager getEntityManager() {
        return this.entityManager;
    }
}
