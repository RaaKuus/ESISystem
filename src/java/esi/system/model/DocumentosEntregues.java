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
public class DocumentosEntregues {
    private int alunosMatricula;
    private String rg;
    private String cpf;
    private String comprovanteResidencia;
    private String certidaoNascimento;
    private String cartaoVacina;
    private String historicoEscolar;
    private String foto;

    public DocumentosEntregues() {
    }

    public DocumentosEntregues(int alunosMatricula, String rg, String cpf, String comprovanteResidencia, String certidaoNascimento, String cartaoVacina, String historicoEscolar, String foto) {
        this.alunosMatricula = alunosMatricula;
        this.rg = rg;
        this.cpf = cpf;
        this.comprovanteResidencia = comprovanteResidencia;
        this.certidaoNascimento = certidaoNascimento;
        this.cartaoVacina = cartaoVacina;
        this.historicoEscolar = historicoEscolar;
        this.foto = foto;
    }

    public int getAlunosMatricula() {
        return alunosMatricula;
    }

    public void setAlunosMatricula(int alunosMatricula) {
        this.alunosMatricula = alunosMatricula;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getComprovanteResidencia() {
        return comprovanteResidencia;
    }

    public void setComprovanteResidencia(String comprovanteResidencia) {
        this.comprovanteResidencia = comprovanteResidencia;
    }

    public String getCertidaoNascimento() {
        return certidaoNascimento;
    }

    public void setCertidaoNascimento(String certidaoNascimento) {
        this.certidaoNascimento = certidaoNascimento;
    }

    public String getCartaoVacina() {
        return cartaoVacina;
    }

    public void setCartaoVacina(String cartaoVacina) {
        this.cartaoVacina = cartaoVacina;
    }

    public String getHistoricoEscolar() {
        return historicoEscolar;
    }

    public void setHistoricoEscolar(String historicoEscolar) {
        this.historicoEscolar = historicoEscolar;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
