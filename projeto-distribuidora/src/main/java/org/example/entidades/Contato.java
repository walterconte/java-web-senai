package org.example.entidades;

import javax.persistence.*;

@Entity
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTATO")
    private Long idContato;

    @Column(name = "EMAIL_CONTATO")
    private String emailContato;
    @Column(name = "TELEFONE_CONTATO")
    private Long telefoneContato;

    public Contato() {

    }

    public Contato(Long idContato, String emailContato, Long telefoneContato) {
        this.idContato = idContato;
        this.emailContato = emailContato;
        this.telefoneContato = telefoneContato;
    }

    public Long getIdContato() {
        return idContato;
    }

    public void setIdContato(Long idContato) {
        this.idContato = idContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public Long getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(Long telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}
