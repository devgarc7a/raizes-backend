package raizes_backend.service;

import org.springframework.stereotype.Service;
import raizes_backend.entity.Cliente;
import raizes_backend.repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }


    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }


    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }


    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}