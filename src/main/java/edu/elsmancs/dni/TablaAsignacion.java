package edu.elsmancs.dni;

public class TablaAsignacion {
    private final char[] abecedario = {'T', 'R', 'W', 'A', 'G', 'M',
            'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'};

    TablaAsignacion() {};

    char calcularLetra(String DNI){
        int dni = Integer.parseInt(DNI);
        int posicion = dni % getModulo();
        return getLetter
    }
    /**
    char getLetter(int posicion)
    private int getModulo(){
        return this.abecedario.length;
    }
     */
}
