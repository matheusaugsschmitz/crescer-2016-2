/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5exercicios.dao;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author matha
 */
public abstract class AbstractDAO<T, ID> implements IDAO<T, ID>{

    public abstract EntityManager getEntityManager();
    private final String consulta;

    public AbstractDAO(String nomeClasse) {
        this.consulta = String.format("select t from %s t", nomeClasse);
    }
    @Override
    public void insert(T t) {
        try {
            this.getEntityManager().getTransaction().begin();
            this.getEntityManager().persist(t);
            this.getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            this.getEntityManager().getTransaction().rollback();
        }
    }

    @Override
    public void delete(T t) {
        try {
            this.getEntityManager().getTransaction().begin();
            this.getEntityManager().remove(t);
            this.getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            this.getEntityManager().getTransaction().rollback();
        }
    }

    @Override
    public void update(T t) {
        try {
            this.getEntityManager().getTransaction().begin();
            this.getEntityManager().merge(t);
            this.getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            this.getEntityManager().getTransaction().rollback();
        }
    }

    @Override
    public List<T> list() {
        return this.getEntityManager().createQuery(this.consulta).getResultList();
    }
}
