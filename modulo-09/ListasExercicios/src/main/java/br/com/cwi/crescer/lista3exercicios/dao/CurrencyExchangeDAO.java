/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.lista3exercicios.dao;

import br.com.cwi.crescer.lista3exercicios.entity.CurrencyExchange;

/**
 *
 * @author matheus.schmitz
 */
public class CurrencyExchangeDAO extends AbstractDAO<CurrencyExchange, Long>{
    public CurrencyExchangeDAO(){
        super("CurrencyExchange");
    }
}
