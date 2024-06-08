package com.github.mfdp.globalsolution.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "peixes")
public class Peixes extends AbstractEntity<Long> {

    @Column(nullable = false, length = 50, unique = true)
    private String nome;

    @Column(nullable = false, length = 50, unique = true)
    private String descricao;

    @Column(nullable = false, length = 50, unique = true)
    private float pesokg;

    @Column(nullable = false, length = 50, unique = true)
    private LocalDate catalogo;

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

    public float getPesokg() {
        return pesokg;
    }

    public void setPesokg(float pesokg) {
        this.pesokg = pesokg;
    }

    public LocalDate getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(LocalDate catalogo) {
        this.catalogo = catalogo;
    }
}