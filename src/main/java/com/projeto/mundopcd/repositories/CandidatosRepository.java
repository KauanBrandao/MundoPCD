package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Candidatos;
import com.projeto.mundopcd.repositories.JPA.CandidatosJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CandidatosRepository {

    private final CandidatosJPA candidatosJpa;

    @Autowired
    public CandidatosRepository(CandidatosJPA candidatosJpa) {
        this.candidatosJpa = candidatosJpa;
    }

    public boolean existsById(int id) {
        return this.candidatosJpa.existsById(id);
    }

    public Candidatos buscarPorId(int id) {
        return this.candidatosJpa.findById(id).get();
    }

    public List<Candidatos> listar(){
        return this.candidatosJpa.findAll();
    }

    public Candidatos cadastrar(Candidatos candidato){
        return this.candidatosJpa.save(candidato);
    }

    public void atualizar(Candidatos candidato, int id){
        Candidatos candInDB = this.candidatosJpa.findById(id).get();

        candInDB.setNome(candidato.getNome());
        candInDB.setCpf(candidato.getCpf());
        candInDB.setTelefone(candidato.getTelefone());
        candInDB.setIdPlano(candidato.getIdPlano());
        candInDB.setEmail(candidato.getEmail());
        candInDB.setTipoDeficiencia(candidato.getTipoDeficiencia());
        candInDB.setExperiencia(candidato.getExperiencia());
        candInDB.setFormacao(candidato.getFormacao());
        candInDB.setHabilidades(candidato.getHabilidades());
        candInDB.setCurriculo(candidato.getCurriculo());
        candInDB.setIdPlano(candidato.getIdPlano());
        candInDB.setIdEnderecoCandidato(candidato.getIdEnderecoCandidato());
        this.candidatosJpa.save(candInDB);
    }

    public void deletar(int id){
        this.candidatosJpa.deleteById(id);
    }

}
