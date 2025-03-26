package com.projeto.mundopcd.models;

import jakarta.persistence.*;


@Entity
@Table(name = "enderecos_candidatos")
public class EnderecoCandidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco_candidato")
    private int idEnderecoCandidato;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private int numero;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cep")
    private String cep;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_candidato", referencedColumnName = "id_candidato")
    private Candidatos candidatos;

    public EnderecoCandidato() {
    }

    public EnderecoCandidato(int idEnderecoCandidato, String logradouro, int numero, String cidade, String estado, String cep, Candidatos candidatos) {
        this.idEnderecoCandidato = idEnderecoCandidato;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.candidatos = candidatos;
    }

    public Candidatos getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidatos candidatos) {
        this.candidatos = candidatos;
    }


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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
