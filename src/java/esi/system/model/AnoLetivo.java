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
public class AnoLetivo {
    private int id;
    private int ano;
    
    public AnoLetivo(){
        
    }

    public AnoLetivo(int id, int ano) {
        this.id = id;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + this.ano;
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
        final AnoLetivo other = (AnoLetivo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        return true;
    }

    
    
}
