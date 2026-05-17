package clases;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuenoTest {

    @Test
    public void testGettersAndSetters() {
        Dueno dueno = new Dueno();
        dueno.setIdentificacion("999");
        dueno.setNombre("Carlos Díaz");
        dueno.setTelefono("3009998888");
        dueno.setDireccion("Zona 3");

        assertEquals("999", dueno.getIdentificacion());
        assertEquals("Carlos Díaz", dueno.getNombre());
        assertEquals("3009998888", dueno.getTelefono());
        assertEquals("Zona 3", dueno.getDireccion());
    }
}
