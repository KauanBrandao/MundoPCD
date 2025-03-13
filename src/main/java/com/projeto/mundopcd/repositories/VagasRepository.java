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

    public Vagas buscarPorId(int id) {
        return vagas.stream().filter(vaga -> vaga.getIdVaga() == id)
                .findFirst()
                .orElse(null);
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

    public void atualizar(Vagas vaga) {
        for (Vagas v : vagas) {
            if (v.getIdVaga() == vaga.getIdVaga()) {
                v.setTitulo(vaga.getTitulo());
                v.setDescricao(vaga.getDescricao());
                v.setRequisitos(vaga.getRequisitos());
                v.setSalario(vaga.getSalario());
                v.setTipoContratacao(vaga.getTipoContratacao());
                v.setLocalizacao(vaga.getLocalizacao());
                v.setIdEmpresa(vaga.getIdEmpresa());
            }
        }
    }

}
