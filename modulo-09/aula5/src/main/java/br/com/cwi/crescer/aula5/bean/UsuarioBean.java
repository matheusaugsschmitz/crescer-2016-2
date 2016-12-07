/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.bean;

import br.com.cwi.crescer.aula5.dao.UsuarioDAO;
import br.com.cwi.crescer.aula5.filters.User;
import javax.ejb.Stateless;

/**
 *
 * @author matha
 */
@Stateless
public class UsuarioBean extends AbstractBean<User, Long, UsuarioDAO> {

    private UsuarioDAO dao;

    @Override
    public UsuarioDAO getDao() {
        if (dao == null) {
            dao = new UsuarioDAO(this.getEntityManager());
        }
        return dao;
    }
    
    public User findByEmail(String email) {
        return dao.findByEmail(email);
    }
    
}
