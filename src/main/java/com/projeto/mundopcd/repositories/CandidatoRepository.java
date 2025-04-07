package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Candidato;
import com.projeto.mundopcd.models.EnderecoCandidato;
import com.projeto.mundopcd.repositories.JPA.CandidatoJPA;
import com.projeto.mundopcd.repositories.JPA.EnderecoCandidatoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class CandidatoRepository {

    private final CandidatoJPA candidatoJpa;
    private final EnderecoCandidatoJPA enderecoJPA;

    @Autowired
    public CandidatoRepository(CandidatoJPA candidatoJpa, EnderecoCandidatoJPA enderecoJPA) {
        this.candidatoJpa = candidatoJpa;
        this.enderecoJPA = enderecoJPA;
    }

    public boolean existsById(int id) {
        return this.candidatoJpa.existsById(id);
    }

    public Candidato buscarPorId(int id) {
        return this.candidatoJpa.findById(id).get();
    }

    public List<Candidato> listar(){
        return this.candidatoJpa.findAll();
    }

    public Candidato cadastrar(Candidato candidato) {
        if (candidato.getEndereco() != null && candidato.getEndereco().getIdEnderecoCandidato() != 0) {
            int idEndereco = candidato.getEndereco().getIdEnderecoCandidato();
            EnderecoCandidato enderecoCompleto = enderecoJPA.findById(idEndereco).orElse(null);
            candidato.setEndereco(enderecoCompleto);
        }
        return this.candidatoJpa.save(candidato);
    }

    public void atualizar(Candidato candidato, int id){
        Candidato candInDB = this.candidatoJpa.findById(id).get();

        candInDB.setNome(candidato.getNome());
        candInDB.setCpf(candidato.getCpf());
        candInDB.setTelefone(candidato.getTelefone());
        candInDB.setPlano(candidato.getPlano());
        candInDB.setEmail(candidato.getEmail());
        candInDB.setTipoDeficiencia(candidato.getTipoDeficiencia());
        candInDB.setExperiencia(candidato.getExperiencia());
        candInDB.setFormacao(candidato.getFormacao());
        candInDB.setHabilidades(candidato.getHabilidades());
        candInDB.setCurriculo(candidato.getCurriculo());
        candInDB.setIdCandidato(candidato.getIdCandidato());

        EnderecoCandidato novoEndereco = candidato.getEndereco();

        Optional<EnderecoCandidato> enderecoExistente = enderecoJPA
                .findByLogradouroAndNumeroAndCidadeAndEstadoAndCep(
                        novoEndereco.getLogradouro(),
                        novoEndereco.getNumero(),
                        novoEndereco.getCidade(),
                        novoEndereco.getEstado(),
                        novoEndereco.getCep()
                );

        EnderecoCandidato enderecoParaUsar = enderecoExistente
                .orElseGet(() -> enderecoJPA.save(novoEndereco));

        candInDB.setEndereco(enderecoParaUsar);

        this.candidatoJpa.save(candInDB);
    }


    public void deletar(int id){
        this.candidatoJpa.deleteById(id);
    }

}
