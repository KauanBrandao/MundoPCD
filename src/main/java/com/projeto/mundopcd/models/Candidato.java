package com.projeto.mundopcd.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "candidatos")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_candidato")
    private int idCandidato;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "tipo_deficiencia")
    private String tipoDeficiencia;

    @Column(name = "formacao")
    private String formacao;

    @Column(name = "experiencia")
    private String experiencia;

    @Column(name = "habilidades")
    private String habilidades;

    @Column(name = "curriculo")
    private String curriculo;

    @ManyToOne
    @JoinColumn(name = "id_plano", referencedColumnName = "id_plano", insertable = false, updatable = false)
    private Plano plano;

    @Column(name = "id_plano")
    private Integer idPlano;

    @OneToOne
    @JoinColumn(name = "id_endereco_candidato", insertable = false, updatable = false)
    private EnderecoCandidatoModels endereco;

    @Column(name = "id_endereco_candidato")
    private Integer idEnderecoCandidato;

    @OneToMany(mappedBy = "candidato")
    private List<Candidatura> candidaturas;

    public Candidato() {}

    public Candidato(List<Candidatura> candidaturas, String cpf, String curriculo, String email, EnderecoCandidatoModels endereco, String experiencia, String formacao, String habilidades, Integer idEnderecoCandidato, Integer idPlano, String nome, Plano plano, String telefone, String tipoDeficiencia) {
        this.candidaturas = candidaturas;
        this.cpf = cpf;
        this.curriculo = curriculo;
        this.email = email;
        this.endereco = endereco;
        this.experiencia = experiencia;
        this.formacao = formacao;
        this.habilidades = habilidades;
        this.idEnderecoCandidato = idEnderecoCandidato;
        this.idPlano = idPlano;
        this.nome = nome;
        this.plano = plano;
        this.telefone = telefone;
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public void setIdPlano(Integer idPlano) {
        this.idPlano = idPlano;
    }

    public void setIdEnderecoCandidato(Integer idEndereoCandidato) {
        this.idEnderecoCandidato = idEndereoCandidato;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public void setTipoDeficiencia(String tipoDeficiencia) {
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public EnderecoCandidatoModels getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCandidatoModels endereco) {
        this.endereco = endereco;
    }

    public List<Candidatura> getCandidaturas() {
        return candidaturas;
    }

    public void setCandidaturas(List<Candidatura> candidaturas) {
        this.candidaturas = candidaturas;
    }
}