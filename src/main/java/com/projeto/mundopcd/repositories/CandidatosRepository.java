package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Candidatos;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CandidatosRepository {

    private List<Candidatos> candidatos = new ArrayList<Candidatos>();
    private int proximoId = 1;

    public boolean existsById(int id) {
        if(candidatos.get(id) != null) {
            return true;
        }else {
            return false;
        }
    }

    public Candidatos buscarPorId(int id) {
        Candidatos candidato = candidatos
                .stream()
                .filter(p -> p.getIdCandidato() == id)
                .findFirst()
                .get();

        return candidato;
    }

    public List listar(){
        return candidatos;
    }

    public Candidatos cadastrar(Candidatos candidato){
        candidato.setIdCandidato(proximoId++);
        candidatos.add(candidato);
        return candidato;
    }

    public void atualizar(Candidatos candidato, int id){
        Candidatos candidatoAtual = buscarPorId(id);

        candidatoAtual.setNome(candidato.getNome());
        candidatoAtual.setEmail(candidato.getEmail());
        candidatoAtual.setTelefone(candidato.getTelefone());
        candidatoAtual.setTipoDeficiencia(candidato.getTipoDeficiencia());
        candidatoAtual.setFormacao(candidato.getFormacao());
        candidatoAtual.setExperiencia(candidato.getExperiencia());
        candidatoAtual.setHabilidades(candidato.getHabilidades());
        candidatoAtual.setCurriculo(candidato.getCurriculo());
        candidatoAtual.setIdPlano(candidato.getIdPlano());
        candidatoAtual.setIdEnderecoCandidato(candidato.getIdEnderecoCandidato());
    }

    public void deletar(int id){
        candidatos.removeIf(p -> p.getIdCandidato() == id);
    }

}
