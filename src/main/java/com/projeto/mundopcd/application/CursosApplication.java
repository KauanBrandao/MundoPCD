package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.Cursos;
import com.projeto.mundopcd.repositories.CursosRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CursosApplication {

    private CursosRepository cursosRepository;

    public CursosApplication(CursosRepository cursosRepository) {
        this.cursosRepository = cursosRepository;
    }

    public List listar() {
        return cursosRepository.listar();
    }

    public Object buscarPorId(int id) {
        return cursosRepository.buscarPorId(id);
    }

    public Cursos cadastrar(Cursos curso){
        return cursosRepository.cadastrar(curso);
    }

    public void atualizar(Cursos curso){
        cursosRepository.atualizar(curso);
    }

    public String deletar(int id){
        return cursosRepository.deletar(id);
    }
}
