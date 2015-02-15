package esi.system.model;

/**
 *
 * @author Bruno
 */
public class CapaLivroMatriculas {
    
    private String livro;
    private String tipo;
    private String firma;
    private String cidade;
    private String estado;
    private String cnpj;
    
    public CapaLivroMatriculas(String livro, String tipo, String firma, String cidade, String estado, String cnpj) {
        this.livro = livro;
        this.tipo = tipo;
        this.firma = firma;
        this.cidade = cidade;
        this.estado = estado;
        this.cnpj = cnpj;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}
