/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.dao;

import br.com.cwi.crescer.aula5.filters.User;
import javax.persistence.EntityManager;

/**
 *
 * @author matha
 */
public class UsuarioDAO extends AbstractDao<User, Long> {

    final EntityManager entityManager;

    public UsuarioDAO(EntityManager entityManager) {
        super(User.class);
        this.entityManager = entityManager;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
