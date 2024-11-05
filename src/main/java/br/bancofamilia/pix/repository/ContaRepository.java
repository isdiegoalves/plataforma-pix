package br.bancofamilia.pix.repository;

import br.bancofamilia.pix.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContaRepository extends JpaRepository<Conta, UUID> {
}