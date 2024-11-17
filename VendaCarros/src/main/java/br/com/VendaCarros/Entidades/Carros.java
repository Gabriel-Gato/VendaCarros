package br.com.VendaCarros.Entidades;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity (name = "Carros")
public class Carros implements Serializable {
    private static final long serivalVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column (name = "Modelo")
    String modelo;

    @Column (name = "Marca")
    String marca;

    @Column (name = "Cores")
    String cores;

    @Column (name = "Aros")
    String aros;

    @Column (name = "Detalhes")
    String detalhes;

    @Column (name = "Direção")
    String direcao;

    @Column (name = "Combustivel")
    String combustivel;

    @Column (name = "Estado_De_Conservação")
    String estado;

    @Column (name = "Preço")
    Double preco;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getAros() {
        return aros;
    }

    public void setAros(String aros) {
        this.aros = aros;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cores='" + cores + '\'' +
                ", aros='" + aros + '\'' +
                ", detalhes='" + detalhes + '\'' +
                ", direcao='" + direcao + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", estado='" + estado + '\'' +
                ", preco=" + preco +
                '}';
    }
}
