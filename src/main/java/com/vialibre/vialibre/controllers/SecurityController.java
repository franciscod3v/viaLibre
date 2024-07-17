package com.vialibre.vialibre.controllers;

import com.vialibre.vialibre.models.Usuario;
import com.vialibre.vialibre.security.UserLogin;
import com.vialibre.vialibre.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/token")
@RequiredArgsConstructor
public class SecurityController {
    private final JwtEncoder jwtEncoder;
    private final UsuarioService usuarioService;

    @PostMapping
    public String token(@RequestBody UserLogin userLogin) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        Usuario usuario = usuarioService.getUsuarioByDni(userLogin.getDni());
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        if (encoder.matches(userLogin.getPassword(), usuario.getPassword())) {
            Instant now = Instant.now();
            long expiry = 36000L;
            JwtClaimsSet claims = JwtClaimsSet.builder()
                    .issuer("App-vialibre")
                    .issuedAt(now)
                    .expiresAt(now.plusSeconds(expiry))
                    .subject(usuario.getNombre() + " " + usuario.getApellido())
                    .claim("scope", usuario.getCargo())
                    .claim("userId", usuario.getId())
                    .claim("cargo", usuario.getCargo())
                    .build();
            return this.jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
        }
        throw new UsernameNotFoundException("Credenciales incorrectas");
    }
}
