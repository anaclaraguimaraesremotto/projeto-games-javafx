package com.example;

public class Game {

    private String titulo;
    private String descricao;
    private Categoria genero;
    private boolean isZerado;
    private boolean isPlatinado;

    public Game(String titulo, String descricao, Categoria genero, boolean isZerado, boolean isPlatinado) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.genero = genero;
        this.isZerado = isZerado;
        this.isPlatinado = isPlatinado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getGenero() {
        return genero;
    }

    public void setGenero(Categoria genero) {
        this.genero = genero;
    }

    public boolean isZerado() {
        return isZerado;
    }

    public void setZerado(boolean zerado) {
        isZerado = zerado;
    }

    public boolean isPlatinado() {
        return isPlatinado;
    }

    public void setPlatinado(boolean platinado) {
        isPlatinado = platinado;
    }
}
