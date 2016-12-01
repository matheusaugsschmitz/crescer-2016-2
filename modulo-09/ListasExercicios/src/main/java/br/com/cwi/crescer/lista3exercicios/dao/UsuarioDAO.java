/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.lista3exercicios.dao;

import br.com.cwi.crescer.lista3exercicios.entity.Usuario;

/**
 *
 * @author matheus.schmitz
 */
public class UsuarioDAO extends AbstractDAO<Usuario, Long>{
    public UsuarioDAO(){
        super("Usuario");
    }
}
