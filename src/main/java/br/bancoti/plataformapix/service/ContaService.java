package br.bancoti.plataformapix.service;

import br.bancoti.plataformapix.dto.ContaDTO;
import br.bancoti.plataformapix.entity.Conta;
import br.bancoti.plataformapix.exception.ContaNaoEncontradaException;
import br.bancoti.plataformapix.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ContaService {

    private final ContaRepository contaRepository;

    @Autowired
    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public ContaDTO findContaById(UUID id) {
        Conta conta = contaRepository.findById(id)
                .orElseThrow(() -> new ContaNaoEncontradaException("Conta not found"));
        return new ContaDTO(conta.getId(), conta.getNomeCliente(), conta.getSaldo());
    }
}