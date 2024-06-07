package com.github.vdsa.controller.dto;

import com.github.vdsa.model.CatalogoPeixes;
import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FormCatalogoPeixes {

    private Long id;

    private String nome;

    private String descricao;

    private BigDecimal pesoMaximo;

    private LocalDate dataCatalogacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public FormCatalogoPeixes toForm(CatalogoPeixes catalogoPeixes) {
        this.id = catalogoPeixes.getId();
        this.nome = catalogoPeixes.getNome();
        this.descricao = catalogoPeixes.getDescricao();
        this.pesoMaximo = catalogoPeixes.getPesoMaximo();
        this.dataCatalogacao = catalogoPeixes.getDataCatalogacao();

        return this;
    }

    public CatalogoPeixes toModel() {
        CatalogoPeixes catalogoPeixes = new CatalogoPeixes();
        catalogoPeixes.setId(this.getId());
        catalogoPeixes.setNome(this.getNome());
        catalogoPeixes.setDescricao(this.getDescricao());
        catalogoPeixes.setPesoMaximo(this.getPesoMaximo());
        catalogoPeixes.setDataCatalogacao(this.getDataCatalogacao());

        return catalogoPeixes;
    }
}
