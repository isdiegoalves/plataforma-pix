package br.bancoti.plataformapix.dto.response;

import java.util.List;

public record ApiMessageErrorResponseDTO(List<ApiMessageErrorDTO> errors) {
    public record ApiMessageErrorDTO(int code, String message) {
    }
}