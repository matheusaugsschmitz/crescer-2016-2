/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.lista3exercicios.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author matha
 */
@Entity
@Table(name = "CONTRACT", uniqueConstraints={ @UniqueConstraint ( columnNames= { "ID_CONTRACT" } ) })
public class Contract implements Serializable{
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_CONTRACT")
    @SequenceGenerator(name = "SEQ_CONTRACT", sequenceName = "SEQ_CONTRACT", allocationSize = 1) 
    @Basic(optional = false)
    @Column(name = "ID_CONTRACT")
    private Long idContract;
    
    @Basic(optional = false)
    @Column(name = "DS_DESCRIPTION")
    private String dsDescription;
    
    @Basic(optional = false)
    @Column(name = "DS_STATE")
    private String dsState;
    
    @Basic(optional = false)
    @Column(name = "DS_WEBSITE")
    private String dsWebsite;
    
    @Basic(optional = false)
    @Column(name = "NM_CONTRACT")
    private String nmContract;
    
    @ManyToOne
    private Client client;
    
    @OneToOne
    private ContractValue contractValue;

    public ContractValue getContractValue() {
        return contractValue;
    }

    public void setContractValue(ContractValue contractValue) {
        this.contractValue = contractValue;
    }

    public Long getIdContract() {
        return idContract;
    }

    public void setIdContract(Long idContract) {
        this.idContract = idContract;
    }

    public String getDsDescription() {
        return dsDescription;
    }

    public void setDsDescription(String dsDescription) {
        this.dsDescription = dsDescription;
    }

    public String getDsState() {
        return dsState;
    }

    public void setDsState(String dsState) {
        this.dsState = dsState;
    }

    public String getDsWebsite() {
        return dsWebsite;
    }

    public void setDsWebsite(String dsWebsite) {
        this.dsWebsite = dsWebsite;
    }

    public String getNmContract() {
        return nmContract;
    }

    public void setNmContract(String nmContract) {
        this.nmContract = nmContract;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
}
