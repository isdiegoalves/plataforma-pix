package br.bancoti.plataformapix.dto;

import java.util.UUID;

public record ContaDTO(UUID chavePix, String nomeCliente, Float saldo) {
}