package esi.system.model;

/**
 *
 * @author Bruno
 */

public class ConteudoMatricula {
    
    private String matricula;
    private String serie;
    private String turno;
    private final String turma = "Única";
    private String nomeAluno;
    private String dataNascimento;
    private String idade;
    private String naturalidade;
    private String nomePai;
    private String nomeMae;
    private String residencia;
    private String dataMatricula;
    private String observacoes;

    public ConteudoMatricula() {
    }

    public ConteudoMatricula(String matricula, String serie, String turno, String nomeAluno, String dataNascimento, String idade, String naturalidade, String nomePai, String nomeMae, String residencia, String dataMatricula, String observacoes) {
        this.matricula = matricula;
        this.serie = serie;
        this.turno = turno;
        this.nomeAluno = nomeAluno;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.naturalidade = naturalidade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.residencia = residencia;
        this.dataMatricula = dataMatricula;
        this.observacoes = observacoes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    public String getTurma(){
        return this.turma;
    }
    
}
