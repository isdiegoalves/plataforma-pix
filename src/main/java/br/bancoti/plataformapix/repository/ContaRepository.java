package br.bancoti.plataformapix.repository;

import br.bancoti.plataformapix.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface ContaRepository extends JpaRepository<Conta, UUID> {
}