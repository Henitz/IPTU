package com.empresa.poc.iptuapi.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.util.Date;

public class IptuDto {

    @Column(name = "\"numeroDoContribuinte\"")
    private String contribuinte;

    @Column(name = "\"anoDoExercicio\"")
    private String ano;

    @Column(name = "\"numeroDaNl\"")
    private String numero;

    @Column(name = "\"dataDoCadastramento\"")
    private String data;


    @Column(name = "\"tipoDeContribuinte1\"")
    private String tipo1;

    @Column(name = "\"cpfCnpjDoContribuinte1\"")
    private String cpfcnpj1;

    @Column(name = "\"nomeDoContribuinte1\"")
    private String nome1;

    @Column(name = "\"tipoDeContribuinte2\"")
    private String tipo2;

    @Column(name = "\"cpfCnpjDoContribuinte2\"")
    private String cpfcnpj2;

    @Column(name = "\"nomeDoContribuinte2\"")
    private String nome2;


    @Column(name = "\"numeroDoCondominio\"")
    private String numerodoCondominio;

    @Column(name = "\"codlogDoImovel\"")
    private String codlog;

    @Column(name = "\"nomeDeLogradouroDoImovel\"")
    private String logradouro;

    @Column(name = "\"numeroDoImovel\"")
    private String numerodoImovel;

    @Column(name = "\"complementoDoImovel\"")
    private String complemento;

    @Column(name = "\"bairroDoImovel\"")
    private String bairro;

    @Column(name = "\"referenciaDoImovel\"")
    private String referencia;

    @Column(name = "\"cepDoImovel\"")
    private String cep;

    @Column(name = "\"quantidadeDeEsquinasFrentes\"")
    private String quantidadedeesquinasfrentes;

    @Column(name = "\"fracaoIdeal\"")
    private String fracaoideal;

    @Column(name = "\"areaDoTerreno\"")
    private String areadoterreno;

    @Column(name = "\"areaConstruida\"")
    private String areaconstruida;

    @Column(name = "\"areaOcupada\"")
    private String areaocupada;

    @Column(name = "\"valorDoMQDoTerreno\"")
    private String valordomqdoterreno;

    @Column(name = "\"valorDoMQDeConstrucao\"")
    private String valordomqdeconstrucao;

    @Column(name = "\"anoDaConstrucaoCorrigido\"")
    private String anodaconstrucao;

    @Column(name = "\"quantidadeDePavimentos\"")
    private String quantidadedepavimentos;

    @Column(name = "\"testadaParaCalculo\"")
    private String testada;

    @Column(name = "\"tipoDeUsoDoImovel\"")
    private String tipodeuso;

    @Column(name = "\"tipoDePadraoDaConstrucao\"")
    private String tipodepadrao;

    @Column(name = "\"tipoDeTerreno\"")
    private String tipodeterreno;

    @Column(name = "\"fatorDeObsolescencia\"")
    private String obsolescencia;

    @Column(name = "\"anoDeInicioDaVidaDoContribuinte\"")
    private String anodeiniciodaVida;

    @Column(name = "\"mesDeInicioDaVidaDoContribuinte\"")
    private String mesdeiniciodavida;

    @Column(name = "\"faseDoContribuinte\"")
    private String fase;














    public IptuDto() {

    }

    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getCpfcnpj1() {
        return cpfcnpj1;
    }

    public void setCpfcnpj1(String cpfcnpj1) {
        this.cpfcnpj1 = cpfcnpj1;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getCpfcnpj2() {
        return cpfcnpj2;
    }

    public void setCpfcnpj2(String cpfcnpj2) {
        this.cpfcnpj2 = cpfcnpj2;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getNumerodoCondominio() {
        return numerodoCondominio;
    }

    public void setNumerodoCondominio(String numerodoCondominio) {
        this.numerodoCondominio = numerodoCondominio;
    }

    public String getCodlog() {
        return codlog;
    }

    public void setCodlog(String codlog) {
        this.codlog = codlog;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumerodoImovel() {
        return numerodoImovel;
    }

    public void setNumerodoImovel(String numerodoImovel) {
        this.numerodoImovel = numerodoImovel;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getQuantidadedeesquinasfrentes() {
        return quantidadedeesquinasfrentes;
    }

    public void setQuantidadedeesquinasfrentes(String quantidadedeesquinasfrentes) {
        this.quantidadedeesquinasfrentes = quantidadedeesquinasfrentes;
    }

    public String getFracaoideal() {
        return fracaoideal;
    }

    public void setFracaoideal(String fracaoideal) {
        this.fracaoideal = fracaoideal;
    }

    public String getAreadoterreno() {
        return areadoterreno;
    }

    public void setAreadoterreno(String areadoterreno) {
        this.areadoterreno = areadoterreno;
    }

    public String getAreaconstruida() {
        return areaconstruida;
    }

    public void setAreaconstruida(String areaconstruida) {
        this.areaconstruida = areaconstruida;
    }

    public String getAreaocupada() {
        return areaocupada;
    }

    public void setAreaocupada(String areaocupada) {
        this.areaocupada = areaocupada;
    }

    public String getValordomqdoterreno() {
        return valordomqdoterreno;
    }

    public void setValordomqdoterreno(String valordomqdoterreno) {
        this.valordomqdoterreno = valordomqdoterreno;
    }

    public String getValordomqdeconstrucao() {
        return valordomqdeconstrucao;
    }

    public void setValordomqdeconstrucao(String valordomqdeconstrucao) {
        this.valordomqdeconstrucao = valordomqdeconstrucao;
    }

    public String getAnodaconstrucao() {
        return anodaconstrucao;
    }

    public void setAnodaconstrucao(String anodaconstrucao) {
        this.anodaconstrucao = anodaconstrucao;
    }

    public String getQuantidadedepavimentos() {
        return quantidadedepavimentos;
    }

    public void setQuantidadedepavimentos(String quantidadedepavimentos) {
        this.quantidadedepavimentos = quantidadedepavimentos;
    }

    public String getTestada() {
        return testada;
    }

    public void setTestada(String testada) {
        this.testada = testada;
    }

    public String getTipodeuso() {
        return tipodeuso;
    }

    public void setTipodeuso(String tipodeuso) {
        this.tipodeuso = tipodeuso;
    }

    public String getTipodepadrao() {
        return tipodepadrao;
    }

    public void setTipodepadrao(String tipodepadrao) {
        this.tipodepadrao = tipodepadrao;
    }

    public String getTipodeterreno() {
        return tipodeterreno;
    }

    public void setTipodeterreno(String tipodeterreno) {
        this.tipodeterreno = tipodeterreno;
    }

    public String getObsolescencia() {
        return obsolescencia;
    }

    public void setObsolescencia(String obsolescencia) {
        this.obsolescencia = obsolescencia;
    }

    public String getAnodeiniciodaVida() {
        return anodeiniciodaVida;
    }

    public void setAnodeiniciodaVida(String anodeiniciodaVida) {
        this.anodeiniciodaVida = anodeiniciodaVida;
    }

    public String getMesdeiniciodavida() {
        return mesdeiniciodavida;
    }

    public void setMesdeiniciodavida(String mesdeiniciodavida) {
        this.mesdeiniciodavida = mesdeiniciodavida;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }
}
