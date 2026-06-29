package raizes_backend.service;

import org.springframework.stereotype.Service;
import raizes_backend.entity.Usuario;
import raizes_backend.repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;


    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }


    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }


    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }


    public void excluirUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}