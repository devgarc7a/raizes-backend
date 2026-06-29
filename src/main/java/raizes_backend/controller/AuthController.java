package raizes_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.Usuario;
import raizes_backend.repository.UsuarioRepository;
import raizes_backend.service.JwtService;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UsuarioRepository usuarioRepository;
    private final JwtService jwtService;

    public AuthController(
            UsuarioRepository usuarioRepository,
            JwtService jwtService
    ) {
        this.usuarioRepository = usuarioRepository;
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(
            @RequestBody Usuario usuarioLogin
    ) {

        // Procura o usuário pelo e-mail informado
        Optional<Usuario> usuario =
                usuarioRepository.findByEmail(
                        usuarioLogin.getEmail()
                );

        if (usuario.isPresent()
                && usuario.get()
                .getSenha()
                .equals(usuarioLogin.getSenha())) {

            // Gera o token JWT
            String token =
                    jwtService.gerarToken(
                            usuario.get().getEmail()
                    );

            return ResponseEntity.ok(
                    new TokenResponse(token)
            );
        }

        return ResponseEntity
                .status(401)
                .body("E-mail ou senha inválidos.");
    }

    public record TokenResponse(String token) {
    }
}