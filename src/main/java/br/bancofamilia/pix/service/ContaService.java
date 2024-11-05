package br.bancofamilia.pix.service;

import br.bancofamilia.pix.dto.ContaDTO;
import br.bancofamilia.pix.entity.Conta;
import br.bancofamilia.pix.exception.ContaNaoEncontradaException;
import br.bancofamilia.pix.repository.ContaRepository;
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