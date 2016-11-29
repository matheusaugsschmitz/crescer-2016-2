/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.lista3exercicios.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author matha
 */
@Entity
@Table(name = "COTACAO", uniqueConstraints={ @UniqueConstraint ( columnNames= { "ID_COTACAO" } ) })
public class Cotacao implements Serializable{
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_COTACAO")
    @SequenceGenerator(name = "SEQ_COTACAO", sequenceName = "SEQ_COTACAO", initialValue = 41, allocationSize = 1) 
    @Basic(optional = false)
    @Column(name = "ID_COTACAO")
    private Long idCotacao;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_DOLLAR_AUSTRALIANO")
    private Double dsCotacaoDollarAustraliano;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_DOLLAR_CANADENSE")
    private Double dsCotacaoDollarCanadense;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_EURO")
    private Double dsCotacaoEuro;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_FRANCO_SUICO")
    private Double dsCotacaoFrancoSuico;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_LIBRA")
    private Double dsCotacaoLibra;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_REAL")
    private Double dsCotacaoReal;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_YEN")
    private Double dsCotacaoYen;
    
    @Basic(optional = false)
    @Column(name = "DS_COTACAO_YUAN")
    private Double dsCotacaoYuan;
            
    @Basic(optional = false)
    @Column(name = "DT_COTACAO")
    private byte[] dtCotacao;

    public Long getIdCotacao() {
        return idCotacao;
    }

    public void setIdCotacao(Long idCotacao) {
        this.idCotacao = idCotacao;
    }

    public Double getDsCotacaoDollarAustraliano() {
        return dsCotacaoDollarAustraliano;
    }

    public void setDsCotacaoDollarAustraliano(Double dsCotacaoDollarAustraliano) {
        this.dsCotacaoDollarAustraliano = dsCotacaoDollarAustraliano;
    }

    public Double getDsCotacaoDollarCanadense() {
        return dsCotacaoDollarCanadense;
    }

    public void setDsCotacaoDollarCanadense(Double dsCotacaoDollarCanadense) {
        this.dsCotacaoDollarCanadense = dsCotacaoDollarCanadense;
    }

    public Double getDsCotacaoEuro() {
        return dsCotacaoEuro;
    }

    public void setDsCotacaoEuro(Double dsCotacaoEuro) {
        this.dsCotacaoEuro = dsCotacaoEuro;
    }

    public Double getDsCotacaoFrancoSuico() {
        return dsCotacaoFrancoSuico;
    }

    public void setDsCotacaoFrancoSuico(Double dsCotacaoFrancoSuico) {
        this.dsCotacaoFrancoSuico = dsCotacaoFrancoSuico;
    }

    public Double getDsCotacaoLibra() {
        return dsCotacaoLibra;
    }

    public void setDsCotacaoLibra(Double dsCotacaoLibra) {
        this.dsCotacaoLibra = dsCotacaoLibra;
    }

    public Double getDsCotacaoReal() {
        return dsCotacaoReal;
    }

    public void setDsCotacaoReal(Double dsCotacaoReal) {
        this.dsCotacaoReal = dsCotacaoReal;
    }

    public Double getDsCotacaoYen() {
        return dsCotacaoYen;
    }

    public void setDsCotacaoYen(Double dsCotacaoYen) {
        this.dsCotacaoYen = dsCotacaoYen;
    }

    public Double getDsCotacaoYuan() {
        return dsCotacaoYuan;
    }

    public void setDsCotacaoYuan(Double dsCotacaoYuan) {
        this.dsCotacaoYuan = dsCotacaoYuan;
    }

    public byte[] getDtCotacao() {
        return dtCotacao;
    }

    public void setDtCotacao(byte[] dtCotacao) {
        this.dtCotacao = dtCotacao;
    }
}
