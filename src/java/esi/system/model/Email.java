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
public class Email {
    
    private int alunosMatricula;
    private String email;
    
    public Email(){
        
    }

    public Email(int alunosMatricula, String email) {
        this.alunosMatricula = alunosMatricula;
        this.email = email;
    }

    public int getAlunosMatricula() {
        return alunosMatricula;
    }

    public void setAlunosMatricula(int alunosMatricula) {
        this.alunosMatricula = alunosMatricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
