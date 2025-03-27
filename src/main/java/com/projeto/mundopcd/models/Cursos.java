package com.projeto.mundopcd.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cursos")
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private int idCurso;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "carga_horaria")
    private int cargaHoraria;

    // varios cursos podem ser disponibilizdos por varias empresas
    @ManyToMany()
    @JoinTable(
            name = "empresa_curso",
            joinColumns = @JoinColumn(name = "id_curso"),
            inverseJoinColumns = @JoinColumn(name = "id_empresa")
    )
    private Set<Empresas> empresas;


    @OneToMany(mappedBy = "curso")  // mappedBy indica que a FK está em InscricaoCurso
    private List<InscricoesCursos> inscricoesCursos;


    public Cursos() {}

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Set<Empresas> getEmpresas() { return empresas; }

    public void setEmpresas(Set<Empresas> empresas) { this.empresas = empresas; }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
