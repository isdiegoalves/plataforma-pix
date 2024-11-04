package br.bancoti.plataformapix.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "contas", schema = "pix")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    @Column(name = "saldo")
    private Float saldo;

    @Column(name = "agencia")
    private String agencia;

    @Column(name = "conta")
    private String conta;

    @Column(name = "instituicao")
    private String instituicao;

    @Column(name = "status")
    private String status;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "criado_em")
    private LocalDate criadoEm;

    @OneToMany(mappedBy = "contaPagador")
    private List<Transacao> transacoesPagador = new ArrayList<>();

    @OneToMany(mappedBy = "contaRecebedor")
    private List<Transacao> transacoesRecebedor = new ArrayList<>();

}