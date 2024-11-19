package br.com.VendaCarros.Entidades;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity (name = "Carros")
public class Carros implements Serializable {
    private static final long serivalVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    @Column(name = "nome", nullable = false)
    String nome;

    @Column(name = "descricao", nullable = false)
    String descricao;

    @Column(name = "preco", nullable = false)
    Double preco;

    @Column(name = "imagem", nullable = false)
    String imagem;

    @Column(name = "modelo")
    String modelo;

    @Column(name = "motor")
    String motor;

    @Column(name = "power")
    Integer power;

    @Column(name = "torque")
    Integer torque;

    @Column(name = "consumo")
    Double consumo;

    @Column(name = "Tempo_Aceleração")
    String aceleração;

    @Column(name = "image1")
    String image1;

    @Column(name = "image2")
    String image2;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getTorque() {
        return torque;
    }

    public void setTorque(Integer torque) {
        this.torque = torque;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public String getAceleração() {
        return aceleração;
    }

    public void setAceleração(String aceleração) {
        this.aceleração = aceleração;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", imagem='" + imagem + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", power=" + power +
                ", torque=" + torque +
                ", consumo=" + consumo +
                ", aceleração='" + aceleração + '\'' +
                ", image1='" + image1 + '\'' +
                ", image2='" + image2 + '\'' +
                '}';
    }
}
