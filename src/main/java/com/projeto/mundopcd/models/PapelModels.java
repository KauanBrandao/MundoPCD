package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "papel")
public class PapelModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_papel")
    private int idPapel;

    @Column(name = "papel")
    private String papel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    private UsuarioModels usuario;

    @Column(name = "id_usuario")
    private int idUsuario;

    public PapelModels() {
    }

    public PapelModels(String papel) {
        this.papel = papel;
    }

    public PapelModels(String papel, Integer idUsuario) {
        this.papel = papel;
        this.idUsuario = idUsuario;
    }

    public int getIdPapel() {
        return idPapel;
    }

    public void setIdPapel(int idPapel) {
        this.idPapel = idPapel;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioModels getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModels usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Papel{" +
                "idPapel=" + idPapel +
                '}';
    }
}