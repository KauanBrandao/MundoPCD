package com.projeto.mundopcd.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "planos")
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plano")
    private int idPlano;

    @Column(name = "nome")
    private String nome;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "tipo")
    private String tipo;

    @OneToMany(mappedBy = "plano")
    @JsonManagedReference("plano-empresa")
    private List<Empresa> empresas;

    @OneToMany(mappedBy = "plano")
    @JsonManagedReference("plano-candidato")
    private List<Candidato> candidatos;

    @ManyToOne
    @JoinColumn(name = "id_inscricao_curso")
    private InscricaoCurso inscricaoCurso;

    public Plano() {}

    public Plano(String nome, Double valor, String tipo,
                 List<Empresa> empresas, List<Candidato> candidatos,
                 InscricaoCurso inscricaoCurso) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
        this.empresas = empresas;
        this.candidatos = candidatos;
        this.inscricaoCurso = inscricaoCurso;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public InscricaoCurso getInscricaoCurso() {
        return inscricaoCurso;
    }

    public void setInscricaoCurso(InscricaoCurso inscricaoCurso) {
        this.inscricaoCurso = inscricaoCurso;
    }
}