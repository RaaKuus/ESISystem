/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.utils;

import esi.system.model.Aluno;
import esi.system.model.CondicoesSaude;
import esi.system.model.Matricula;
import esi.system.model.NecessidadesEspeciais;
import esi.system.model.Observacoes;

/**
 *
 * @author RaaKuus
 */
public class MatriculaBuilder {
    private Aluno aluno;
    private NecessidadesEspeciais necessidadesEspeciais;
    private CondicoesSaude condicoesSaude;
    private Observacoes observacoes;
    
    public MatriculaBuilder buildAluno(Aluno aluno){
        this.aluno = aluno;
        return this;
    }
    
    public MatriculaBuilder buildNecessidadesEspeciais(NecessidadesEspeciais ne){
        this.necessidadesEspeciais = ne;
        return this;
    }
    
    public MatriculaBuilder buildCondicoesSaude(CondicoesSaude cs){
        this.condicoesSaude = cs;
        return this;
    }
    
    public MatriculaBuilder buildObservacoes(Observacoes o){
        this.observacoes = o;
        return this;
    }
    
    public Matricula build(){
        Matricula matricula = new Matricula();
        matricula.setMatricula(this.aluno.getMatricula());
        matricula.setNome(this.aluno.getNome());
        matricula.setSexo(this.aluno.getSexo());
        matricula.setNaturalidade(this.aluno.getNaturalidade());
        matricula.setDataNascimento(this.aluno.getDataNascimento().toString());
        matricula.setEndereco(this.aluno.getEndereco());
        matricula.setNomePai(this.aluno.getNomePai());
        matricula.setIdentidadePai(this.aluno.getNomePai());
        matricula.setNomeMae(this.aluno.getNomeMae());
        matricula.setIdentidadeMae(this.aluno.getNomeMae());
        matricula.setCor(this.aluno.getCor());
        matricula.setDataMatricula(this.aluno.getDataMatricula().toString());
        
        matricula.setVacinas(this.condicoesSaude.getVacinas());
        matricula.setAlergica(this.condicoesSaude.getAlergica());
        matricula.setAlergias(this.condicoesSaude.getAlergias());
        matricula.setRemedioControlado(this.condicoesSaude.getRemedioControlado());
        matricula.setRemedioIndicado(this.condicoesSaude.getRemedioIndicado());
        matricula.setFebre(this.condicoesSaude.getFebre());
        matricula.setRemedioFebre(this.condicoesSaude.getRemedioFebre());
        
        matricula.setVisual(this.necessidadesEspeciais.getVisual());
        matricula.setAuditiva(this.necessidadesEspeciais.getAuditiva());
        matricula.setFisica(this.necessidadesEspeciais.getFisica());
        matricula.setMental(this.necessidadesEspeciais.getMental());
        matricula.setMultipla(this.necessidadesEspeciais.getMultipla());
        matricula.setAltasHabilidades(this.necessidadesEspeciais.getAltasHabilidades());
        matricula.setCondutasTipicas(this.necessidadesEspeciais.getCondutasTipicas());
        matricula.setOutra(this.necessidadesEspeciais.getOutra());
        
        matricula.setObservacoes(this.observacoes.getObservacoes());
        return matricula;
    }
    
    
}
