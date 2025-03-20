package com.projeto.mundopcd.repositories;

import com.projeto.mundopcd.models.Vagas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VagasRepository {

    private List<Vagas> vagas = new ArrayList<>();
    private int proximoId = 1;

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
        vaga.setIdVaga(proximoId++);
        vagas.add(vaga);
        return vaga;
    }

    public void deletar(int id) {
        if (existsById(id)) {
            vagas.removeIf(v-> v.getIdVaga() == id);
        }
    }

    public void atualizar(Vagas vaga, int id) {
        Vagas vagaAtual = buscarPorId(id);

        vagaAtual.setTitulo(vaga.getTitulo());
        vagaAtual.setDescricao(vaga.getDescricao());
        vagaAtual.setRequisitos(vaga.getRequisitos());
        vagaAtual.setSalario(vaga.getSalario());
        vagaAtual.setTipoContratacao(vaga.getTipoContratacao());
        vagaAtual.setLocalizacao(vaga.getLocalizacao());
        vagaAtual.setIdEmpresa(vaga.getIdEmpresa());
    }

}
