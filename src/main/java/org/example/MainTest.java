package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest extends Main{

    @Test
    public void testeSoma(){
        Calculadora calculadora = new Calculadora();
        assertEquals(new BigDecimal(2).setScale(2, RoundingMode.DOWN), calculadora.soma(BigDecimal.ONE,BigDecimal.ONE) );
        assertEquals(new BigDecimal(0.39).setScale(2, RoundingMode.DOWN), calculadora.soma(new BigDecimal(0.1),new BigDecimal(0.3)) );
        assertEquals(new BigDecimal(3).setScale(2, RoundingMode.DOWN), calculadora.soma(new BigDecimal(-2),new BigDecimal(5)) );
        assertEquals(new BigDecimal(-10).setScale(2, RoundingMode.DOWN), calculadora.soma(new BigDecimal(-2),new BigDecimal(-8)) );
    }

    @Test
    public void testeSubtracao(){
        Calculadora calculadora = new Calculadora();
        assertEquals(new BigDecimal(5).setScale(2, RoundingMode.DOWN), calculadora.subtracao(new BigDecimal(10), new BigDecimal(5)) );
        assertEquals(new BigDecimal(-0.19).setScale(2, RoundingMode.DOWN), calculadora.subtracao(new BigDecimal(0.1),new BigDecimal(0.3)) );
        assertEquals(new BigDecimal(-7).setScale(2, RoundingMode.DOWN), calculadora.subtracao(new BigDecimal(-2),new BigDecimal(5)) );
        assertEquals(new BigDecimal(6).setScale(2, RoundingMode.DOWN), calculadora.subtracao(new BigDecimal(-2),new BigDecimal(-8)) );
    }

    @Test
    public void testeDivisaoComZero(){
        Calculadora calculadora = new Calculadora();
        assertEquals(new BigDecimal(0), calculadora.divisao(new BigDecimal(5), new BigDecimal(0)) );
    }

    @Test
    public void testeDivisao(){
        Calculadora calculadora = new Calculadora();
        assertEquals(new BigDecimal(0.33).setScale(2, RoundingMode.HALF_UP), calculadora.divisao(new BigDecimal(0.1),new BigDecimal(0.3)) );
        assertEquals(new BigDecimal(-0.4).setScale(1, RoundingMode.HALF_UP), calculadora.divisao(new BigDecimal(-2),new BigDecimal(5)) );
        assertEquals(new BigDecimal(0.25).setScale(2, RoundingMode.DOWN), calculadora.divisao(new BigDecimal(-2),new BigDecimal(-8)) );
    }

    @Test
    public void testeMultiplicacao(){
        Calculadora calculadora = new Calculadora();
        assertEquals(new BigDecimal(10), calculadora.multiplicacao(new BigDecimal(5), new BigDecimal(2)) );

    }


}
