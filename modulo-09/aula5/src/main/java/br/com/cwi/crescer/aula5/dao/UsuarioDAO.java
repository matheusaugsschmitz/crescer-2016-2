/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.dao;

import br.com.cwi.crescer.aula5.filters.User;
import java.util.List;
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
    
    public User findByEmail(String email){
       List<User> usuarios = this.getEntityManager().createQuery("select u from User u where lower(u.email) = :email").setParameter("email", email.toLowerCase()).getResultList();
       if(!usuarios.isEmpty()){
           return (User) usuarios.get(0);
       }
       return null;
       
    }
}
