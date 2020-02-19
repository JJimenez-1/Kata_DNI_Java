package edu.elsmancs.dni;

public class Dni {

    private final String dni;
    private Boolean numeroSano = false;
    private Boolean letraSana = false;
    private Boolean dniCifSano = false;
    private final byte Longitud_DNI = 9;
    private TablaAsignacion tabla = new TablaAsignacion();

    public Dni(String dni) {
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

    private void setNumeroSano(Boolean valor) {
        this.numeroSano = valor;
    }

    public Boolean isLetraSana() {
        return letraSana;
    }

    private void setLetraSana(Boolean valor) {
        this.letraSana = valor;
    }

    public Boolean isDniCifSano() {
        return dniCifSano;
    }

    private void setDniCifSano(Boolean valor) {
        this.dniCifSano = valor;
    }

    String extraerParteNumericaDni() {
        return (String) dni.substring(0, dni.length()- 1);
    }

    Character extraerParteAlfabeticaDni() {
        return dni.charAt(dni.length() - 1);
    }

    public Boolean checkDni() {
        setDniCifSano(checkNumeroDni() && checkLetra());
        return isDniCifSano();
    }
    public Boolean checkNumeroDni() {
        setDniCifSano(checkDniLength() && isDniNumero(extraerParteNumericaDni()));
        return isNumeroSano();
    }

    public Boolean checkLetra() {
        checkNumeroDni();
        if(isNumeroSano()) {
            setLetraSana(Character.isUpperCase(extraerParteAlfabeticaDni())
                    && checkLetraValida());
            return isLetraSana();
        } else {
            return false;
        }
    }
    Boolean isDniNumero(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                return false;
            }
        } return true;
    }

    public Character obtenerLetra() {
        checkNumeroDni();
        if (isNumeroSano()) {
            return getTablaAsignacion().calcularLetra(extraerParteNumericaDni());
        } else {
            return Character.MIN_VALUE;
        }
    }

    private Boolean checkLetraValida() {
        return extraerParteAlfabeticaDni() == obtenerLetra();
    }
}
