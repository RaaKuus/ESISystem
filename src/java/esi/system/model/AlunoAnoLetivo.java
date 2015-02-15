/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.model;

/**
 *
 * @author Bruno
 */
public class AlunoAnoLetivo {
    private int alunosMatricula;
    private int turmaId;
    private String tipo;
    
    public AlunoAnoLetivo(){
        
    }

    public AlunoAnoLetivo(int alunosMatricula, int turmasId, String tipo) {
        this.alunosMatricula = alunosMatricula;
        this.turmaId = turmasId;
        this.tipo = tipo;
    }

    public int getAlunosMatricula() {
        return alunosMatricula;
    }

    public void setAlunosMatricula(int alunosMatricula) {
        this.alunosMatricula = alunosMatricula;
    }

    public int getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(int turmaId) {
        this.turmaId = turmaId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
