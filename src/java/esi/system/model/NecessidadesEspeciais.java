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
public class NecessidadesEspeciais {
    private int matricula;
    private int visual;
    private int auditiva;
    private int fisica;
    private int mental;
    private int multipla;
    private int altasHabilidades;
    private int condutasTipicas;
    private int outra;

    public NecessidadesEspeciais() {
    }

    public NecessidadesEspeciais(int matricula, int visual, int auditiva, int fisica, int mental, int multipla, int altasHabilidades, int condutasTipicas, int outra) {
        this.matricula = matricula;
        this.visual = visual;
        this.auditiva = auditiva;
        this.fisica = fisica;
        this.mental = mental;
        this.multipla = multipla;
        this.altasHabilidades = altasHabilidades;
        this.condutasTipicas = condutasTipicas;
        this.outra = outra;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.matricula;
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
        final NecessidadesEspeciais other = (NecessidadesEspeciais) obj;
        return this.matricula == other.matricula;
    }

}
