/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.model;

import java.sql.Timestamp;
import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 *
 * @author RaaKuus
 */
@JsonAutoDetect
public class Matricula {
    //id zuado do extjs tem que tirar isso...
    private String Id;
    
    
    private int matricula;
    private String nome;
    private int sexo;
    private String dataNascimento;
    private String naturalidade;
    private String endereco;
    private String nomePai;
    private String identidadePai;
    private String nomeMae;
    private String identidadeMae;
    private int cor;
    private String dataMatricula;
    
    private int visual;
    private int auditiva;
    private int fisica;
    private int mental;
    private int multipla;
    private int altasHabilidades;
    private int condutasTipicas;
    private int outra;
    
    private int vacinas;
    private int alergica;
    private String alergias;
    private int remedioControlado;
    private String remedioIndicado;
    private int febre;
    private String remedioFebre;
    
    private String observacoes;

    public Matricula() {
    }

    public Matricula(String Id, int matricula, String nome, int sexo, String dataNascimento, String naturalidade, String endereco, String nomePai, String identidadePai, String nomeMae, String identidadeMae, int cor, String dataMatricula, int visual, int auditiva, int fisica, int mental, int multipla, int altasHabilidades, int condutasTipicas, int outra, int vacinas, int alergica, String alergias, int remedioControlado, String remedioIndicado, int febre, String remedioFebre, String observacoes) {
        this.Id = Id;
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.naturalidade = naturalidade;
        this.endereco = endereco;
        this.nomePai = nomePai;
        this.identidadePai = identidadePai;
        this.nomeMae = nomeMae;
        this.identidadeMae = identidadeMae;
        this.cor = cor;
        this.dataMatricula = dataMatricula;
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
        this.alergias = alergias;
        this.remedioControlado = remedioControlado;
        this.remedioIndicado = remedioIndicado;
        this.febre = febre;
        this.remedioFebre = remedioFebre;
        this.observacoes = observacoes;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
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

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getRemedioControlado() {
        return remedioControlado;
    }

    public void setRemedioControlado(int remedioControlado) {
        this.remedioControlado = remedioControlado;
    }

    public String getRemedioIndicado() {
        return remedioIndicado;
    }

    public void setRemedioIndicado(String remedioIndicado) {
        this.remedioIndicado = remedioIndicado;
    }

    public int getFebre() {
        return febre;
    }

    public void setFebre(int febre) {
        this.febre = febre;
    }

    public String getRemedioFebre() {
        return remedioFebre;
    }

    public void setRemedioFebre(String remedioFebre) {
        this.remedioFebre = remedioFebre;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
    
    
    public Aluno buildAluno(){
        Aluno aluno = new Aluno();
        aluno.setMatricula(this.matricula);
        aluno.setNome(this.nome);
        aluno.setSexo(this.sexo);
        aluno.setNaturalidade(this.naturalidade);
        aluno.setDataNascimento(null);
        aluno.setEndereco(this.endereco);
        aluno.setNomePai(this.nomePai);
        aluno.setIdentidadePai(this.identidadePai);
        aluno.setNomeMae(this.nomeMae);
        aluno.setIdentidadeMae(this.identidadeMae);
        aluno.setCor(this.cor);
        aluno.setDataMatricula(null);
        return aluno;
    }
    
    public NecessidadesEspeciais buildNecessidadesEspeciais(){
        NecessidadesEspeciais ne = new NecessidadesEspeciais();
        ne.setMatricula(this.matricula);
        ne.setVisual(this.visual);
        ne.setAuditiva(this.auditiva);
        ne.setFisica(this.fisica);
        ne.setMental(this.mental);
        ne.setMultipla(this.multipla);
        ne.setAltasHabilidades(this.altasHabilidades);
        ne.setCondutasTipicas(this.condutasTipicas);
        ne.setOutra(this.outra);
        return ne;
    }
    
    public CondicoesSaude buildCondicoesSaude(){
        CondicoesSaude cs = new CondicoesSaude();
        cs.setMatricula(this.matricula);
        cs.setVacinas(this.vacinas);
        cs.setAlergica(this.alergica);
        cs.setAlergias(this.alergias);
        cs.setRemedioControlado(this.remedioControlado);
        cs.setRemedioIndicado(this.remedioIndicado);
        cs.setFebre(this.febre);
        cs.setRemedioFebre(this.remedioFebre);
        return cs;
    }
    
    public Observacoes buildObservacoes(){
        return new Observacoes(this.matricula, this.observacoes);
    }

    @Override
    public String toString() {
        return "Matricula{" + "matricula=" + matricula + ", nome=" + nome + ", sexo=" + sexo + ", naturalidade=" + naturalidade + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + ", nomePai=" + nomePai + ", identidadePai=" + identidadePai + ", nomeMae=" + nomeMae + ", identidadeMae=" + identidadeMae + ", cor=" + cor + ", dataMatricula=" + dataMatricula + ", vacinas=" + vacinas + ", alergica=" + alergica + ", alergias=" + alergias + ", remedioControlado=" + remedioControlado + ", remedioIndicado=" + remedioIndicado + ", febre=" + febre + ", remedioFebre=" + remedioFebre + ", visual=" + visual + ", auditiva=" + auditiva + ", fisica=" + fisica + ", mental=" + mental + ", multipla=" + multipla + ", altasHabilidades=" + altasHabilidades + ", condutasTipicas=" + condutasTipicas + ", outra=" + outra + ", observacoes=" + observacoes + '}';
    }
    
}
