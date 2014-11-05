/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author RaaKuus
 */
@Entity
public class Matricula implements Serializable {

    @Id
    @Column
    private int matricula;
    @Column
    private String nomeAluno;
    @Column
    private int sexo;
    @Column
    private String dataNascimento;
    @Column
    private String naturalidade;
    @Column
    private String endereco;
    @Column
    private String nomePai;
    @Column
    private String identidadePai;
    @Column
    private String nomeMae;
    @Column
    private String identidadeMae;
    @Column
    private int cor;
    @Column
    private int visual;
    @Column
    private int auditiva;
    @Column
    private int fisica;
    @Column
    private int mental;
    @Column
    private int multipla;
    @Column
    private int altasHabilidades;
    @Column
    private int condutasTipicas;
    @Column
    private int outra;
    @Column
    private int vacinas;
    @Column
    private int alergica;
    @Column
    private String alergiasIndicadas;
    @Column
    private int remedioControlado;
    @Column
    private String qualRemedioControlado;
    @Column
    private String observacoes;

    public Matricula() {
    }

    public Matricula(int matricula, String nomeAluno, int sexo, String dataNascimento, String naturalidade, String endereco, String nomePai, String identidadePai, String nomeMae, String identidadeMae, int cor, int visual, int auditiva, int fisica, int mental, int multipla, int altasHabilidades, int condutasTipicas, int outra, int vacinas, int alergica, String alergiasIndicadas, int remedioControlado, String qualRemedioControlado, String observacoes) {
        super();
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.naturalidade = naturalidade;
        this.endereco = endereco;
        this.nomePai = nomePai;
        this.identidadePai = identidadePai;
        this.nomeMae = nomeMae;
        this.identidadeMae = identidadeMae;
        this.cor = cor;
        this.visual = visual;
        this.auditiva = auditiva;
        this.fisica = fisica;
        this.mental = mental;
        this.multipla = multipla;
        this.altasHabilidades = altasHabilidades;
        this.condutasTipicas = condutasTipicas;
        this.outra = outra;
        this.vacinas = vacinas;
        this.alergica = alergica;
        this.alergiasIndicadas = alergiasIndicadas;
        this.remedioControlado = remedioControlado;
        this.qualRemedioControlado = qualRemedioControlado;
        this.observacoes = observacoes;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getIdentidadePai() {
        return identidadePai;
    }

    public void setIdentidadePai(String identidadePai) {
        this.identidadePai = identidadePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getIdentidadeMae() {
        return identidadeMae;
    }

    public void setIdentidadeMae(String identidadeMae) {
        this.identidadeMae = identidadeMae;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }

    public int getVisual() {
        return visual;
    }

    public void setVisual(int visual) {
        this.visual = visual;
    }

    public int getAuditiva() {
        return auditiva;
    }

    public void setAuditiva(int auditiva) {
        this.auditiva = auditiva;
    }

    public int getFisica() {
        return fisica;
    }

    public void setFisica(int fisica) {
        this.fisica = fisica;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    public int getMultipla() {
        return multipla;
    }

    public void setMultipla(int multipla) {
        this.multipla = multipla;
    }

    public int getAltasHabilidades() {
        return altasHabilidades;
    }

    public void setAltasHabilidades(int altasHabilidades) {
        this.altasHabilidades = altasHabilidades;
    }

    public int getCondutasTipicas() {
        return condutasTipicas;
    }

    public void setCondutasTipicas(int condutasTipicas) {
        this.condutasTipicas = condutasTipicas;
    }

    public int getOutra() {
        return outra;
    }

    public void setOutra(int outra) {
        this.outra = outra;
    }

    public int getVacinas() {
        return vacinas;
    }

    public void setVacinas(int vacinas) {
        this.vacinas = vacinas;
    }

    public int getAlergica() {
        return alergica;
    }

    public void setAlergica(int alergica) {
        this.alergica = alergica;
    }

    public String getAlergiasIndicadas() {
        return alergiasIndicadas;
    }

    public void setAlergiasIndicadas(String alergiasIndicadas) {
        this.alergiasIndicadas = alergiasIndicadas;
    }

    public int getRemedioControlado() {
        return remedioControlado;
    }

    public void setRemedioControlado(int remedioControlado) {
        this.remedioControlado = remedioControlado;
    }

    public String getQualRemedioControlado() {
        return qualRemedioControlado;
    }

    public void setQualRemedioControlado(String qualRemedioControlado) {
        this.qualRemedioControlado = qualRemedioControlado;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
