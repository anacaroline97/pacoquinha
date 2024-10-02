package com.senac.u6.pacoquinha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.extensions.compactnotation.PackageCompactConstructor;

@SpringBootApplication
public class PacoquinhaApplication {

    public static void main(String[] args) {
        System.out.println("Eu sou a Ana");
        System.out.println("Minha segunda linha de codigo");
        SpringApplication.run(PacoquinhaApplication.class, args);
    }
}
