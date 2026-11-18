package dev.magadiflo.tbd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping(path = "/api/saludo")
    public String saludo() {
        return "Hola";
    }
}
