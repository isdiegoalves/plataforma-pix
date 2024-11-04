package br.bancoti.plataformapix.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "transacoes", schema = "pix")
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "valor")
    private Float valor;

    @Column(name = "status")
    private String status;

    @Column(name = "criado_em")
    private LocalDate criadoEm;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "chave_pagador")
    private Conta contaPagador;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "chave_recebedor")
    private Conta contaRecebedor;

    @Column(name = "fluxo_pagamento")
    private String fluxoPagamento;

    public enum FluxoPagamento {
        ENTRADA, SAIDA
    }
}