package edu.elsmancs.dni;

import org.junit.Test;

import static org.junit.Assert.*;

public class DNITest {

    @Test
    public void checkLengthNumDni() {
        DNI dni = new DNI("01817200Q");
        assertTrue(dni.checkDniLength());
        System.out.println(dni);
    }
}