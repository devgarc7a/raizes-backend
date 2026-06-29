package raizes_backend.controller;

import org.springframework.web.bind.annotation.*;
import raizes_backend.entity.Usuario;
import raizes_backend.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;


    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarUsuarios();
    }


    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }


    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        usuarioService.excluirUsuario(id);
    }
}