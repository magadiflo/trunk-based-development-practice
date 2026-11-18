package dev.magadiflo.tbd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SaludoControllerTest {
    @Test
    void saludoRetornaHola() {
        assertThat(new SaludoController().saludo())
                .isEqualTo("Hola");
    }
}
