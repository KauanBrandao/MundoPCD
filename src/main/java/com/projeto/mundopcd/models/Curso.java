package com.projeto.mundopcd.models;
import jakarta.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cursos")
public class Curso {

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

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<EmpresaCurso> empresaCursos;

    @OneToMany(mappedBy = "curso")
    private List<InscricaoCurso> inscricoesCursos;

    public Curso(int cargaHoraria, String descricao, List<InscricaoCurso> inscricoesCursos, String titulo) {
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
        this.inscricoesCursos = inscricoesCursos;
        this.titulo = titulo;
    }

    public Curso() {}

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

