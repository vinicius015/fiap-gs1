package com.github.vdsa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "catalogo_peixes")
public class CatalogoPeixes extends AbstractEntity<Long> {

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 200)
    private String descricao;

    @Column(nullable = false)
    private BigDecimal pesoMaximo;

    @Column(columnDefinition = "DATE")
    private LocalDate dataCatalogacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(BigDecimal pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public LocalDate getDataCatalogacao() {
        return dataCatalogacao;
    }

    public void setDataCatalogacao(LocalDate dataCatalogacao) {
        this.dataCatalogacao = dataCatalogacao;
    }
}
