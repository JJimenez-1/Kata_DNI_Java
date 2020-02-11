package edu.elsmancs.dni;

public class DNI {

    private final String dni;
    private final byte Longitud_DNI = 9;
    private TablaAsignacion tabla = new TablaAsignacion();

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

    private TablaAsignacion getTablaAsignacion(){
        return this.tabla;
    }


    public Boolean checkDniLength() {
        return getDni().length() == Longitud_DNI;
    }
}
