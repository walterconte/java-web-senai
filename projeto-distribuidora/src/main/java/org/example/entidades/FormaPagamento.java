package org.example.entidades;

import javax.persistence.*;

@Entity
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAGAMENTO")
    private Long idPagamento;

    @Column(name = "NOME_PAGAMENTO")
    private String nomePagamento;

    @Column(name = "TIPO_PAGAMENTO")
    private String tipoPagamento;

    @Column(name = "PARCELA_PAGAMENTO")
    private Integer parcelaPagamento;

    public FormaPagamento() {

    }

    public FormaPagamento(Long idPagamento, String nomePagamento, String tipoPagamento, Integer parcelaPagamento) {
        this.idPagamento = idPagamento;
        this.nomePagamento = nomePagamento;
        this.tipoPagamento = tipoPagamento;
        this.parcelaPagamento = parcelaPagamento;
    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getNomePagamento() {
        return nomePagamento;
    }

    public void setNomePagamento(String nomePagamento) {
        this.nomePagamento = nomePagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Integer getParcelaPagamento() {
        return parcelaPagamento;
    }

    public void setParcelaPagamento(Integer parcelaPagamento) {
        this.parcelaPagamento = parcelaPagamento;
    }
}