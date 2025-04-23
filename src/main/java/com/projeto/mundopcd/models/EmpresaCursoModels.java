package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "empresas_cursos")
public class EmpresaCursoModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa_curso")
    private int idEmpresaCurso;

    @ManyToOne
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false)
    private CursoModels curso;

    @Column(name = "id_curso")
    private int idCurso;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", insertable = false, updatable = false)
    private EmpresaModels empresa;

    @Column(name = "id_empresa")
    private int idEmpresa;
}
