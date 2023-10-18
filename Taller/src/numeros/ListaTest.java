package numeros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ListaTest {

    @Test
    public void testOrdenar() {
        int[] listaDesordenada = {3,1,4,6,2};
        int[] correcto = {1, 2, 3, 4,6};
        Lista.ordenar(listaDesordenada);
        assertArrayEquals(correcto, listaDesordenada);
    }

    @Test
    public void testBuscarExistente() {
        int[] lista = {3,1,4,6,2};
        int numero1 = 3;
        int numero2 = 6;
        assertTrue(Lista.buscar(lista, numero1));
        assertTrue(Lista.buscar(lista, numero2));
    }

    @Test
    public void testBuscarNoExistente() {
        int[] lista = {3,1,4,6,2};
        int numero = 5;
        assertFalse(Lista.buscar(lista, numero));
    }
}
