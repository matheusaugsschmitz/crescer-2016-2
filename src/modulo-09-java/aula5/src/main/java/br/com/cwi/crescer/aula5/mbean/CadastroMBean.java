/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.mbean;

import br.com.cwi.crescer.aula5.bean.UsuarioBean;
import br.com.cwi.crescer.aula5.filters.User;
import br.com.cwi.crescer.aula5.dao.UsuarioDAO;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author matha
 */

@ManagedBean
@ViewScoped
public class CadastroMBean extends AbstractMBean<User, Long, UsuarioDAO, UsuarioBean> {

    @EJB
    private UsuarioBean usuarioBean;

    @PostConstruct
    public void init() {
        this.limpar();
    }
    
    @Override
    public UsuarioBean getBean() {
        return usuarioBean;
    }

    @Override
    public void limpar() {
        this.setEntity(new User());
    }
    
    public String cadastrar() {
        return "login";
    }
}
