package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Candidato;
import com.projeto.mundopcd.repositories.JPA.CandidatoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CandidatoRepository {

    private final CandidatoJPA candidatoJpa;

    @Autowired
    public CandidatoRepository(CandidatoJPA candidatoJpa) {
        this.candidatoJpa = candidatoJpa;
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

    public Candidato cadastrar(Candidato candidato){
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
        this.candidatoJpa.save(candInDB);
    }

    public void deletar(int id){
        this.candidatoJpa.deleteById(id);
    }

}
