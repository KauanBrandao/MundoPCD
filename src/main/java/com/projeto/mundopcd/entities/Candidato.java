package com.projeto.mundopcd.entities;

import com.projeto.mundopcd.models.CandidaturaModels;
import com.projeto.mundopcd.models.EnderecoCandidatoModels;
import com.projeto.mundopcd.models.PlanoModels;
import java.util.List;

public class Candidato {
    private int idCandidato;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String tipoDeficiencia;
    private String formacao;
    private String experiencia;
    private String habilidades;
    private String curriculo;
    private PlanoModels planoModels;
    private EnderecoCandidatoModels endereco;
    private Integer idEnderecoCandidato;
    private List<CandidaturaModels> candidaturaModels;

    public boolean isEmailValido() {
        String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email != null && email.matches(emailRegex);
    }

    public boolean isTelefoneValido() {
        String telefoneRegex = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$";
        return telefone != null && telefone.matches(telefoneRegex);
    }

    public void validar() {
        isEmailValido();
        isTelefoneValido();
        isCpfValido();
        isNomeValido();
        isCurriculoValido();
        isFormacaoValida();
        isTipoDeficienciaValido();
    }

    public Candidato(String tipoDeficiencia, String telefone, PlanoModels planoModels, String nome, Integer idEnderecoCandidato, int idCandidato, String habilidades, String formacao, String experiencia, EnderecoCandidatoModels endereco, String email, String curriculo, String cpf, List<CandidaturaModels> candidaturaModels) {
        this.tipoDeficiencia = tipoDeficiencia;
        this.telefone = telefone;
        this.planoModels = planoModels;
        this.nome = nome;
        this.idEnderecoCandidato = idEnderecoCandidato;
        this.idCandidato = idCandidato;
        this.habilidades = habilidades;
        this.formacao = formacao;
        this.experiencia = experiencia;
        this.endereco = endereco;
        this.email = email;
        this.curriculo = curriculo;
        this.cpf = cpf;
        this.candidaturaModels = candidaturaModels;
    }

    public Candidato() {
    }

    public boolean isCpfValido() {
        if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d+")) {
            return false;
        }
        int[] peso1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] peso2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        try {
            int soma1 = 0;
            int soma2 = 0;
            for (int i = 0; i < 9; i++) {
                int digito = Character.getNumericValue(cpf.charAt(i));
                soma1 += digito * peso1[i];
                soma2 += digito * peso2[i];
            }

            int digito1 = 11 - (soma1 % 11);
            digito1 = (digito1 > 9) ? 0 : digito1;

            soma2 += digito1 * peso2[9];
            int digito2 = 11 - (soma2 % 11);
            digito2 = (digito2 > 9) ? 0 : digito2;

            return digito1 == Character.getNumericValue(cpf.charAt(9)) &&
                    digito2 == Character.getNumericValue(cpf.charAt(10));
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            return false;
        }
    }

    public boolean isNomeValido() {
        String nomeRegex = "^[A-Za-zÀ-ú\\s]{2,}$";
        return nome != null && nome.matches(nomeRegex);
    }

    public boolean isCurriculoValido() {
        return curriculo != null && curriculo.length() <= 1000;
    }

    public boolean isFormacaoValida() {
        return formacao != null && !formacao.trim().isEmpty();
    }

    public boolean isTipoDeficienciaValido() {
        String[] tiposValidos = {"Física", "Auditiva", "Visual", "Intelectual", "Múltipla"};
        if (tipoDeficiencia == null) return false;
        for (String tipo : tiposValidos) {
            if (tipoDeficiencia.equalsIgnoreCase(tipo)) {
                return true;
            }
        }
        return false;
    }

    public List<CandidaturaModels> getCandidaturas() {
        return candidaturaModels;
    }

    public void setCandidaturas(List<CandidaturaModels> candidaturaModels) {
        this.candidaturaModels = candidaturaModels;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoCandidatoModels getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoCandidatoModels endereco) {
        this.endereco = endereco;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public Integer getIdEnderecoCandidato() {
        return idEnderecoCandidato;
    }

    public void setIdEnderecoCandidato(Integer idEnderecoCandidato) {
        this.idEnderecoCandidato = idEnderecoCandidato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PlanoModels getPlano() {
        return planoModels;
    }

    public void setPlano(PlanoModels planoModels) {
        this.planoModels = planoModels;
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

}
