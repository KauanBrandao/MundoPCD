package com.projeto.mundopcd.models;

import com.projeto.mundopcd.entities.Empresa;
import jakarta.persistence.*;

@Entity
@Table(name = "administradores_empresas")
public class AdministradorEmpresaModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_administrador")
    private int idAdmin;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", insertable = false, updatable = false)
    private EmpresaModels empresa;

    @Column(name = "id_empresa")
    private Integer idEmpresa;

    public AdministradorEmpresaModels() {}

    public AdministradorEmpresaModels(String nome, String email, String senha, EmpresaModels empresa) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.empresa = empresa;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

public EmpresaModels getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModels empresa) {
        this.empresa = empresa;
    }
}
