package edu.elsmancs.dni;

public class TablaAsignacion {
    private final char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M',
            'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'};

    TablaAsignacion() {};

    char calcularLetra(String DNI){
        int dni = Integer.parseInt(DNI);
        int posicion = dni % getModulo();
        return getLetter(posicion);
    }
    char getLetter(int posicion) throws ArrayIndexOutOfBoundsException {
        try{
            return this.tabla[posicion];
        }
        catch(ArrayIndexOutOfBoundsException exception){
            throw new ArrayIndexOutOfBoundsException(
                    "La posicion esta fuera de los limites de la tabla de asignacion"
            );
        }
    }


    private int getModulo(){
        return this.tabla.length;
    }

}
