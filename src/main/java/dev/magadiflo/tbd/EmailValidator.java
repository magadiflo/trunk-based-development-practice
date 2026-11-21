package dev.magadiflo.tbd;

public class EmailValidator {

    private static final String REGEX = "^[A-Za-z0-9._]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    public boolean esValido(String email) {
        return email != null && email.matches(REGEX);
    }

}
