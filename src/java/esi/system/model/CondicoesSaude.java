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
public class CondicoesSaude {
    private int matricula;
    private int vacinas;
    private int alergica;
    private String alergias;
    private int remedioControlado;
    private String remedioIndicado;
    private int febre;
    private String remedioFebre;

    public CondicoesSaude() {
    }

    public CondicoesSaude(int matricula, int vacinas, int alergica, String alergias, int remedioControlado, String remedioIndicado, int febre, String remedioFebre) {
        this.matricula = matricula;
        this.vacinas = vacinas;
        this.alergica = alergica;
        this.alergias = alergias;
        this.remedioControlado = remedioControlado;
        this.remedioIndicado = remedioIndicado;
        this.febre = febre;
        this.remedioFebre = remedioFebre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.matricula;
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
        final CondicoesSaude other = (CondicoesSaude) obj;
        return this.matricula == other.matricula;
    }

}
