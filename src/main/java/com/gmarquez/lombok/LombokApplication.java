package com.gmarquez.lombok;

import com.gmarquez.lombok.entities.Point;
import com.gmarquez.lombok.entities.Role;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class LombokApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(LombokApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LombokApplication.variablesValAndVar();
        LombokApplication.usandoBuilder();
        LombokApplication.ejemploConWith();
    }

    public static void variablesValAndVar() {
        log.info("=== Variables val and var ===");

        final String NOMBRE = "Gustavo";

        // val // Inferencia de tipos y crea una variable final
        val APELLIDO = "Marquez";

        // var // Inferencia de tipos y variable normal
        var edad = 26;

        log.info("Nombre: {}", NOMBRE);
        log.info("Apellido: {}", APELLIDO);
        log.info("Edad: {}", edad);
    }


    public static void usandoBuilder(){
        log.info("=== Usando Builder ===");

        // Usando Builder
        Role role = Role.builder()
                .id("1")
                .name("Administrador")
                .permission("permiso1").permission("permiso2")
                .build();

        log.info("Role: {}", role);
    }

    public static void ejemploConWith(){
        log.info("=== Ejemplo con With ===");

        // Usando With
        Point point = new Point(1, 2);
        Point point2 = point.withY(3);
        log.info("Point: {}", point);
        log.info("Point2: {}", point2);
    }
}
