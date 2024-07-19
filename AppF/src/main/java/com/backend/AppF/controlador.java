package com.backend.AppF;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class controlador{
        @GetMapping
        public String Comienzo() {
            log.info("Estoy ejecutando el controlador MVC");
        return "indice";
    }
}
