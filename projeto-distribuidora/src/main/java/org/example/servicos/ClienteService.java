package org.example.servicos;

import org.example.entidades.Cliente;
import org.example.entidades.Produto;
import org.example.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    public ClienteRepository clienteRepository;

    public List<Cliente> buscarTodos() {

        return clienteRepository.findAll();

    }

    public Optional<Cliente> buscarPorId(Long id) {

        return clienteRepository.findById(id);

    }

    public Cliente inserir(Cliente cliente) {

        return clienteRepository.save(cliente);

    }

    public void deleteId(Long id) {

        clienteRepository.deleteById(id);

    }

    public Cliente atualizar(Long id, Cliente clienteAtualizado){

        return clienteRepository.findById(id).map(cliente -> {cliente.setNomeCliente(clienteAtualizado.getNomeCliente());
            cliente.setCpfCliente(clienteAtualizado.getCpfCliente());
            cliente.setCepCliente(clienteAtualizado.getCepCliente());
            cliente.setContato(clienteAtualizado.getContato());
            return clienteRepository.save(cliente);
        }).orElseThrow(() -> new RuntimeException("Cliente não encontrado com ID" + id));
    }
}
