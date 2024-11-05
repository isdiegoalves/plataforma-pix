package br.bancofamilia.pix.controller;

import br.bancofamilia.pix.dto.ContaDTO;
import br.bancofamilia.pix.service.ContaService;
import br.bancofamilia.pix.service.PixService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping
public class PixController {

    private static final Logger log = LoggerFactory.getLogger(PixController.class);

    private final PixService pixService;
    private final ContaService contaService;


    public PixController(PixService pixService, ContaService contaService) {
        this.pixService = pixService;
        this.contaService = contaService;
    }

    @PostMapping("/v1/pix/receive")
    public ResponseEntity<String> receive(@RequestBody Map<String, Object> request) {
        pixService.receive(request);
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/v1/conta/{id}/saldo")
    public ResponseEntity<ContaDTO> getContaSaldo(@PathVariable UUID id) {
        ContaDTO contaDTO = contaService.findContaById(id);
        return ResponseEntity.ok(contaDTO);
    }
}