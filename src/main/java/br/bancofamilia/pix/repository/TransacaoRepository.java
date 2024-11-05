package br.bancofamilia.pix.repository;

import br.bancofamilia.pix.entity.Transacao;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface TransacaoRepository extends ListCrudRepository<Transacao, UUID> {
}