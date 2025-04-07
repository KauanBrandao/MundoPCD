package com.projeto.mundopcd.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    // Relacionamento com Planos (Muitos para Um)
    @ManyToOne
    @JoinColumn(name = "id_plano", referencedColumnName = "id_plano")
    private Plano plano;

    // Relacionamento com EnderecoCandidato (Um para Um)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_endereco_candidato")
    private EnderecoCandidato endereco;

    // Relacionamento com Candidaturas (Um para Muitos)
    @OneToMany(mappedBy = "candidato")
    @JsonManagedReference
    private List<Candidatura> candidaturas;

    public Candidato(List<Candidatura> candidaturas, String cpf, String curriculo, EnderecoCandidato endereco, String email, String experiencia, String formacao, String habilidades, String nome, Plano plano, String telefone, String tipoDeficiencia) {
        this.candidaturas = candidaturas;
        this.cpf = cpf;
        this.curriculo = curriculo;
        this.endereco = endereco;
        this.email = email;
        this.experiencia = experiencia;
        this.formacao = formacao;
        this.habilidades = habilidades;
        this.nome = nome;
        this.plano = plano;
        this.telefone = telefone;
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public Candidato() {}

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
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

    public EnderecoCandidato getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCandidato endereco) {
        this.endereco = endereco;
    }

    public List<Candidatura> getCandidaturas() {
        return candidaturas;
    }

    public void setCandidaturas(List<Candidatura> candidaturas) {
        this.candidaturas = candidaturas;
    }
}
