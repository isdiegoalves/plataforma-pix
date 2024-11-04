package br.bancoti.plataformapix.client;

import br.bancoti.plataformapix.dto.response.PixKeyResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "bancocentral-api", url = "${bancocentral-api.url}")
public interface BancoCentralClient {

    @GetMapping("/v1/chaves")
    PixKeyResponseDTO getPixKey(@RequestParam("chaveId") String chave);

}
