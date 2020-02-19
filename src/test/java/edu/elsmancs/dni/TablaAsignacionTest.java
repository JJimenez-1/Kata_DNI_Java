package edu.elsmancs.dni;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;


public class TablaAsignacionTest {

    private static TablaAsignacion tabla;

   @BeforeClass
   public static void crearTabla(){
       tabla = new TablaAsignacion();
   }
   @Test
    public void getLetraTablaAsgnacion() {
       assertEquals('T', tabla.getLetter(0));
       assertEquals('X', tabla.getLetter(10));
       assertEquals('E', tabla.getLetter(22));
   }

   @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getLetraFueraTablaAsignacion(){
       tabla.getLetter(100);
   }

   @Test
    public void getLetraCorrecta(){
       dni dni = new dni("40135330");
       assertEquals("40135330P", "40135330" + tabla.calcularLetra("40135330"));
   }
}
