package org.example.recursos;


import org.example.entidades.FormaPagamento;
import org.example.servicos.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/formas_pagamento")
public class FormaPagamentoResource {

    @Autowired
    private FormaPagamentoService formaPagamentoService;

    @GetMapping
    public List<FormaPagamento> findAll() {

        return formaPagamentoService.buscarTodos();

    }

    @GetMapping("/{id}")
    public ResponseEntity<FormaPagamento> findAll(@PathVariable Long id) {

        return formaPagamentoService.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());

    }

    @PostMapping
    public FormaPagamento create(@RequestBody FormaPagamento formaPagamento) {

        return formaPagamentoService.inserir(formaPagamento);

    }

    @PutMapping("/{id}")
    public ResponseEntity<FormaPagamento> Update(@PathVariable Long id, @RequestBody FormaPagamento formaPagamento) {

        return formaPagamentoService.buscarPorId(id).map(existingFormaPagamento -> {
            formaPagamento.setIdPagamento(existingFormaPagamento.getIdPagamento());

            return ResponseEntity.ok(formaPagamentoService.inserir(formaPagamento));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {

        return formaPagamentoService.buscarPorId(id).map(existingFormaPagamento -> {
                    formaPagamentoService.deleteId(id);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());

    }

}
