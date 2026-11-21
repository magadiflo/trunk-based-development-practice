package dev.magadiflo.tbd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmailValidatorTest {

    private final EmailValidator validator = new EmailValidator();

    @Test
    void aceptaEmailSimple() {
        assertThat(this.validator.esValido("magadiflo@example.com")).isTrue();
    }

    @Test
    void rechazaEmailSinArroba() {
        assertThat(this.validator.esValido("magadiflo.example.com")).isFalse();
    }

    @Test
    void rechazaEmailNulo() {
        assertThat(this.validator.esValido(null)).isFalse();
    }
}
