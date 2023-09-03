package br.com.wandersontimoteo.diodesafioumliphone.entities;

import br.com.wandersontimoteo.diodesafioumliphone.entities.interfaces.NavegadorInternet;
import br.com.wandersontimoteo.diodesafioumliphone.entities.interfaces.ReprodutorMusical;
import br.com.wandersontimoteo.diodesafioumliphone.entities.interfaces.Telefone;

import java.util.Objects;

public class Iphone implements NavegadorInternet, ReprodutorMusical, Telefone {

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

    @Override
    public void exibirPagina() {
        System.out.println("Exibir Pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar Nova Aba no Navegador");
    }

    @Override
    public void excluirPagina() {
        System.out.println("Excluir Pagina");
    }

    @Override
    public void iniciarMusica() {
        System.out.println("Iniciar Musica");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parar Musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar Musica");
    }

    @Override
    public void criarListaMusica() {
        System.out.println("Criar Lista de Musica");
    }

    @Override
    public void excluirListaMusica() {
        System.out.println("Excluir Lista de Musica");
    }

    @Override
    public void fazerLigacao() {
        System.out.println("Fazer Ligacao");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atender Ligacao");
    }

    @Override
    public void correioVoz() {
        System.out.println("Correio de Voz");
    }

    @Override
    public void excluirMensagemCorreioVoz() {
        System.out.println("Excluir Mensagem do Correio de Voz");
    }
}
