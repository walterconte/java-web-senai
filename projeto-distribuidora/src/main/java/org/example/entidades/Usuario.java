package org.example.entidades;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "NOME_USUARIO")
    private String nomeUsuario;

    @Column(name = "EMAIL_USUARIO")
    private String emailUsuario;

    @Column(name = "SENHA_USUARIO")
    private String senhaUsuario;

    @Column(name = "TELEFONE_USUARIO")
    private Double telefoneUsuario;

    @Column(name = "FUNCAO_USUARIO")
    private String funcaoUsuario;

    public Usuario() {

    }

    public Usuario(Long idUsuario, String nomeUsuario, String emailUsuario, String senhaUsuario, Double telefoneUsuario, String funcaoUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.funcaoUsuario = funcaoUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public Double getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(Double telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getFuncaoUsuario() {
        return funcaoUsuario;
    }

    public void setFuncaoUsuario(String funcaoUsuario) {
        this.funcaoUsuario = funcaoUsuario;
    }
}
