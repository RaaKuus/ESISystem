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
public class Telefone {
    private int id;
    private int alunosMatricula;
    private String telefone;
    
    public Telefone(){
        
    }

    public Telefone(int id, int alunosMatricula, String telefone) {
        this.id = id;
        this.alunosMatricula = alunosMatricula;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlunosMatricula() {
        return alunosMatricula;
    }

    public void setAlunosMatricula(int alunosMatricula) {
        this.alunosMatricula = alunosMatricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
