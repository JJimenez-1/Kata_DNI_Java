package edu.elsmancs.dni;

public class dni {

    private final String dni;
    private Boolean numeroSano = false;
    private Boolean letraSana = false;
    private Boolean dniCifSano = false;
    private final byte Longitud_DNI = 9;
    private TablaAsignacion tabla = new TablaAsignacion();

    public dni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return this.dni;
    }

    @Override
    public String toString() {
        return getDni();
    }

    private TablaAsignacion getTablaAsignacion(){
        return this.tabla;
    }


    public Boolean checkDniLength() {
        return getDni().length() == Longitud_DNI;
    }

    public Boolean isNumeroSano() {
        return numeroSano;
    }

    private void setNumeroSano(Boolean numeroSano) {
        this.numeroSano = numeroSano;
    }

    public Boolean isLetraSana() {
        return letraSana;
    }

    private void setLetraSana(Boolean letraSana) {
        this.letraSana = letraSana;
    }

    public Boolean isDniCifSano() {
        return dniCifSano;
    }

    private void setDniCifSano(Boolean dniCifSano) {
        this.dniCifSano = dniCifSano;
    }

    String extraerParteNumericaDni() {
        return (String) dni.substring(0, dni.length()- 1);
    }

    Character extraerParteAlfabeticaDni() {
        return dni.charAt(dni.length() - 1);
    }

    public Boolean checkNumeroDni() {
        setDniCifSano(checkDniLength() && isDniNumero(extraerParteNumericaDni()));
        return isNumeroSano();
    }
    Boolean isDniNumero(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                return false;
            }
        } return true;
    }

}
