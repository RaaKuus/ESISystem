/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.model;

import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Bruno
 */
public class Aluno {
    private int matricula;
    private String nome;
    private int sexo;
    private String naturalidade;
    private java.sql.Timestamp dataNascimento;
    private String endereco;
    private String nomePai;
    private String identidadePai;
    private String nomeMae;
    private String identidadeMae;
    private int cor;
    private java.sql.Timestamp dataMatricula;

    public Aluno() {
    }

    public Aluno(int matricula, String nome, int sexo, String naturalidade, Timestamp dataNascimento, String endereco, String nomePai, String identidadePai, String nomeMae, String identidadeMae, int cor, Timestamp dataMatricula) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.naturalidade = naturalidade;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.nomePai = nomePai;
        this.identidadePai = identidadePai;
        this.nomeMae = nomeMae;
        this.identidadeMae = identidadeMae;
        this.cor = cor;
        this.dataMatricula = dataMatricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Timestamp getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Timestamp dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public Timestamp getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Timestamp dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    
}
