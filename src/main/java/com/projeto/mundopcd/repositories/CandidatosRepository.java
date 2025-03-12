package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Candidatos;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CandidatosRepository {

    private List<Candidatos> candidatos = new ArrayList<Candidatos>();

    public boolean existsById(int id) {
        if(candidatos.get(id) != null) {
            return true;
        }else {
            return false;
        }
    }

    public Object buscarPorId(int id) {
        try{
            if(candidatos.get(id) != null) {
                return "Não existe um candidato cadastrado com o id " + id;
            }else{
                return existsById(id);
            }
        } catch(Exception e){
            return "Erro: " + e.getMessage();
        }
    }

    public List listar(){
        return candidatos;
    }

    public Candidatos cadastrar(Candidatos candidato){
        candidatos.add(candidato);
        return candidato;
    }

    public void atualizar(Candidatos candidato){
        for(Candidatos candidatos: candidatos) {
            candidatos.setNome(candidato.getNome());
            candidatos.setEmail(candidato.getEmail());
            candidatos.setTelefone(candidato.getTelefone());
            candidatos.setTipoDeficiencia(candidato.getTipoDeficiencia());
            candidatos.setFormacao(candidato.getFormacao());
            candidatos.setExperiencia(candidato.getExperiencia());
            candidatos.setHabilidades(candidato.getHabilidades());
            candidatos.setCurriculo(candidato.getCurriculo());
            candidatos.setIdPlano(candidato.getIdPlano());
            candidatos.setIdEnderecoCandidato(candidato.getIdEnderecoCandidato());
        }
    }

    public void deletar(int id){
        candidatos.remove(id);
    }

}
