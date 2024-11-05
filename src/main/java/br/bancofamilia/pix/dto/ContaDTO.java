package br.bancofamilia.pix.dto;

import java.util.UUID;

public record ContaDTO(UUID chavePix, String nomeCliente, Float saldo) {
}