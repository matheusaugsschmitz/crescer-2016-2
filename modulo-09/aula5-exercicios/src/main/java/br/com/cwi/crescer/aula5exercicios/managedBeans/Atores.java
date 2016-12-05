/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5exercicios.managedBeans;

import br.com.cwi.crescer.aula5exercicios.Entity.Ator;
import br.com.cwi.crescer.aula5exercicios.bean.AtorBean;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author matheus.schmitz
 */
@ManagedBean
@ViewScoped
public class Atores {

    @EJB
    private AtorBean atorBean;
    
    private Ator ator;
    private List<Ator> atores;

    @PostConstruct
    public void init(){
        this.ator = new Ator();
        this.atores = atorBean.list();
    }

    public AtorBean getAtorBean() {
        return atorBean;
    }

    public void setAtorBean(AtorBean atorBean) {
        this.atorBean = atorBean;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
    
    public void adicionarAtor(){
        atorBean.insert(ator);
        this.init();
    }
}
