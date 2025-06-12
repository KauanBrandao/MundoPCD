package com.projeto.mundopcd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "candidatos")
public class CandidatoModels{

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

    @Column(name = "curriculo")
    private String curriculo;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "senha")
    private String senha;

    @Column(name = "estado_civil")
    private String estadoCivil;

    @Column(name = "genero")
    private String genero;

    @Column(name = "mae")
    private String mae;

    @Column(name = "pai")
    private String pai;

    @ManyToOne
    @JoinColumn(name = "id_plano", referencedColumnName = "id_plano", insertable = false, updatable = false)
    private PlanoModels plano;

    @Column(name = "id_plano")
    private Integer idPlano;

    @OneToOne
    @JoinColumn(name = "id_endereco_candidato", insertable = false, updatable = false)
    private EnderecoCandidatoModels enderecoCandidato;

    @Column(name = "id_endereco_candidato")
    private Integer idEnderecoCandidato;

    @OneToMany(mappedBy = "candidato")
    private List<CandidaturaModels> candidaturas;

    public CandidatoModels() {}

    public CandidatoModels(List<CandidaturaModels> candidaturas, String cpf, String curriculo, String email, EnderecoCandidatoModels enderecoCandidato, String senha, String experiencia, String formacao, String habilidades, Integer idEnderecoCandidato, Integer idPlano, String nome, PlanoModels plano, String telefone, String tipoDeficiencia) {
        this.candidaturas = candidaturas;
        this.cpf = cpf;
        this.curriculo = curriculo;
        this.email = email;
        this.senha = senha;
        this.enderecoCandidato = enderecoCandidato;
        this.idEnderecoCandidato = idEnderecoCandidato;
        this.idPlano = idPlano;
        this.nome = nome;
        this.plano = plano;
        this.telefone = telefone;
        this.tipoDeficiencia = tipoDeficiencia;
    }

    @JsonIgnore
    public Integer getIdPlano() {
        return idPlano;
    } 

    @JsonIgnore
    public Integer getIdEnderecoCandidato() {
        return idEnderecoCandidato;
    }

    public List<CandidaturaModels> getCandidaturas() {
        return candidaturas;
    }

    public void setCandidaturas(List<CandidaturaModels> candidaturas) {
        this.candidaturas = candidaturas;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
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

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public PlanoModels getPlano() {
        return plano;
    }

    public void setPlano(PlanoModels planoModels) {
        this.plano = planoModels;
    }

    public EnderecoCandidatoModels getEnderecoCandidato() {
        return enderecoCandidato;
    }

    public void setEnderecoCandidato(EnderecoCandidatoModels enderecoCandidato) {
        this.enderecoCandidato = enderecoCandidato;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
