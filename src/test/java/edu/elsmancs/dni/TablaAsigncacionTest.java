package edu.elsmancs.dni;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
public class TablaAsigncacionTest {

    private static TablaAsignacion tabla;
    private static final char[] letrasNoPermitidas = {'I', 'Ñ', 'O', 'U'};

   @BeforeClass
   public static void crearTabla(){
       tabla = new TablaAsignacion();
   }

   @Test
    public void getLetraTableAsgnicacion() {
       assertEquals('T', tabla.getLetra(0));
   }
}
