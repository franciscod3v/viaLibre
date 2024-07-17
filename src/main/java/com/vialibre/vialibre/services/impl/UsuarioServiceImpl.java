package com.vialibre.vialibre.services.impl;

import com.vialibre.vialibre.models.Usuario;
import com.vialibre.vialibre.repositories.UsuarioRepository;
import com.vialibre.vialibre.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        usuario.setPassword(new BCryptPasswordEncoder(10).encode(usuario.getPassword())); //Aqui iria SpringSecurity
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuarioById(String id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    @Override
    public Usuario getUsuarioByDni(String dni) {
        return usuarioRepository.findByDni(dni);
    }
}
