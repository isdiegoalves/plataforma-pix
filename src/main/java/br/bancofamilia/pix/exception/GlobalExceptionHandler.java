package br.bancofamilia.pix.exception;

import br.bancofamilia.pix.dto.response.ApiMessageErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ContaNaoEncontradaException.class)
    public ResponseEntity<ApiMessageErrorResponseDTO> handleContaNaoEncontradaException(ContaNaoEncontradaException ex) {
        ApiMessageErrorResponseDTO response = new ApiMessageErrorResponseDTO(
                List.of(new ApiMessageErrorResponseDTO.ApiMessageErrorDTO(HttpStatus.NOT_FOUND.value(), ex.getMessage()))
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}