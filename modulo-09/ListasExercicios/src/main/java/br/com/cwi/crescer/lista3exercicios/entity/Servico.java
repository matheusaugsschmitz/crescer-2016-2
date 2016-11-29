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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author matha
 */
@Entity
@Table(name = "SERVICO", uniqueConstraints={ @UniqueConstraint ( columnNames= { "ID_SERVICO" } ) })
public class Servico implements Serializable{
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_SERVICO")
    @SequenceGenerator(name = "SEQ_SERVICO", sequenceName = "SEQ_SERVICO", initialValue = 21, allocationSize = 1) 
    @Basic(optional = false)
    @Column(name = "ID_SERVICO")
    private Long idServico;
    
    @Basic(optional = false)
    @Column(name = "DS_DESCRICAO")
    private String dsDescricao;
    
    @Basic(optional = false)
    @Column(name = "DS_PERIODICIDADE")
    private String dsPeriodicidade;
    
    @Basic(optional = false)
    @Column(name = "DS_SIMBOLO_MOEDA")
    private String dsSimboloMoeda;
    
    @Basic(optional = false)
    @Column(name = "DS_SITUACAO")
    private String dsSituacao;
    
    @Basic(optional = false)
    @Column(name = "DS_WEBSITE")
    private String dsWebsite;
    
    @Basic(optional = false)
    @Column(name = "NM_SERVICO")
    private String nmServico;
    
    @Basic(optional = false)
    @Column(name = "VL_MENSAL_USD")
    private Double vlMensalUsd;
    
    @Basic(optional = false)
    @Column(name = "VL_TOTAL_SERVICO")
    private Double vlTotalServico;
    
    @ManyToOne
    private Usuario usuario;

    public Long getIdServico() {
        return idServico;
    }

    public void setIdServico(Long idServico) {
        this.idServico = idServico;
    }

    public String getDsDescricao() {
        return dsDescricao;
    }

    public void setDsDescricao(String dsDescricao) {
        this.dsDescricao = dsDescricao;
    }

    public String getDsPeriodicidade() {
        return dsPeriodicidade;
    }

    public void setDsPeriodicidade(String dsPeriodicidade) {
        this.dsPeriodicidade = dsPeriodicidade;
    }

    public String getDsSimboloMoeda() {
        return dsSimboloMoeda;
    }

    public void setDsSimboloMoeda(String dsSimboloMoeda) {
        this.dsSimboloMoeda = dsSimboloMoeda;
    }

    public String getDsSituacao() {
        return dsSituacao;
    }

    public void setDsSituacao(String dsSituacao) {
        this.dsSituacao = dsSituacao;
    }

    public String getDsWebsite() {
        return dsWebsite;
    }

    public void setDsWebsite(String dsWebsite) {
        this.dsWebsite = dsWebsite;
    }

    public String getNmServico() {
        return nmServico;
    }

    public void setNmServico(String nmServico) {
        this.nmServico = nmServico;
    }

    public Double getVlMensalUsd() {
        return vlMensalUsd;
    }

    public void setVlMensalUsd(Double vlMensalUsd) {
        this.vlMensalUsd = vlMensalUsd;
    }

    public Double getVlTotalServico() {
        return vlTotalServico;
    }

    public void setVlTotalServico(Double vlTotalServico) {
        this.vlTotalServico = vlTotalServico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
