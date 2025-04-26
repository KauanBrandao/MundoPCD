package com.projeto.mundopcd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "enderecos_candidatos")
public class EnderecoCandidatoModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco_candidato")
    private int idEnderecoCandidato;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private String numero;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cep")
    private String cep;

    @OneToOne
    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato", insertable = false, updatable = false)
    private CandidatoModels candidato;

    @Column(name = "id_candidato")
    private Integer idCandidato;

    public EnderecoCandidatoModels() {
    }

//    public CandidatoModels getCandidato() {
//        return candidato;
//    }

    public void setCandidato(CandidatoModels candidatoModels) {
        this.candidato = candidatoModels;
    }

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getIdEnderecoCandidato() {
        return idEnderecoCandidato;
    }

    public void setIdEnderecoCandidato(int idEnderecoCandidato) {
        this.idEnderecoCandidato = idEnderecoCandidato;
    }
}
