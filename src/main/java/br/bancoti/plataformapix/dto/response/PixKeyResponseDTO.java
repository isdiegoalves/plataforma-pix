package br.bancoti.plataformapix.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record PixKeyResponseDTO(
        @JsonProperty("data") Data data
) {
    public record Data(
            @JsonProperty("chave") String key,
            @JsonProperty("tipo") String type,
            @JsonProperty("ativa") Boolean active,
            @JsonProperty("created_at") LocalDateTime createdAt
    ) {
    }
};