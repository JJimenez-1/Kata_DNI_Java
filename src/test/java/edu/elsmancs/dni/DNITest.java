package edu.elsmancs.dni;

import org.junit.Test;

import static org.junit.Assert.*;


public class DNITest {

    @Test
    public void checkLengthNumDni() {
        DNI dni = new DNI("01817200Q");
        assertEquals(9, dni.getDni().length());
        System.out.println(dni);
    }



}