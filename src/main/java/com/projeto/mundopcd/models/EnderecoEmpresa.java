package com.projeto.mundopcd.models;
import jakarta.persistence.*;

@Entity
@Table(name = "enderecos_empresas")
public class EnderecoEmpresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco_empresa")
    private int idEnderecoEmpresa;

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

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", insertable = false, updatable = false)
    private Empresa empresa;

    @Column(name = "id_empresa")
    private Integer idEmpresa;

    public EnderecoEmpresa(String cep, String cidade, Empresa empresa, String estado, String logradouro, String numero) {
        this.cep = cep;
        this.cidade = cidade;
        this.empresa = empresa;
        this.estado = estado;
        this.logradouro = logradouro;
        this.numero = numero;
    }


    public EnderecoEmpresa() {

    }

    public int getIdEnderecoEmpresa() {
        return idEnderecoEmpresa;
    }

    public void setIdEnderecoEmpresa(int idEnderecoEmpresa) {
        this.idEnderecoEmpresa = idEnderecoEmpresa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.logradouro = lagradouro;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresas() {
        return empresa;
    }

    public void setEmpresas(Empresa empresa) {
        this.empresa = empresa;
    }

}
