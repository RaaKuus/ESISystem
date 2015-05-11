package esi.system.model;

import esi.system.utils.HashResolver;
import esi.system.utils.HashResolverImpl;
import java.util.Objects;

/**
 *
 * @author Bruno
 */

public class Login {

    private int id;
    private String cpf;
    private String senha;
    private String salt;
    private String permissoes;

    private HashResolver hashResolver;
    
    public Login() {
        this.hashResolver = new HashResolverImpl();
    }

    public Login(int id, String cpf, String senha, String salt, String permissoes) {
        super();
        this.id = id;
        this.cpf = cpf;
        this.senha = senha;
        this.salt = salt;
        this.permissoes = permissoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String permissoes) {
        this.permissoes = permissoes;
    }

    public boolean autenticar(String password){
        return this.senha.equals(this.hashResolver.gerarMd5(password, salt));
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.cpf);
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
        final Login other = (Login) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
    
}
