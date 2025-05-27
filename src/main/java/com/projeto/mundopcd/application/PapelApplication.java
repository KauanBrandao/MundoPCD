package com.projeto.mundopcd.application;

import com.projeto.mundopcd.models.UsuarioModels;
import com.projeto.mundopcd.repositories.JPA.UsuarioJPA;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PapelApplication {
    private final UsuarioJPA usuarioRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public PapelApplication(UsuarioJPA usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void cadastrar(UsuarioModels usuario) {
        usuario.setSenha("{bcrypt}" + bCryptPasswordEncoder.encode(usuario.getSenha()));

        this.usuarioRepository.save(usuario);
    }
}
