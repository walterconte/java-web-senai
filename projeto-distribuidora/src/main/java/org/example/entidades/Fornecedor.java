package org.example.entidades;

import javax.persistence.*;

@Entity
public class Fornecedor {

    @Id //Define o Id.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o Id automaticamente.
    @Column(name = "ID_FORNECEDOR") // Nome no Database.
    private Long idFornecedor;


    @Column(name = "NOME_FORNECEDOR")
    private String nomeFornecedor;

    @Column(name = "EMAIL_FORNECEDOR")
    private String emailFornecedor;

    public Fornecedor() {


    }

    public Fornecedor(Long idFornecedor, String nomeFornecedor, String emailFornecedor) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.emailFornecedor = emailFornecedor;
    }

    // Get = Retornar/Buscar/Voltar.
    public Long getIdFornecedor() {
        return idFornecedor;
    }

    // Set = Definir/Mudar/Atualizar.
    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }


}
