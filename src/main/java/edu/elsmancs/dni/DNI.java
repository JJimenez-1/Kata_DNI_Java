package edu.elsmancs.dni;

public class DNI {

    private final String dni;
    private final byte Longitud_DNI = 9;

    public DNI(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return this.dni;
    }

    @Override
    public String toString() {
        return getDni();
    }

    public Boolean checkDniLength() {
        return getDni().length() == Longitud_DNI;
    }
}
