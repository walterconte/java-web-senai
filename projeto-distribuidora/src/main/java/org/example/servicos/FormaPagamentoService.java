package org.example.servicos;

import org.example.entidades.Cliente;
import org.example.entidades.FormaPagamento;
import org.example.repositorios.ClienteRepository;
import org.example.repositorios.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormaPagamentoService {

    @Autowired
    public FormaPagamentoRepository formaPagamentoRepository;

    public List<FormaPagamento> buscarTodos() {

        return formaPagamentoRepository.findAll();

    }

    public Optional<FormaPagamento> buscarPorId(Long id) {

        return formaPagamentoRepository.findById(id);

    }

    public FormaPagamento inserir(FormaPagamento formaPagamento) {

        return formaPagamentoRepository.save(formaPagamento);

    }

    public void deleteId(Long id) {

        formaPagamentoRepository.deleteById(id);

    }
}
