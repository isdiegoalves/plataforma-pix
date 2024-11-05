package br.bancofamilia.pix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class PlataformaPixApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlataformaPixApplication.class, args);
    }

}