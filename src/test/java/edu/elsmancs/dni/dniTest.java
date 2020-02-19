package edu.elsmancs.dni;

import org.junit.Test;

import static org.junit.Assert.*;

public class dniTest {

    @Test
    public void constructorTest() {
        Dni dni = new Dni("01817200Q");
        assertEquals("01817200Q", dni.toString());
    }

    @Test
    public void getDniTest() {
        Dni dni = new Dni("01817200Q");
        assertEquals("01817200Q", dni.getDni());
    }

    @Test
    public void longDniTest() {
        Dni dni = new Dni("01817200Q");
        assertTrue(dni.checkDniLength());
    }

    @Test
    public void isDniTest() {
        Dni dni = new Dni("01817200Q");
        assertFalse(dni.isDniCifSano());
        assertFalse(dni.isLetraSana());
        assertFalse(dni.isNumeroSano());
    }

    @Test
    public void extrarNumeroDniTest() {
        Dni dni = new Dni("95447129G");
        assertEquals("95447129", dni.extraerParteNumericaDni());
    }

    @Test
    public void extrarLetraDniTest() {
        Dni dni = new Dni("95447129G");
        assertEquals("G", Character.toString(dni.extraerParteAlfabeticaDni()));
    }

    @Test
    public void isDniNumeroTest() {
        Dni dni = new Dni("36669249G");
        assertFalse(dni.isDniNumero("36669249G"));
    }

    @Test
    public void checkNumeroDniTest() {
        Dni dni = new Dni("56604086M");
        Dni dni2 = new Dni("83246188D");
        assertFalse(dni.checkNumeroDni());
        assertFalse(dni2.checkNumeroDni());
    }

    @Test
    public void obtenerLetra() {
        Dni dni = new Dni("83526188D");
        assertEquals("D",Character.toString(dni.obtenerLetra()));
    }
}