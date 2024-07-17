package com.vialibre.vialibre;

import com.vialibre.vialibre.models.Usuario;
import com.vialibre.vialibre.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ViaLibreApplication implements CommandLineRunner{

    private final UsuarioService usuarioService;

    public static void main(String[] args) {
        SpringApplication.run(ViaLibreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNombre("Francisco");
        usuario.setApellido("Palacios");
        usuario.setPassword("password");
        usuario.setCargo("administrador");
        usuario.setDni("72474320");
        usuarioService.saveUsuario(usuario);
    }

}
