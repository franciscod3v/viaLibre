package com.vialibre.vialibre.services;

import com.vialibre.vialibre.models.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario saveUsuario(Usuario usuario);
    List<Usuario> getAllUsuarios();
    Usuario getUsuarioById(String id);

    Usuario getUsuarioByDni(String dni);
}
