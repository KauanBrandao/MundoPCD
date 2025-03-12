package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Vagas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VagasRepository {

    private List<Vagas> vagas = new ArrayList<>();

    public boolean existsById(int id) {
        return vagas.stream().anyMatch(vaga -> vaga.getIdVaga() == id);
    }

    public Object buscarPorId(int id) {
        try {
            if (existsById(id)) {
                for (Vagas vaga : vagas) {
                    if (vaga.getIdVaga() == id) {
                        return vaga;
                    }
                }
            }
            return "Não existe vaga com o id " + id;
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    public List<Vagas> listar() {
        return vagas;
    }

    public Vagas cadastrar(Vagas vaga) {
        vagas.add(vaga);
        return vaga;
    }

    public void deletar(int id) {
        if (existsById(id)) {
            vagas.removeIf(vaga -> vaga.getIdVaga() == id);
        }
    }
}
