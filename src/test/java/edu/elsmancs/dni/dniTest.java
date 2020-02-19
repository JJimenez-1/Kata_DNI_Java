package edu.elsmancs.dni;

import org.junit.Test;

import static org.junit.Assert.*;

public class dniTest {

    @Test
    public void constructorTest() {
        dni dni = new dni("01817200Q");
        assertEquals("01817200Q", dni.toString());
    }

    @Test
    public void getDniTest() {
        dni dni = new dni("01817200Q");
        assertEquals("01817200Q", dni.getDni());
    }

    @Test
    public void longDniTest() {
        dni dni = new dni("01817200Q");
        assertTrue(dni.checkDniLength());
    }

    @Test
    public void isDniTest() {
        dni dni = new dni("01817200Q");
        assertFalse(dni.isDniCifSano());
        assertFalse(dni.isLetraSana());
        assertFalse(dni.isNumeroSano());
    }

    @Test
    public void extrarNumeroDniTest() {
        dni dni = new dni("95447129G");
        assertEquals("95447129", dni.extraerParteNumericaDni());
    }

    @Test
    public void extrarLetraDniTest() {
        dni dni = new dni("95447129G");
        assertEquals("G", Character.toString(dni.extraerParteAlfabeticaDni()));
    }

    @Test
    public void isDniNumeroTest() {
        dni dni = new dni("36669249G");
        assertFalse(dni.isDniNumero("36669249G"));
    }

    @Test
    public void checkNumeroDniTest() {
        dni dni = new dni ("56604086M");
        dni dni2 = new dni("83246188D");
        assertFalse(dni.checkNumeroDni());
        assertFalse(dni2.checkNumeroDni());
    }

    @Test
    public void obtenerLetra() {
        dni dni = new dni("83526188D");
        assertEquals("D",Character.toString(dni.obtenerLetra()));
    }
}