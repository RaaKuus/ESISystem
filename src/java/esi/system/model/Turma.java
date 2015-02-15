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
public class Turma {
    private int id;
    private String serie;
    private char turno;
    private String turma;
    private int anosLetivosId;
    
    public Turma(){
        
    }

    public Turma(int id, String serie, char turno, String turma, int anosLetivosId) {
        this.id = id;
        this.serie = serie;
        this.turno = turno;
        this.turma = turma;
        this.anosLetivosId = anosLetivosId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getAnosLetivosId() {
        return anosLetivosId;
    }

    public void setAnosLetivosId(int anosLetivosId) {
        this.anosLetivosId = anosLetivosId;
    }
    
}
