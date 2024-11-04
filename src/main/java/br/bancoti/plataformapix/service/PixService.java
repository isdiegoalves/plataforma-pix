package br.bancoti.plataformapix.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PixService {
    
    private final BancoCentralService bancoCentralService;

    public PixService(BancoCentralService bancoCentralService) {
        this.bancoCentralService = bancoCentralService;
    }

    public void receive(Map<String, Object> request) {
        var chavePIx = bancoCentralService.getPixKey((String) request.get("source_holder"));

        if (!chavePIx.active()) {
            throw new UnsupportedOperationException("Chave Pix inativa");
        }
        
    }
}
