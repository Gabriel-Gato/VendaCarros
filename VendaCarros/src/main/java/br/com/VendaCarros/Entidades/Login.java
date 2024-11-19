package br.com.VendaCarros.Entidades;


import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigInteger;

@Entity (name = "Login")
public class Login implements Serializable {

    private static final long serivalVersionUID = 1l;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    @Column (name = "Nome")
    String nome;

    @Column (name = "Email")
    String email;

    @Column (name = "CPF")
    int cpf;

    @Column (name = "CEP")
    String cep;

    @Column (name = "Senha")
    String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf=" + cpf +
                ", cep='" + cep + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
