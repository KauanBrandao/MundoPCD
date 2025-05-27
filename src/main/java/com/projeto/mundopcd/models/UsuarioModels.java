package com.projeto.mundopcd.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class UsuarioModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "senha")
    private String senha;

    @Column(name = "enabled")
    private boolean enabled = true;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<PapelModels> papeis;

    @OneToOne
    @JoinColumn(name = "id_candidato", insertable = false, updatable = false)
    private CandidatoModels candidato;

    @Column(name = "id_candidato")
    private int idCandidato;

    @OneToOne
    @JoinColumn(name = "id_empresa", insertable = false, updatable = false)
    private EmpresaModels empresa;

    @Column(name = "id_empresa")
    private int idEmpresa;

    @OneToOne
    @JoinColumn(name = "id_administrador", insertable = false, updatable = false)
    private AdministradorModels administrador;

    @Column(name = "id_administrador")
    private int idAdministrador;

    public UsuarioModels() {}

    public UsuarioModels(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public AdministradorModels getAdministrador() {
        return administrador;
    }

    public void setAdministrador(AdministradorModels administrador) {
        this.administrador = administrador;
    }

    public CandidatoModels getCandidato() {
        return candidato;
    }

    public void setCandidato(CandidatoModels candidato) {
        this.candidato = candidato;
    }

    public EmpresaModels getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModels empresa) {
        this.empresa = empresa;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<PapelModels> getPapeis() {
        return papeis;
    }

    public void setPapeis(List<PapelModels> papeis) {
        this.papeis = papeis;
    }
}
