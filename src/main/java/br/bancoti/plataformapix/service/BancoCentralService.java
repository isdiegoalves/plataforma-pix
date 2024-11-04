package br.bancoti.plataformapix.service;

import br.bancoti.plataformapix.client.BancoCentralClient;
import br.bancoti.plataformapix.vo.PIxKeyVo;
import org.springframework.stereotype.Service;

@Service
public class BancoCentralService {

    private final BancoCentralClient bancoCentralClient;

    public BancoCentralService(BancoCentralClient bancoCentralClient) {
        this.bancoCentralClient = bancoCentralClient;
    }

    public PIxKeyVo getPixKey(String chave) {
        var pixKeyDto = bancoCentralClient.getPixKey(chave);
        var pixData = pixKeyDto.data();

        return new PIxKeyVo(pixData.key(), pixData.type(), pixData.active());
    }

}
