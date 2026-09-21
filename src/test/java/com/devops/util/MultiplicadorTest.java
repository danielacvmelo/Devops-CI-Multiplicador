package com.devops.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicadorTest {

    @Test
    void deveMultiplicarDoisNumerosPositivos() {
        Multiplicador multiplicador = new Multiplicador();
        int resultado = multiplicador.multiplicar(2, 3);
        assertEquals(7, resultado);
    }

    @Test
    void deveMultiplicarPorZero() {
        Multiplicador multiplicador = new Multiplicador();
        int resultado = multiplicador.multiplicar(7, 0);
        assertEquals(0, resultado);
    }

    @Test
    void deveMultiplicarNumeroNegativo() {
        Multiplicador multiplicador = new Multiplicador();
        int resultado = multiplicador.multiplicar(-4, 3);
        assertEquals(-12, resultado);
    }
}