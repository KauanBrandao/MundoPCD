package com.projeto.mundopcd.application;

import com.projeto.mundopcd.controllers.requests.UsuarioRequest;
import com.projeto.mundopcd.models.PapelModels;
import com.projeto.mundopcd.models.UsuarioModels;
import com.projeto.mundopcd.repositories.JPA.PapelJPA;
import com.projeto.mundopcd.repositories.JPA.UsuarioJPA;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UsuarioApplication {
    private final UsuarioJPA usuarioRepository;
    private final PapelJPA papelRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public UsuarioApplication(UsuarioJPA usuarioRepository, PapelJPA papelRepository) {
        this.usuarioRepository = usuarioRepository;
        this.papelRepository = papelRepository;
    }

    public void cadastrar(UsuarioRequest usuarioRequest) {
        UsuarioModels usuario = new UsuarioModels(
                usuarioRequest.getUsuario(),
                usuarioRequest.getSenha());

        usuario.setSenha("{bcrypt}" + bCryptPasswordEncoder.encode(usuario.getSenha()));

        this.usuarioRepository.save(usuario);

        PapelModels papel = new PapelModels();
        papel.setPapel("ROLE_" + usuarioRequest.getPapel());
        papel.setIdPapel(usuario.getIdUsuario());

        this.papelRepository.save(papel);
    }
}
