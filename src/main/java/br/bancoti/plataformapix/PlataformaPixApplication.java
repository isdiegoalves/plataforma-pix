package br.bancoti.plataformapix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class PlataformaPixApplication {

    private static final Logger log = LoggerFactory.getLogger(PlataformaPixApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PlataformaPixApplication.class, args);
    }

}