package edu.elsmancs.dni;

public class DNI {

    private final String dni;
    private Boolean numeroSano = false;
    private int NumDividir = 23;

    public DNI(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return this.dni;
    }
}
