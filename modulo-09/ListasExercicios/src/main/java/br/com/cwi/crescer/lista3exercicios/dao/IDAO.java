/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.lista3exercicios.dao;

import java.util.List;

/**
 *
 * @author matha
 * @param <T>
 * @param <ID>
 */
public interface IDAO<T, ID> {
    void insert(T t);
    void delete(T t);
    void update(T t);
    List<T> list();
}
