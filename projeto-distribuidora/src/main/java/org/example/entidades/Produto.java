package org.example.entidades;

import javax.persistence.*;

@Entity
public class Produto {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "ID_PRODUTO")
 private Long idProduto;
 @ManyToOne
 @JoinColumn(name = "ID_FORNECEDOR", nullable = false)
 private Fornecedor fornecedor;

 @Column(name = "NOME_PRODUTO")
 private String nomeProduto;

 @Column(name = "MARCA_PRODUTO")
 private String marcaProduto;

 @Column(name = "TIPO_PRODUTO")
 private String tipoProduto;

@Column(name = "PRECO_PRODUTO")
 private Double precoProduto;

@Column(name = "DESCRICAO_PRODUTO")
private String descricaoProduto;

    public Produto() {


    }

    public Produto(Long idProduto, Fornecedor fornecedor,String nomeProduto, String marcaProduto, String tipoProduto, Double precoProduto, String descricaoProduto) {
        this.idProduto = idProduto;
        this.fornecedor = fornecedor;
        this.nomeProduto = nomeProduto;
        this.marcaProduto = marcaProduto;
        this.tipoProduto = tipoProduto;
        this.precoProduto = precoProduto;
        this.descricaoProduto = descricaoProduto;
    }



    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Fornecedor getFornecedor() {return fornecedor;}

    public void setFornecedor(Fornecedor fornecedor) {this.fornecedor = fornecedor;}
}
