package br.bancoti.plataformapix.repository;

import br.bancoti.plataformapix.entity.Transacao;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface TransacaoRepository extends ListCrudRepository<Transacao, UUID> {
}