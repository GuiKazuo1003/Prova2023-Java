package com.prova.prova_java.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.servlet.http.PushBuilder;

@Entity
@Table(name = "TBL_EMPRESAS")
public class Empresas {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;

    private String nome;

    private String categoria;

    @Column (unique = true)
    private Number cnpj;

    private String porte;

    private Number empregados;

    public Empresas(Integer id, String nome, String categoria, Number cnpj, String porte, Number empregados) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.cnpj = cnpj;
        this.porte = porte;
        this.empregados = empregados;
    }

    public Empresas (){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Number getCnpj() {
        return cnpj;
    }

    public void setCnpj(Number cnpj) {
        this.cnpj = cnpj;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Number getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Number empregados) {
        this.empregados = empregados;
    }
}
