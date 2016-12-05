package br.com.cwi.crescer.aula5.filters;

import br.com.cwi.crescer.aula5.utils.UserDetails;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Carlos H. Nonnemacher
 */
@Entity
@Table(name = "USUARIO")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SQ_USUARIO")
    @SequenceGenerator(name = "SQ_USUARIO", sequenceName = "SQ_USUARIO", allocationSize = 1)
    @Column(name = "ID_USUARIO")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Basic(optional = false)
    @Column(name = "NOME")
    private String username;
    
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Basic(optional = false)
    @Column(name = "SENHA")
    private String senha;

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return senha;
    }

    public void setPassword(String password) {
        this.senha = password;
    }

    

}
