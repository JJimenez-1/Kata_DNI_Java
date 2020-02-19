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

    public void setNumeroSano(Boolean numeroSano) {
        this.numeroSano = numeroSano;
    }

    public Boolean isLetraSana() {
        return letraSana;
    }

    public void setLetraSana(Boolean letraSana) {
        this.letraSana = letraSana;
    }

    public Boolean isDniCifSano() {
        return dniCifSano;
    }

    public void setDniCifSano(Boolean dniCifSano) {
        this.dniCifSano = dniCifSano;
    }
}
