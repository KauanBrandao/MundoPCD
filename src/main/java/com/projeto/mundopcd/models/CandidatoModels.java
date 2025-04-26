package com.projeto.mundopcd.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "candidatos")
public class CandidatoModels {

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

    public CandidatoModels(List<CandidaturaModels> candidaturas, String cpf, String curriculo, String email, EnderecoCandidatoModels enderecoCandidato, String experiencia, String formacao, String habilidades, Integer idEnderecoCandidato, Integer idPlano, String nome, PlanoModels plano, String telefone, String tipoDeficiencia) {
        this.candidaturas = candidaturas;
        this.cpf = cpf;
        this.curriculo = curriculo;
        this.email = email;
        this.enderecoCandidato = enderecoCandidato;
        this.idEnderecoCandidato = idEnderecoCandidato;
        this.idPlano = idPlano;
        this.nome = nome;
        this.plano = plano;
        this.telefone = telefone;
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public Integer getIdPlano() {
        return idPlano;
    }

    public Integer getIdEnderecoCandidato() {
        return idEnderecoCandidato;
    }

    @JsonIgnore
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
}
