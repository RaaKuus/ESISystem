/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.model;

/**
 *
 * @author RaaKuus
 */
public class MatriculaWrapper {
    private Matricula data;

    public MatriculaWrapper() {
    }

    public MatriculaWrapper(Matricula matricula) {
        this.data = matricula;
    }

    public Matricula getData() {
        return data;
    }

    public void setData(Matricula Data) {
        this.data = Data;
    }
    
}
