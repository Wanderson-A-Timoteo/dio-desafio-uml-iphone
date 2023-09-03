package br.com.wandersontimoteo.diodesafioumliphone.entities;

import java.util.Objects;

public class Iphone {

    private Long id;
    private String modelo;
    private Integer anaFabricacao;
    private String cor;
    private String capacidadeMemoria;
    private String capacidadeArmazenamento;
    private Double capacidadeBateria;
    private String tipoBateria;
    private Double tamanhoTela;
    private String tipoTela;


    public Iphone() {
    }

    public Iphone(Long id, String modelo, Integer anaFabricacao, String cor,
                  String capacidadeMemoria, String capacidadeArmazenamento,
                  Double capacidadeBateria, String tipoBateria, Double tamanhoTela,
                  String tipoTela) {
        this.id = id;
        this.modelo = modelo;
        this.anaFabricacao = anaFabricacao;
        this.cor = cor;
        this.capacidadeMemoria = capacidadeMemoria;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.capacidadeBateria = capacidadeBateria;
        this.tipoBateria = tipoBateria;
        this.tamanhoTela = tamanhoTela;
        this.tipoTela = tipoTela;
    }

    public Long getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnaFabricacao() {
        return anaFabricacao;
    }

    public void setAnaFabricacao(Integer anaFabricacao) {
        this.anaFabricacao = anaFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(String capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public Double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(Double capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(Double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Iphone iphone)) return false;
        return Objects.equals(getId(), iphone.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
