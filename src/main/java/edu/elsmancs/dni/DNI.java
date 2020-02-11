package edu.elsmancs.dni;

public class DNI {

    private final String dni;
    private Boolean numeroCorrecto = false;
    private Boolean letraCorrecta = false;
    private Boolean dniCorrecto = false;
    private int Longitud_DNI = 9;

    public DNI(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return this.dni;
    }

    private void setNumeroCorrecto(Boolean valor) {
        this.numeroCorrecto = valor;
    }
    private Boolean getNumeroCorrecto() {
        return this.numeroCorrecto;
    }

    private void setLetraCorrecta(Boolean valor){
        this.letraCorrecta = valor;
    }
    private Boolean getLetraCorrecta() {
        return this.letraCorrecta;
    }
    private void setDniCorrecto(Boolean valor) {
        this.dniCorrecto = valor;
    }
    private Boolean getDniCorrecto() {
        return this.dniCorrecto;
    }

    @Override
    public String toString() {
        return getDni();
    }


}
