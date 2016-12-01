package br.com.cwi.crescer.aula3.dao;

import java.util.List;

/**
 * @author Carlos H. Nonnemacher
 * @param <T>
 * @param <ID>
 */
public interface IDao<T, ID> {
    
    List<T> list(String query);

    void insert(T t);
    
    void delete(T t);
}
